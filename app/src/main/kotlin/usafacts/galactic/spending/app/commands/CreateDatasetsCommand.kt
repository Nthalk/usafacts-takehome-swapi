package usafacts.galactic.spending.app.commands

import com.github.ajalt.clikt.core.CliktCommand
import jakarta.annotation.PostConstruct
import org.jooq.DSLContext
import org.springframework.boot.SpringApplication
import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.AutoConfigureAfter
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression
import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration.FlywayConfiguration
import org.springframework.context.ApplicationContext
import org.springframework.stereotype.Service
import usafacts.galactic.spending.app.WebApp
import java.nio.charset.Charset


@Service
@ConditionalOnExpression("'\${__command.create-datasets}' == 'true'")
@AutoConfigureAfter(ImportDataService::class, FlywayConfiguration::class)
class CreateDatasetsService(
    val db: DSLContext,
    val applicationContext: ApplicationContext
) {
    companion object {
        val LOG = org.slf4j.LoggerFactory.getLogger(CreateDatasetsService::class.java)
    }

    @PostConstruct
    fun run() {
        applicationContext.getResources("classpath:db/dataset/*.sql").forEach { resource ->
            LOG.info("Executing ${resource.filename}...")
            db.parser().parse(resource.getContentAsString(Charset.defaultCharset())).executeBatch()
        }
    }
}

class CreateDatasetsCommand : CliktCommand() {
    companion object {
        fun enable() {
            System.setProperty("__command.create-datasets", "true")
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
