package usafacts.galactic.spending.app.commands

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.options.flag
import com.github.ajalt.clikt.parameters.options.option
import org.springframework.boot.SpringApplication
import usafacts.galactic.spending.app.WebApp

class RunCommand : CliktCommand() {
    val importData by option("--import-data", help = "Import data before running").flag()
    val createDatasets by option("--create-datasets", help = "Create datasets before running").flag()
    val init by option("--init", help = "Run both import and create datasets").flag()
    override fun run() {
        if (importData || init) {
            ImportDataCommand.enable()
        }
        if (createDatasets || init) {
            CreateDatasetsCommand.enable()
        }
        SpringApplication.run(WebApp::class.java)
    }
}
