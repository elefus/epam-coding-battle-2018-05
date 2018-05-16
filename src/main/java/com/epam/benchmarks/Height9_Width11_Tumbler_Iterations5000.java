package com.epam.benchmarks;

@SuppressWarnings("unused")
public class Height9_Width11_Tumbler_Iterations5000 extends AbstractGameEngineBenchmark {

    @Override
    protected String getFileNameWithInitialState() {
        return "/com/epam/benchmarks/9x11_Tumbler.txt";
    }

    @Override
    protected int getNumberIterations() {
        return 5_000;
    }

    @Override
    protected int getHeightField() {
        return 9;
    }

    @Override
    protected int getWidthField() {
        return 11;
    }
}
