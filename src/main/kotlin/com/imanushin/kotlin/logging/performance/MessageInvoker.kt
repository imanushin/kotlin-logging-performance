package com.imanushin.kotlin.logging.performance

@Suppress("NOTHING_TO_INLINE")
inline fun (() -> Any?).toStringSafe(): String {
    return try {
        invoke().toString()
    } catch (e: Exception) {
        "Log message invocation failed: $e"
    }
}