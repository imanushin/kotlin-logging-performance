package com.imanushin.kotlin.logging.performance

open class KLoggingWithInlineLogger : KLoggableWithInlineLogger {
    override val logger: KLoggerInlined = KLoggerInlinedFactory.logger(this)
}

