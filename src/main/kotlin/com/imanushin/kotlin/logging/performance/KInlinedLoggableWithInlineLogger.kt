package com.imanushin.kotlin.logging.performance

interface KInlinedLoggableWithInlineLogger {

    /**
     * The member that performs the actual logging
     */
    val logger: KInlinedLoggerInlinedFunctions

    /**
     * get logger for the class
     */
    fun logger(): KInlinedLoggerInlinedFunctions = KInlineLoggerInlinedFactory.logger(this)

    /**
     * get logger by explicit name
     */
    fun logger(name: String): KLoggerInlined = KLoggerInlinedFactory.logger(name)
}