package student_dmitrijs_visuns.homeworks.lesson_13.level_4.game_of_life;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameOfLifeRandomFieldGeneratorTest {

    @Test
    public void ShouldCreateFieldWithGivenWidthHeightPlusTwoCells () {
        GameOfLifeRandomFieldGenerator testGenerator = new GameOfLifeRandomFieldGenerator();
        boolean[][] newField = testGenerator.generate(9, 7);
        assertTrue(newField.length == 11);
        assertTrue(newField[0].length == 9);
    }

    @Test
    public void ShouldCreateFieldWithRandomValues () {
        GameOfLifeRandomFieldGenerator testGenerator = new GameOfLifeRandomFieldGenerator();
        boolean[][] newField = testGenerator.generate(3, 3);

        int numberOfTrue = 0;
        for (int i = 0; i < newField.length; i++) {
            for (int j = 0; j < newField[0].length; j++) {
                if (newField[i][j] == true) {
                    numberOfTrue++;
                }
            }
        }

        assertFalse(numberOfTrue == 0);
    }


}