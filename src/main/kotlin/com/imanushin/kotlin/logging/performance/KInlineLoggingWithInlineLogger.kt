package com.imanushin.kotlin.logging.performance

open class KInlineLoggingWithInlineLogger : KInlinedLoggableWithInlineLogger {
    override val logger: KInlinedLoggerInlinedFunctions = KInlineLoggerInlinedFactory.logger(this)
}

