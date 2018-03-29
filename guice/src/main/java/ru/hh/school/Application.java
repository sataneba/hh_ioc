package ru.hh.school;

import java.util.concurrent.TimeUnit;

import com.google.inject.Guice;
import com.google.inject.Injector;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

@State(Scope.Thread)
public class Application {
    Injector injector;
    AreaService service;

    @Setup(Level.Trial)
    public void init() {
        injector = Guice.createInjector(new CommonModule(), new ProdModule());
        service = injector.getInstance(AreaService.class);
    }

    @Benchmark
    @BenchmarkMode(Mode.SingleShotTime)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void contextStartCold() {
        Guice.createInjector(new CommonModule(), new ProdModule());
    }

    @Benchmark
    @Warmup(iterations = 10)
    @Measurement(iterations = 10)
    @BenchmarkMode(Mode.Throughput)
    @OutputTimeUnit(TimeUnit.SECONDS)
    public void contextStartHot() {
        Guice.createInjector(new CommonModule(), new ProdModule());
    }

    @Benchmark
    @BenchmarkMode(Mode.SingleShotTime)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void getBeanCold() {
        injector.getInstance(AreaService.class);
    }

    @Benchmark
    @Warmup(iterations = 10)
    @Measurement(iterations = 10)
    @BenchmarkMode(Mode.Throughput)
    @OutputTimeUnit(TimeUnit.SECONDS)
    public void getBeanHot() {
        injector.getInstance(AreaService.class);
    }

    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder()
                .include(Application.class.getSimpleName())
                .forks(1)
                .build();
        new Runner(options).run();
    }
}
