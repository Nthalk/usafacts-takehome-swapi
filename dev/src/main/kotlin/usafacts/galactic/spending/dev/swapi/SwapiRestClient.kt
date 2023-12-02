package usafacts.galactic.spending.dev.swapi

import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.boot.web.client.RestTemplateBuilder

class SwapiRestClient {
    data class Client(
        val name: String,
        val baseUrl: String,
        val jsonSchemaUrl: String
    )

    class Clients {
        val clients = mutableListOf<Client>()

        @JsonAnySetter
        fun addClient(name: String, url: String) {
            clients.add(Client(name, url, "$url/schema"))
        }
    }

    val client by lazy {
        RestTemplateBuilder()
            .defaultHeader("Accept", "application/json")
            .build()
    }

    val clients by lazy {
        val root = client.getForObject(
            "https://swapi.dev/api",
            String::class.java
        )
        ObjectMapper().readValue(root, Clients::class.java).clients
    }

    fun getJsonSchemaUrls(): List<String> {
        return clients.map { it.jsonSchemaUrl }
    }
}
