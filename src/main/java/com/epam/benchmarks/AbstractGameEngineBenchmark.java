package com.epam.benchmarks;

import com.epam.GameEngine;
import org.openjdk.jmh.annotations.*;
import org.reflections.Reflections;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

@Fork(3)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.SECONDS)
@Warmup(iterations = 5, time = 1)
@Measurement(iterations = 10, time = 1)
@State(Scope.Benchmark)
@SuppressWarnings("unused")
public abstract class AbstractGameEngineBenchmark {

    private int numberIterations;
    private boolean[][] field;
    private GameEngine engine;

    @Setup
    public void setup() throws Exception {
        engine = new Reflections(GameEngine.class.getPackage().getName()).getSubTypesOf(GameEngine.class)
                                                                         .stream()
                                                                         .findFirst()
                                                                         .orElseThrow(ClassNotFoundException::new)
                                                                         .getConstructor()
                                                                         .newInstance();

        numberIterations = getNumberIterations();
        int height = getHeightField();
        int width = getWidthField();
        field = new boolean[height][width];

        try (Scanner input = new Scanner(getClass().getResourceAsStream(getFileNameWithInitialState()))) {
            for (int y = 0; y < height; ++y) {
                for (int x = 0; x < width; ++x) {
                    field[y][x] = input.next().equals("1");
                }
            }
        }
    }

    @Benchmark
    public boolean[][] compute() {
        return engine.compute(field, numberIterations);
    }

    protected abstract String getFileNameWithInitialState();
    protected abstract int getNumberIterations();
    protected abstract int getHeightField();
    protected abstract int getWidthField();
}
