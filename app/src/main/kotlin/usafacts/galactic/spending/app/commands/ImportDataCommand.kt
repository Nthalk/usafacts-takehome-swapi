package usafacts.galactic.spending.app.commands

import com.github.ajalt.clikt.core.CliktCommand
import jakarta.annotation.PostConstruct
import org.jooq.DSLContext
import org.slf4j.LoggerFactory
import org.springframework.boot.SpringApplication
import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression
import org.springframework.stereotype.Service
import usafacts.galactic.spending.app.WebApp
import usafacts.galactic.spending.app.swapi.SwApiStarships
import usafacts.galactic.spending.db.Tables
import java.math.BigDecimal
import java.time.OffsetDateTime

@Service
@ConditionalOnExpression("'\${__command.import-data}' == 'true'")
class ImportDataService(
    val swApiStarships: SwApiStarships,
    val db: DSLContext
) {
    companion object {
        val LOG = LoggerFactory.getLogger(ImportDataService::class.java)
    }

    @PostConstruct
    fun run() {
        var page = swApiStarships.list()
        storePage(page)
        while (page.hasNext) {
            page = swApiStarships.list(page.search, page.page + 1)
            storePage(page)
        }
    }

    fun convertToBigDecimalOrNull(value: String?): BigDecimal? {
        if (value == null) return null
        if (value.isBlank()) return null
        if (value == "unknown") return null
        val cleaned = value.replace(",", "")
        val decimal = cleaned.toBigDecimalOrNull()
        if (decimal != null) return decimal
        LOG.error("Could not convert $value to BigDecimal")
        return null
    }

    fun storePage(page: SwApiStarships.Page) {
        if (page.results == null) return
        page.results.forEach {
            val rec = db.newRecord(Tables.SWAPI_STARSHIP)
            // "https://swapi.dev/api/starships/9/"
            rec.starshipId = it.url.split("/").last { it.isNotBlank() }.toInt()
            rec.name = it.name
            rec.model = it.model
            rec.manufacturer = it.manufacturer
            // cost in credits can sometimes have commas in it
            rec.costInCredits = convertToBigDecimalOrNull(it.costInCredits)
            rec.length = convertToBigDecimalOrNull(it.length)
            rec.maxAtmospheringSpeed = it.maxAtmospheringSpeed
            rec.crew = it.crew
            rec.passengers = it.passengers
            rec.cargoCapacity = convertToBigDecimalOrNull(it.cargoCapacity)
            rec.consumables = it.consumables
            rec.hyperdriveRating = it.hyperdriveRating
            rec.mglt = it.MGLT
            rec.starshipClass = it.starshipClass
            rec.created = OffsetDateTime.parse(it.created).toLocalDateTime()
            rec.edited = OffsetDateTime.parse(it.edited).toLocalDateTime()
            rec.url = it.url
            rec.episodeSpan = it.films.size
            rec.firstSeenInEpisode = it.films.minOf { film -> film.split("/").last { it.isNotBlank() }.toInt() }
            rec.store()
            it.films.forEach { film ->
                val filmRec = db.newRecord(Tables.SWAPI_STARSHIP_FILM)
                filmRec.starshipId = rec.starshipId
                filmRec.filmId = film.split("/").last { it.isNotBlank() }.toInt()
                filmRec.store()
            }
        }
    }
}

class ImportDataCommand : CliktCommand() {
    companion object {
        fun enable() {
            System.setProperty("__command.import-data", "true")
        }
    }

    override fun run() {
        enable()
        System.setProperty("spring.main.web-application-type", "NONE")
        SpringApplication(WebApp::class.java).apply {
            webApplicationType = WebApplicationType.NONE
        }.run()
    }
}
