package com.imanushin.kotlin.logging.performance

import mu.KLoggable
import mu.KLogger

open class KLoggingWithInlineLogger : KLoggable {
    override val logger: KLogger = logger()
}

