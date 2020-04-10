package com.imanushin.kotlin.logging.performance

import org.slf4j.Logger

class KLoggerInlined internal constructor(
        val underlyingLogger: Logger
) {

    inline fun trace(msg: () -> Any?) {
        if (underlyingLogger.isTraceEnabled) {
            underlyingLogger.trace(msg.toStringSafe())
        }
    }

    inline fun debug(msg: () -> Any?) {
        if (underlyingLogger.isDebugEnabled) {
            underlyingLogger.debug(msg.toStringSafe())
        }
    }

    inline fun info(msg: () -> Any?) {
        if (underlyingLogger.isInfoEnabled) {
            underlyingLogger.info(msg.toStringSafe())
        }
    }

    inline fun warn(msg: () -> Any?) {
        if (underlyingLogger.isWarnEnabled) {
            underlyingLogger.warn(msg.toStringSafe())
        }
    }

    inline fun error(msg: () -> Any?) {
        if (underlyingLogger.isErrorEnabled) {
            underlyingLogger.error(msg.toStringSafe())
        }
    }

    inline fun trace(t: Throwable, msg: () -> Any?) {
        if (underlyingLogger.isTraceEnabled) {
            underlyingLogger.trace(msg.toStringSafe(), t)
        }
    }

    inline fun debug(t: Throwable, msg: () -> Any?) {
        if (underlyingLogger.isDebugEnabled) {
            underlyingLogger.debug(msg.toStringSafe(), t)
        }
    }

    inline fun info(t: Throwable, msg: () -> Any?) {
        if (underlyingLogger.isInfoEnabled) {
            underlyingLogger.info(msg.toStringSafe(), t)
        }
    }

    inline fun warn(t: Throwable, msg: () -> Any?) {
        if (underlyingLogger.isWarnEnabled) {
            underlyingLogger.warn(msg.toStringSafe(), t)
        }
    }

    inline fun error(t: Throwable, msg: () -> Any?) {
        if (underlyingLogger.isErrorEnabled) {
            underlyingLogger.error(msg.toStringSafe(), t)
        }
    }
}