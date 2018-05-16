package com.epam.benchmarks;

@SuppressWarnings("unused")
public class Height1000_Width1000_Alive500000_Iterations500 extends AbstractGameEngineBenchmark {

    @Override
    protected String getFileNameWithInitialState() {
        return "/com/epam/benchmarks/1000x1000_500000.txt";
    }

    @Override
    protected int getNumberIterations() {
        return 500;
    }

    @Override
    protected int getHeightField() {
        return 1_000;
    }

    @Override
    protected int getWidthField() {
        return 1_000;
    }
}
