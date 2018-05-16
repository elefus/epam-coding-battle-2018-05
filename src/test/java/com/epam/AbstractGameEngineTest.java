package com.epam;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.reflections.Reflections;

import java.lang.reflect.Constructor;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SuppressWarnings("unused")
abstract class AbstractGameEngineTest {


    private static Constructor<? extends GameEngine> constructor;
    private GameEngine engine;

    @BeforeAll
    private static void findAndGetGameEingineImplementation() throws Exception {
        constructor = new Reflections(GameEngine.class.getPackage().getName()).getSubTypesOf(GameEngine.class)
                                                                              .stream()
                                                                              .findFirst()
                                                                              .orElseThrow(ClassNotFoundException::new)
                                                                              .getConstructor();
    }

    @BeforeEach
    private void createNewGameEngine() throws Exception {
        engine = constructor.newInstance();
    }

    void test(int[][] initialState, int numberIterations, int[][] finalState) {
        boolean[][] result = engine.compute(toBooleanField(initialState), numberIterations);

        assertArrayEquals(toBooleanField(finalState), result);
    }

    private static boolean[][] toBooleanField(int[][] field) {
        boolean[][] result = new boolean[field.length][field[0].length];

        for (int y = 0; y < field.length; ++y) {
            for (int x = 0; x < field[0].length; ++x) {
                result[y][x] = field[y][x] == 1;
            }
        }

        return result;
    }
}
