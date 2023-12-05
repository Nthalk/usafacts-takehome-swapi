package usafacts.galactic.spending.dev.commands

import com.github.ajalt.clikt.core.CliktCommand
import org.jooq.codegen.GenerationTool
import org.jooq.meta.jaxb.*
import org.jooq.meta.jaxb.Target
import org.jooq.meta.sqlite.SQLiteDatabase

class GenDbCommand : CliktCommand() {

    override fun run() {
        GenerationTool.generate(
            Configuration().withJdbc(
                Jdbc()
                    .withUrl("jdbc:sqlite:db.sqlite")
            )
                .withGenerator(
                    Generator()
                        .withGenerate(
                            Generate()
                                .withPojos(true)
                                .withSpringAnnotations(true)
                                .withValidationAnnotations(true)
                                .withFluentSetters(true)
                                .withInterfaces(true)
                                .withRoutines(false)
                                .withComments(false)
                        )
                        .withDatabase(
                            Database()
                                .withName(SQLiteDatabase::class.java.name)
                                .withIncludes(".*")
                                .withExcludes(
                                    """
                                    flyway_schema_history 
                                  """.trimIndent()
                                )
                        )
                        .withTarget(
                            Target()
                                .withPackageName("usafacts.galactic.spending.db")
                                .withDirectory("app/src/main/gen")
                                .withClean(true)
                        )
                )
                .withLogging(Logging.DEBUG)
        )
    }
}
