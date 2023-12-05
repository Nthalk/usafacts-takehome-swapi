package usafacts.galactic.spending.app.config

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.util.StdDateFormat
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class JsonConfig {

  companion object {
    fun configure(objectMapper: ObjectMapper): ObjectMapper {
      return objectMapper.registerModules(
        JavaTimeModule(),
        KotlinModule.Builder().build(),
        ParameterNamesModule(),
        Jdk8Module()
      ).apply {
        dateFormat = StdDateFormat()
      }
    }
  }

  @Bean
  fun objectMapper(): ObjectMapper {
    return configure(ObjectMapper())
  }

}
