package com.epam.benchmarks;

@SuppressWarnings("unused")
public class Height10000_Width100_Alive500000_Iterations250 extends AbstractGameEngineBenchmark {

    @Override
    protected String getFileNameWithInitialState() {
        return "/com/epam/benchmarks/10000x100_500000.txt";
    }

    @Override
    protected int getNumberIterations() {
        return 250;
    }

    @Override
    protected int getHeightField() {
        return 10_000;
    }

    @Override
    protected int getWidthField() {
        return 100;
    }
}
