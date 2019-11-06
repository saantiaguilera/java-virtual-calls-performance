## Virtual Calls Benchmark

Test project to see java performance when performing virtual calls in monomorphic / bimorphic / megamorphic states.

## Output
```
➜  java-virtual-calls-performance ./gradlew jmh

# Warmup Iteration   1: UTING [1s]
> Task :jmh
# JMH version: 1.22
# VM version: JDK 1.8.0_144, Java HotSpot(TM) 64-Bit Server VM, 25.144-b01
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 5 iterations, 1 s each
# Measurement: 5 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.saantiaguilera.VirtualCallsBenchmark.benchmark
# Parameters: (virtualCallMode = monomorphic)

# Run progress: 0.00% complete, ETA 00:01:30
# Fork: 1 of 3

522.696 ns/op
# Warmup Iteration   2: 544.164 ns/op
# Warmup Iteration   3: 534.042 ns/op
# Warmup Iteration   4: 514.296 ns/op
# Warmup Iteration   5: 529.862 ns/op
Iteration   1: 521.737 ns/opG [6s]
Iteration   2: 518.789 ns/opG [7s]
Iteration   3: 512.525 ns/opG [8s]
Iteration   4: 555.730 ns/opG [9s]
Iteration   5: 546.996 ns/opG [10s]

> Task :jmh

# Run progress: 11.11% complete, ETA 00:01:24
# Fork: 2 of 3

# Warmup Iteration   1: 524.552 ns/op
# Warmup Iteration   2: 604.181 ns/op
# Warmup Iteration   3: 563.160 ns/op
# Warmup Iteration   4: 514.001 ns/op
# Warmup Iteration   5: 500.600 ns/op
Iteration   1: 514.561 ns/opG [16s]
Iteration   2: 512.126 ns/opG [17s]
Iteration   3: 592.598 ns/opG [18s]
Iteration   4: 569.573 ns/opG [19s]
Iteration   5: 569.933 ns/opG [20s]

> Task :jmh

# Run progress: 22.22% complete, ETA 00:01:13
# Fork: 3 of 3

# Warmup Iteration   1: 545.217 ns/op
# Warmup Iteration   2: 590.832 ns/op
# Warmup Iteration   3: 525.262 ns/op
# Warmup Iteration   4: 516.115 ns/op
# Warmup Iteration   5: 543.761 ns/op
Iteration   1: 563.246 ns/opG [27s]
Iteration   2: 527.273 ns/opG [28s]
Iteration   3: 520.998 ns/opG [29s]
Iteration   4: 512.521 ns/opG [30s]
Iteration   5: 526.187 ns/opG [31s]

> Task :jmh


Result "com.saantiaguilera.VirtualCallsBenchmark.benchmark":
  537.653 ±(99.9%) 28.173 ns/op [Average]
  (min, avg, max) = (512.126, 537.653, 592.598), stdev = 26.353
  CI (99.9%): [509.480, 565.826] (assumes normal distribution)


# JMH version: 1.22
# VM version: JDK 1.8.0_144, Java HotSpot(TM) 64-Bit Server VM, 25.144-b01
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 5 iterations, 1 s each
# Measurement: 5 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.saantiaguilera.VirtualCallsBenchmark.benchmark
# Parameters: (virtualCallMode = bimorphic)

# Run progress: 33.33% complete, ETA 00:01:02
# Fork: 1 of 3

# Warmup Iteration   1: 1267.094 ns/op
# Warmup Iteration   2: 1255.372 ns/op
# Warmup Iteration   3: 1325.066 ns/op
# Warmup Iteration   4: 1304.995 ns/op
# Warmup Iteration   5: 1253.935 ns/op
Iteration   1: 1268.060 ns/op [37s]
Iteration   2: 1253.007 ns/op [38s]
Iteration   3: 1258.249 ns/op [39s]
Iteration   4: 1256.312 ns/op [40s]
Iteration   5: 1471.029 ns/op [41s]

> Task :jmh

# Run progress: 44.44% complete, ETA 00:00:52
# Fork: 2 of 3

# Warmup Iteration   1: 1250.968 ns/op
# Warmup Iteration   2: 1315.679 ns/op
# Warmup Iteration   3: 1372.955 ns/op
# Warmup Iteration   4: 1242.287 ns/op
# Warmup Iteration   5: 1304.115 ns/op
Iteration   1: 1588.604 ns/op [48s]
Iteration   2: 1504.792 ns/op [49s]
Iteration   3: 1346.988 ns/op [50s]
Iteration   4: 1675.542 ns/op [51s]
Iteration   5: 1268.521 ns/op [52s]

> Task :jmh

# Run progress: 55.56% complete, ETA 00:00:41
# Fork: 3 of 3

# Warmup Iteration   1: 1352.471 ns/op
# Warmup Iteration   2: 1300.307 ns/op
# Warmup Iteration   3: 1414.144 ns/op
# Warmup Iteration   4: 1301.581 ns/op
# Warmup Iteration   5: 1265.046 ns/op
Iteration   1: 1312.774 ns/op [58s]
Iteration   2: 1279.315 ns/op [59s]
Iteration   3: 1400.782 ns/op [1m 0s]
Iteration   4: 1295.531 ns/op [1m 1s]
Iteration   5: 1274.039 ns/op [1m 2s]

> Task :jmh


Result "com.saantiaguilera.VirtualCallsBenchmark.benchmark":
  1363.570 ±(99.9%) 144.682 ns/op [Average]
  (min, avg, max) = (1253.007, 1363.570, 1675.542), stdev = 135.336
  CI (99.9%): [1218.888, 1508.252] (assumes normal distribution)


# JMH version: 1.22
# VM version: JDK 1.8.0_144, Java HotSpot(TM) 64-Bit Server VM, 25.144-b01
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 5 iterations, 1 s each
# Measurement: 5 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.saantiaguilera.VirtualCallsBenchmark.benchmark
# Parameters: (virtualCallMode = megamorphic)

# Run progress: 66.67% complete, ETA 00:00:31
# Fork: 1 of 3

# Warmup Iteration   1: 3201.849 ns/op
# Warmup Iteration   2: 3101.982 ns/op
# Warmup Iteration   3: 2999.380 ns/op
# Warmup Iteration   4: 3242.422 ns/op
# Warmup Iteration   5: 3609.220 ns/op
Iteration   1: 3200.823 ns/op [1m 8s]
Iteration   2: 3621.081 ns/op [1m 9s]
Iteration   3: 4144.143 ns/op [1m 10s]
Iteration   4: 2845.902 ns/op [1m 11s]
Iteration   5: 2846.766 ns/op [1m 12s]

> Task :jmh

# Run progress: 77.78% complete, ETA 00:00:20
# Fork: 2 of 3

# Warmup Iteration   1: 2977.942 ns/op
# Warmup Iteration   2: 2820.863 ns/op
# Warmup Iteration   3: 2995.884 ns/op
# Warmup Iteration   4: 2872.205 ns/op
# Warmup Iteration   5: 3082.789 ns/op
Iteration   1: 2926.735 ns/op [1m 19s]
Iteration   2: 3071.956 ns/op [1m 20s]
Iteration   3: 3071.494 ns/op [1m 21s]
Iteration   4: 2961.224 ns/op [1m 22s]
Iteration   5: 3606.041 ns/op [1m 23s]

> Task :jmh

# Run progress: 88.89% complete, ETA 00:00:10
# Fork: 3 of 3

# Warmup Iteration   1: 3066.648 ns/op
# Warmup Iteration   2: 2931.207 ns/op
# Warmup Iteration   3: 2966.897 ns/op
# Warmup Iteration   4: 3021.098 ns/op
# Warmup Iteration   5: 3108.813 ns/op
Iteration   1: 2739.062 ns/op [1m 29s]
Iteration   2: 2805.815 ns/op [1m 30s]
Iteration   3: 2871.441 ns/op [1m 31s]
Iteration   4: 2872.983 ns/op [1m 32s]
Iteration   5: 2987.032 ns/op [1m 33s]

> Task :jmh


Result "com.saantiaguilera.VirtualCallsBenchmark.benchmark":
  3104.833 ±(99.9%) 418.027 ns/op [Average]
  (min, avg, max) = (2739.062, 3104.833, 4144.143), stdev = 391.023
  CI (99.9%): [2686.806, 3522.860] (assumes normal distribution)


# Run complete. Total time: 00:01:33

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                        (virtualCallMode)  Mode  Cnt     Score     Error  Units
VirtualCallsBenchmark.benchmark        monomorphic  avgt   15   537.653 ±  28.173  ns/op
VirtualCallsBenchmark.benchmark          bimorphic  avgt   15  1363.570 ± 144.682  ns/op
VirtualCallsBenchmark.benchmark        megamorphic  avgt   15  3104.833 ± 418.027  ns/op

BUILD SUCCESSFUL in 1m 35s
6 actionable tasks: 1 executed, 5 up-to-date
```