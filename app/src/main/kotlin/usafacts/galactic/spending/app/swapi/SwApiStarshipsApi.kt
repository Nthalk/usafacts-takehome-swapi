package usafacts.galactic.spending.app.swapi

import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service

@Service
class SwApiStarships(
    val remoteApi: SwApiStarshipsRemoteApi,
) {
    data class Page(
        val page: Int,
        val search: String?,
        val count: Int,
        val results: List<SwApiStarshipsRemoteApi.Starship>?,
        val hasNext: Boolean,
    )

    @Cacheable("starships.list")
    fun list(
        search: String? = null,
        page: Int? = null,
    ): Page {
        val res = remoteApi.list(search, page)
        return Page(
            page = page ?: 1,
            search = search,
            count = res.count,
            results = res.results,
            hasNext = res.next != null && res.results != null,
        )
    }

    fun show(id: String) = remoteApi.show(id)
}
