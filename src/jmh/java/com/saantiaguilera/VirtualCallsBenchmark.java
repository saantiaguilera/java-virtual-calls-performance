package com.saantiaguilera;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@Warmup(iterations = 5, time = 1)
@Measurement(iterations = 5, time = 1)
@Fork(3)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Benchmark)
public class VirtualCallsBenchmark {

    @Param({"monomorphic", "bimorphic", "megamorphic"})
    private String virtualCallMode;

    private BasicInterface[] data;

    @Setup
    public void setup() {
        data = new BasicInterface[900];

        boolean useImplementationThree = virtualCallMode.equals("megamorphic");
        boolean useImplementationTwo = virtualCallMode.equals("bimorphic") || useImplementationThree;

        for (int i = 0 ; i < 900 ; i += 3) {
            data[i] = new ImplementationOne();
            data[i+1] = useImplementationTwo ? new ImplementationTwo() : new ImplementationOne();
            data[i+2] = useImplementationThree ? new ImplementationThree() : new ImplementationOne();
        }
    }

    @Benchmark
    public void benchmark() {
        for (BasicInterface element : data) {
            element.performOperation();
        }
    }

}
