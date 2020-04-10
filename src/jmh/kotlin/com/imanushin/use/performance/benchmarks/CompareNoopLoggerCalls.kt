package com.imanushin.use.performance.benchmarks

import com.imanushin.kotlin.logging.performance.KLoggingWithInlineLogger
import mu.KLogging
import org.openjdk.jmh.annotations.*
import org.openjdk.jmh.infra.Blackhole


@BenchmarkMode(Mode.All)
@Warmup
@Measurement
@State(Scope.Benchmark)
open class CompareNoopLoggerCalls {

    private val microutilsCompanion = object : KLogging(){}

    private val inlinedMethodsCompanion = object : KLoggingWithInlineLogger(){}

    @Param("some input")
    lateinit var parameter: String

    @Benchmark
    fun t1microutils(blackhole: Blackhole) {
        microutilsCompanion.logger.trace {
            "Something was wrong: $parameter"
        }
    }

    @Benchmark
    fun t2withInlineMethod(blackhole: Blackhole) {
        inlinedMethodsCompanion.logger.trace {
            "Something was wrong: $parameter"
        }
    }
}