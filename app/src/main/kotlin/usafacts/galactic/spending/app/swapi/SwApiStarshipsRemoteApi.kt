package usafacts.galactic.spending.app.swapi

import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.service.annotation.GetExchange
import org.springframework.web.service.annotation.HttpExchange


@HttpExchange(
    url = "https://swapi.dev/api/starships/",
    accept = ["application/json"],
)
interface SwApiStarshipsRemoteApi {
    data class Page(
        val count: Int,
        val next: String?,
        val previous: String?,
        val results: List<Starship>?,
    )

    data class Starship(
        val name: String,
        val model: String,
        val manufacturer: String,
        @JsonProperty("cost_in_credits")
        val costInCredits: String?,
        val length: String,
        @JsonProperty("max_atmosphering_speed")
        val maxAtmospheringSpeed: String?,
        val crew: String,
        val passengers: String,
        @JsonProperty("cargo_capacity")
        val cargoCapacity: String?,
        val consumables: String,
        @JsonProperty("hyperdrive_rating")
        val hyperdriveRating: String?,
        @JsonProperty("MGLT")
        val MGLT: String,
        @JsonProperty("starship_class")
        val starshipClass: String?,
        val pilots: List<String>,
        val films: List<String>,
        val created: String,
        val edited: String,
        val url: String,
    )

    @GetExchange
    fun list(
        @RequestParam(required = false) search: String? = null,
        @RequestParam(required = false) page: Int? = null,
    ): Page

    @GetExchange(url = "https://swapi.dev/api/starships/{id}/")
    fun show(@PathVariable id: String): Starship
}
