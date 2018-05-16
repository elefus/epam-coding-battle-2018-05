package com.epam.benchmarks;

@SuppressWarnings("unused")
public class Height11_Width18_Line_Iterations5000 extends AbstractGameEngineBenchmark {

    @Override
    protected String getFileNameWithInitialState() {
        return "/com/epam/benchmarks/11x18_Line.txt";
    }

    @Override
    protected int getNumberIterations() {
        return 5_000;
    }

    @Override
    protected int getHeightField() {
        return 11;
    }

    @Override
    protected int getWidthField() {
        return 18;
    }
}
