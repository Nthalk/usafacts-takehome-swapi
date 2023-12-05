package usafacts.galactic.spending.dev.commands

import com.github.ajalt.clikt.core.CliktCommand
import cz.habarta.typescript.generator.*
import io.github.classgraph.ClassGraph
import org.slf4j.LoggerFactory
import java.io.File

class GenApiCommand : CliktCommand() {
    companion object {
        val LOG = LoggerFactory.getLogger(GenApiCommand::class.java)
    }

    override fun run() {
        LOG.info("Generating api client...")
        val classPath = System.getProperty("user.dir") + "/app/build/classes/kotlin/main"
        LOG.info("Scanning classpath: $classPath")
        val results = ClassGraph()
            .overrideClasspath(classPath)
            .verbose()
            .enableAllInfo()
            .enableClassInfo()
            .enableAnnotationInfo()
            .acceptPaths(
                "usafacts/galactic/spending/app/api",
                "usafacts/galactic/spending/db",
            )
            .scan()

        val classes = results.allClasses.map {
            it.loadClass()
        }

        TypeScriptGenerator(
            Settings().apply {
                sortDeclarations = true
                sortTypeDeclarations = true
                noFileComment = true
                noEslintDisable = false
                jsonLibrary = JsonLibrary.jackson2
                outputKind = TypeScriptOutputKind.module
                outputFileType = TypeScriptFileType.implementationFile
                scanSpringApplication = true
                generateSpringApplicationClient = true
                nullabilityDefinition = NullabilityDefinition.nullAndUndefinedInlineUnion
                restNamespacing = RestNamespacing.perResource
                nullabilityDefinition = NullabilityDefinition.nullAndUndefinedUnion
                jackson2ModuleDiscovery = true
                customTypeMappings = mapOf(
                    "java.time.LocalDate" to "string",
                    "java.time.OffsetDateTime" to "string",
                )

                customTypeNamingFunction = """
                        function(name, simpleName) {
                          const parts = name.split(".")
                          const last = parts[parts.length - 1]
                          if(last.includes("${'$'}")) return last.replaceAll("${'$'}", "")
                        }
                    """.trimIndent()
                setExcludeFilter(
                    listOf(),
                    listOf(
                        "**\$Companion",
                        "**\$serializer",
                        "java.time**",
                        "kotlinx.datetime**"
                    )
                )
            }
        )
            .generateTypeScript(
                Input.from(*(classes.toTypedArray())),
                Output.to(File("ui/src/api-gen.ts"))
            )
    }
}
