package com.epam.benchmarks;

@SuppressWarnings("unused")
public class Height100_Width10000_Alive500000_Iterations250 extends AbstractGameEngineBenchmark {

    @Override
    protected String getFileNameWithInitialState() {
        return "/com/epam/benchmarks/100x10000_500000.txt";
    }

    @Override
    protected int getNumberIterations() {
        return 250;
    }

    @Override
    protected int getHeightField() {
        return 100;
    }

    @Override
    protected int getWidthField() {
        return 10_000;
    }
}
