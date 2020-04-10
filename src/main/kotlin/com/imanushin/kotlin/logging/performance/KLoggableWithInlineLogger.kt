package com.imanushin.kotlin.logging.performance

interface KLoggableWithInlineLogger {

    /**
     * The member that performs the actual logging
     */
    val logger: KLoggerInlined

    /**
     * get logger for the class
     */
    fun logger(): KLoggerInlined = KLoggerInlinedFactory.logger(this)

    /**
     * get logger by explicit name
     */
    fun logger(name: String): KLoggerInlined = KLoggerInlinedFactory.logger(name)
}