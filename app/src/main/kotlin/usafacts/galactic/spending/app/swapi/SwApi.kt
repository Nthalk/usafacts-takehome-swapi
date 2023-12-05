package usafacts.galactic.spending.app.swapi

import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Service
import org.springframework.web.client.RestClient
import org.springframework.web.client.support.RestClientAdapter
import org.springframework.web.service.invoker.HttpServiceProxyFactory

@Service
class SwApi(
    val restTemplateBuilder: RestTemplateBuilder
) {
    val client by lazy {
        val template = restTemplateBuilder.build()
        RestClient.create(template)
    }

    @Bean
    fun starships() = HttpServiceProxyFactory.builder()
        .exchangeAdapter(RestClientAdapter.create(client))
        .build()
        .createClient(SwApiStarshipsRemoteApi::class.java)
}
