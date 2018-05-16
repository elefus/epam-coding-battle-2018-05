package com.epam;

public interface GameEngine {

    /**
     * Моделирует игру "Жизнь" с указанными начальными данными.
     * Игра проходит по стандартным правилам, поле зациклено по вертикали и горизонтали (тор).
     *
     * @param initialState Начальное состояние поля.
     * @param numberIterations Количество анализируемых итераций.
     * @return Конечное состояние поля.
     * @see <a href="https://ru.wikipedia.org/wiki/Игра_«Жизнь»">Игра "Жизнь"</a>
     * @see <a href="https://bitstorm.org/gameoflife/">Симулятор игры "Жизнь"</a>
     */
    boolean[][] compute(boolean[][] initialState, int numberIterations);
}
