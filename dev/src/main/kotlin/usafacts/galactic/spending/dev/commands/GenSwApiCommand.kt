package usafacts.galactic.spending.dev.commands

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.options.default
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.types.path
import org.jsonschema2pojo.Jsonschema2Pojo
import org.slf4j.LoggerFactory
import usafacts.galactic.spending.dev.swapi.JsonSchemaGenerationConfig
import usafacts.galactic.spending.dev.swapi.JsonSchemaSlf4jBridgeLogger
import kotlin.io.path.Path


class GenSwApiCommand : CliktCommand("swapi") {
    val currentDir = Path(System.getProperty("user.dir"))
    val defaultTargetDirectory = currentDir.resolve("../app/src/main/gen")

    val targetDirectory by option(
        "-d",
        "--target-directory",
        help = "The directory to generate the code into"
    ).path().default(defaultTargetDirectory)

    val targetPackage by option(
        "-p",
        "--target-package",
        help = "The package to generate the code into"
    ).default("usafacts.galactic.spending.dev.swapi")

    companion object {
        val LOG = LoggerFactory.getLogger(GenSwApiCommand::class.java)
    }

    override fun run() {
        Jsonschema2Pojo.generate(
            JsonSchemaGenerationConfig(
                targetPackage = targetPackage,
                targetDirectory = targetDirectory.toFile()
            ),
            JsonSchemaSlf4jBridgeLogger()
        )

    }
}
