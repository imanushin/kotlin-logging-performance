package com.imanushin.use.performance.benchmarks

import com.imanushin.kotlin.logging.performance.KInlineLoggingWithInlineLogger
import com.imanushin.kotlin.logging.performance.KLoggingWithInlineLogger
import mu.KLogging
import org.openjdk.jmh.annotations.*


@BenchmarkMode(Mode.All)
@Warmup
@Measurement
@State(Scope.Benchmark)
open class CompareNoopLoggerCalls {

    private val microutilsCompanion = object : KLogging(){}

    private val inlinedMethodsCompanion = object : KLoggingWithInlineLogger(){}

    private val inlineLoggerInlineMethods = object : KInlineLoggingWithInlineLogger(){}

    @Param("some input")
    lateinit var parameter: String

    @Benchmark
    fun t1microutils() {
        microutilsCompanion.logger.trace {
            "Something was wrong: $parameter"
        }
    }

    @Benchmark
    fun t2withInlineMethod() {
        inlinedMethodsCompanion.logger.trace {
            "Something was wrong: $parameter"
        }
    }

    @Benchmark
    fun t3withInlineLoggerMethod() {
        inlineLoggerInlineMethods.logger.trace {
            "Something was wrong: $parameter"
        }
    }
}