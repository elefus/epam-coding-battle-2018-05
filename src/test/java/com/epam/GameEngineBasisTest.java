package com.epam;

import org.junit.jupiter.api.Test;

class GameEngineBasisTest extends AbstractGameEngineTest {

    @Test
    void centralCellDiesDueToOverpopulation() {
        test(new int[][] {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0},
                {0, 0, 1, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 0, 0, 0}
        }, 1, new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0}
        });
    }

    @Test
    void centralCelldiesDueToOverpopulation2() {
        test(new int[][] {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0},
                {0, 0, 1, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0}
        }, 2, new int[][]{
                {0, 0, 0, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0}
        });
    }

    @Test
    void centralCellAlivedWith2Neigbours() {
        test(new int[][] {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        }, 1, new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0},
                {0, 0, 1, 1, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        });
    }

    @Test
    void centralCellAlivedWith3Neigbours() {
        test(new int[][] {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0},
                {0, 0, 1, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0}
        }, 1, new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        });
    }

    @Test
    void lifeAppearsInCentralCell() {
        test(new int[][] {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 1, 0},
                {0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0}
        }, 1, new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        });
    }

    @Test
    void allCellsAlive() {
        test(new int[][] {
                {0, 1, 1},
                {0, 0, 0},
                {1, 0, 0}
        }, 1, new int[][]{
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        });
    }

    @Test
    void allCellsDie() {
        test(new int[][] {
                {0, 1, 1},
                {0, 0, 0},
                {1, 0, 0}
        }, 2, new int[][]{
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        });
    }
}
