package kr.lul.logging

import org.slf4j.LoggerFactory
import kotlin.reflect.KClass

class Slf4JLogger(
    override val name: String
) : Logger {
    private val logger: org.slf4j.Logger = LoggerFactory.getLogger(name)

    constructor(clazz: KClass<*>) : this(clazz.qualifiedName!!)

    constructor(clazz: Class<*>) : this(clazz.canonicalName!!)

    override fun v(message: String) {
        if (logger.isTraceEnabled) {
            logger.trace(message)
        }
    }

    override fun v(message: String, e: Throwable) {
        if (logger.isTraceEnabled) {
            logger.trace(message, e)
        }
    }

    fun Logger.v(message: () -> String) {
        if (logger.isTraceEnabled) {
            logger.trace(message())
        }
    }

    fun Logger.v(e: Throwable, message: () -> String) {
        if (logger.isTraceEnabled) {
            logger.trace(message(), e)
        }
    }

    override fun d(message: String) {
        if (logger.isDebugEnabled) {
            logger.debug(message)
        }
    }

    override fun d(message: String, e: Throwable) {
        if (logger.isDebugEnabled) {
            logger.debug(message, e)
        }
    }

    fun Logger.d(message: () -> String) {
        if (logger.isDebugEnabled) {
            logger.debug(message())
        }
    }

    fun Logger.d(e: Throwable, message: () -> String) {
        if (logger.isDebugEnabled) {
            logger.debug(message(), e)
        }
    }

    override fun i(message: String) {
        if (logger.isInfoEnabled) {
            logger.info(message)
        }
    }

    override fun i(message: String, e: Throwable) {
        if (logger.isInfoEnabled) {
            logger.info(message, e)
        }
    }

    fun Logger.i(message: () -> String) {
        if (logger.isInfoEnabled) {
            logger.info(message())
        }
    }

    fun Logger.i(e: Throwable, message: () -> String) {
        if (logger.isInfoEnabled) {
            logger.info(message(), e)
        }
    }

    override fun w(message: String) {
        logger.warn(message)
    }

    override fun w(message: String, e: Throwable) {
        logger.warn(message, e)
    }

    fun Logger.w(message: () -> String) {
        logger.warn(message())
    }

    fun Logger.w(e: Throwable, message: () -> String) {
        logger.warn(message(), e)
    }

    override fun e(message: String) {
        logger.error(message)
    }

    override fun e(message: String, e: Throwable) {
        logger.error(message, e)
    }

    fun Logger.e(message: () -> String) {
        logger.error(message())
    }

    fun Logger.e(e: Throwable, message: () -> String) {
        logger.error(message(), e)
    }

    override fun toString() = "Slf4JLogger(name='$name', logger=$logger)"
}
