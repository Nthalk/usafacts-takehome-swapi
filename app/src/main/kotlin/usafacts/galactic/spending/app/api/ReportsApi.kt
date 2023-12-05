package usafacts.galactic.spending.app.api

import org.jooq.DSLContext
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import usafacts.galactic.spending.db.Tables
import usafacts.galactic.spending.db.Tables.SWAPI_STARSHIP
import java.math.BigDecimal

@RestController
@RequestMapping("/api/reports")
class ReportsApi(val db: DSLContext) {

    data class StarshipReport(
        val starships: List<Starship>,
        val episodes: List<Episode>,
    ) {
        data class Starship(
            val firstEpisodeSeenIn: Int,
            val episodesSeenIn: Int,
            val cargoCapacity: BigDecimal?,
            val starshipClass: String,
            val costInCredits: BigDecimal?,
            val length: BigDecimal,
            val name: String
        )

        data class Episode(
            val episode: Int,
            val totalShips: Int,
            val totalCost: BigDecimal,
            val totalLength: BigDecimal,
            val totalCargoCapacity: BigDecimal?,
            val avgCost: BigDecimal,
            val avgAverageLength: BigDecimal,
            val avgAverageCargoCapacity: BigDecimal,
            val avgCostPerLength: BigDecimal,
            val avgCostPerCargoSize: BigDecimal,
        )
    }

    @PostMapping("/starship")
    fun starships(): StarshipReport {
        return StarshipReport(
            episodes = db.fetch(Tables.EPISODE_STAT).map { r ->
                StarshipReport.Episode(
                    episode = r.episode,
                    totalShips = r.totalShips,
                    totalCost = r.totalCost,
                    totalLength = r.totalLength,
                    totalCargoCapacity = r.totalCargoCapacity,
                    avgCost = r.avgCost,
                    avgAverageLength = r.avgAverageLength,
                    avgAverageCargoCapacity = r.avgAverageCargoCapacity,
                    avgCostPerLength = r.avgCostPerLength,
                    avgCostPerCargoSize = r.avgCostPerCargoSize,
                )
            },
            starships = db.fetch(SWAPI_STARSHIP).map { r ->
                StarshipReport.Starship(
                    firstEpisodeSeenIn = r.firstSeenInEpisode,
                    name = r.name,
                    episodesSeenIn = r.episodeSpan,
                    cargoCapacity = r.cargoCapacity,
                    starshipClass = r.starshipClass,
                    costInCredits = r.costInCredits,
                    length = r.length,
                )
            },
        )
    }

}
