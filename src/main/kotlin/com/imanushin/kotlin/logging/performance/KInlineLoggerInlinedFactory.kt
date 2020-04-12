package com.imanushin.kotlin.logging.performance

import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 * factory methods to obtain a [Logger]
 */
@Suppress("NOTHING_TO_INLINE")
internal object KInlineLoggerInlinedFactory {

    /**
     * get logger for the class
     */
    internal inline fun logger(loggable: KInlinedLoggableWithInlineLogger): KInlinedLoggerInlinedFunctions =
            logger(KLoggerNameResolver.name(loggable.javaClass))

    /**
     * get logger by explicit name
     */
    internal inline fun logger(name: String): KInlinedLoggerInlinedFunctions = KInlinedLoggerInlinedFunctions(jLogger(name))

    /**
     * get logger for the method, assuming it was declared at the logger file/class
     */
    internal inline fun logger(noinline func: () -> Unit): KInlinedLoggerInlinedFunctions =
            logger(KLoggerNameResolver.name(func))

    /**
     * get a java logger by name
     */
    private inline fun jLogger(name: String): Logger = LoggerFactory.getLogger(name)

}

