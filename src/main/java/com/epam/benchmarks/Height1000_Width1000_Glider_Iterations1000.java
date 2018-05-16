package com.epam.benchmarks;

@SuppressWarnings("unused")
public class Height1000_Width1000_Glider_Iterations1000 extends AbstractGameEngineBenchmark {

    @Override
    protected String getFileNameWithInitialState() {
        return "/com/epam/benchmarks/1000x1000_Glider.txt";
    }

    @Override
    protected int getNumberIterations() {
        return 1_000;
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
