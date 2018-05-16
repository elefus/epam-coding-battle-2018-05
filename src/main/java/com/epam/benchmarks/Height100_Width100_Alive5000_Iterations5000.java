package com.epam.benchmarks;

@SuppressWarnings("unused")
public class Height100_Width100_Alive5000_Iterations5000 extends AbstractGameEngineBenchmark {

    @Override
    protected String getFileNameWithInitialState() {
        return "/com/epam/benchmarks/100x100_5000.txt";
    }

    @Override
    protected int getNumberIterations() {
        return 5_000;
    }

    @Override
    protected int getHeightField() {
        return 100;
    }

    @Override
    protected int getWidthField() {
        return 100;
    }
}
