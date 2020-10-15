package student_dmitrijs_visuns.homeworks.lesson_13.level_4.game_of_life;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameOfLifeNextGenerationCalculatorTest {

    @Test
    public void NextGenCalculatorAssertionTest() {
        GameOfLifeNextGenerationCalculator testCalculator = new GameOfLifeNextGenerationCalculator();

        boolean [][] testField = new boolean[][]{
                {false, false, false, false, false},
                {false, false, true, false, false},
                {false, false, true, false, false},
                {false, false, true, false, false},
                {false, false, false, false, false}};

        boolean [][] actual = testCalculator.calculate(testField);

        boolean [][] expected =  new boolean [][]{
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, true, true, true, false},
                {false, false, false, false, false},
                {false, false, false, false, false}};

        assertArrayEquals(expected, actual);
    }


    @Test
    public void NextGenCalculatorAssertionTest2() {
        GameOfLifeNextGenerationCalculator testCalculator = new GameOfLifeNextGenerationCalculator();

        boolean [][] testField =  new boolean [][]{
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, true, true, true, false},
                {false, false, false, false, false},
                {false, false, false, false, false}};

        boolean [][] actual = testCalculator.calculate(testField);

        boolean [][] expected = new boolean[][]{
                {false, false, false, false, false},
                {false, false, true, false, false},
                {false, false, true, false, false},
                {false, false, true, false, false},
                {false, false, false, false, false}};

        assertArrayEquals(expected, actual);
    }

}