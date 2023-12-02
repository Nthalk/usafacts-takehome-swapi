package usafacts.galactic.spending.dev.swapi

import org.jsonschema2pojo.DefaultGenerationConfig
import java.io.File
import java.net.URL

class JsonSchemaGenerationConfig(
    private val targetPackage: String,
    private val targetDirectory: File
) : DefaultGenerationConfig() {
    override fun getTargetPackage(): String {
        return targetPackage
    }

    override fun getTargetDirectory(): File {
        return targetDirectory
    }

    override fun getSource(): MutableIterator<URL> {
        return SwapiRestClient().getJsonSchemaUrls().map { URL(it) }.toMutableList().iterator()
    }


}
