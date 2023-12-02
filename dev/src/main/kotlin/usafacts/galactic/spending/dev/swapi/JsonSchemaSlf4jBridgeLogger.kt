package usafacts.galactic.spending.dev.swapi

import org.jsonschema2pojo.AbstractRuleLogger
import org.slf4j.LoggerFactory
import usafacts.galactic.spending.dev.commands.GenSwApiCommand

class JsonSchemaSlf4jBridgeLogger : AbstractRuleLogger() {
    companion object{
        val LOG = LoggerFactory.getLogger(JsonSchemaSlf4jBridgeLogger::class.java)
    }

    override fun isDebugEnabled(): Boolean {
        return true
    }

    override fun isErrorEnabled(): Boolean {
        return true
    }

    override fun isInfoEnabled(): Boolean {
        return true
    }

    override fun isTraceEnabled(): Boolean {
        return true
    }

    override fun isWarnEnabled(): Boolean {
        return true
    }

    override fun doDebug(msg: String?) {
        LOG.debug(msg)
    }

    override fun doError(msg: String?, e: Throwable?) {
        LOG.error(msg, e)
    }

    override fun doInfo(msg: String?) {
        LOG.info(msg)
    }

    override fun doTrace(msg: String?) {
        LOG.trace(msg)
    }

    override fun doWarn(msg: String?, e: Throwable?) {
        LOG.warn(msg, e)
    }

}
