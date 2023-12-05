package usafacts.galactic.spending.app.config

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.context.annotation.Configuration
import org.springframework.core.io.ClassPathResource
import org.springframework.core.io.Resource
import org.springframework.http.converter.HttpMessageConverter
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import org.springframework.web.servlet.resource.EncodedResourceResolver
import org.springframework.web.servlet.resource.PathResourceResolver

@Configuration
@EnableWebMvc
@ConditionalOnProperty("spring.main.web-application-type", havingValue = "SERVLET")
class WebConfig : WebMvcConfigurer {

    class IndexResolver : PathResourceResolver() {
        override fun getResource(resourcePath: String, location: Resource): Resource? {
            val requestedResource = location.createRelative(resourcePath)
            if (requestedResource.exists() && requestedResource.isReadable) return requestedResource
            if (resourcePath.endsWith(".js")) return null
            if (resourcePath.endsWith(".css")) return null
            if (resourcePath.endsWith(".png")) return null
            return ClassPathResource("/public/index.html")
        }
    }

    override fun extendMessageConverters(converters: MutableList<HttpMessageConverter<*>>) {
        converters.forEach {
            when (it) {
                is org.springframework.http.converter.json.MappingJackson2HttpMessageConverter -> {
                    JsonConfig.configure(it.objectMapper)
                }
            }
        }
    }

    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/**")
    }

    override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
        registry
            .addResourceHandler("/**")
            .addResourceLocations("classpath:/public/")
            .setCachePeriod(Integer.MAX_VALUE)
            .resourceChain(true)
            .addResolver(EncodedResourceResolver())
            .addResolver(IndexResolver())
    }

}
