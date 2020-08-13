package student_vadims_vladisevs.lesson9.day_x.super_task_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class VerticalWinPositionDetectorTest {

    Player playerX = new Player("X");
    Player playerO = new Player("O");
    String[][] gameField = createField();
    VerticalWinPositionDetector verticalWinPositionDetector = new VerticalWinPositionDetector();

    @Test
    public void isWin_true_v1() {
        gameField[1][0] = playerX.getSymbol();
        gameField[2][0] = playerX.getSymbol();
        gameField[3][0] = playerX.getSymbol();
        gameField[4][0] = playerX.getSymbol();

        boolean actual = verticalWinPositionDetector.isWin(gameField, playerX);
        assertTrue(actual);
    }

    @Test
    public void isWin_true_v2() {
        gameField[0][0] = playerX.getSymbol();
        gameField[2][0] = playerX.getSymbol();
        gameField[3][0] = playerX.getSymbol();
        gameField[1][0] = playerX.getSymbol();

        boolean actual = verticalWinPositionDetector.isWin(gameField, playerX);
        assertTrue(actual);
    }

    @Test
    public void isWin_true_v3() {
        gameField[0][6] = playerX.getSymbol();
        gameField[2][6] = playerX.getSymbol();
        gameField[3][6] = playerX.getSymbol();
        gameField[1][6] = playerX.getSymbol();

        boolean actual = verticalWinPositionDetector.isWin(gameField, playerX);
        assertTrue(actual);
    }

    @Test
    public void isWin_true_v4() {
        gameField[5][6] = playerX.getSymbol();
        gameField[2][6] = playerX.getSymbol();
        gameField[3][6] = playerX.getSymbol();
        gameField[4][6] = playerX.getSymbol();

        boolean actual = verticalWinPositionDetector.isWin(gameField, playerX);
        assertTrue(actual);
    }

    @Test
    public void isWin_true_v5() {
        gameField[1][3] = playerX.getSymbol();
        gameField[2][3] = playerX.getSymbol();
        gameField[3][3] = playerX.getSymbol();
        gameField[4][3] = playerX.getSymbol();

        boolean actual = verticalWinPositionDetector.isWin(gameField, playerX);
        assertTrue(actual);
    }

    @Test
    public void isWin_false_v1() {
        gameField[1][3] = playerX.getSymbol();
        gameField[2][3] = playerX.getSymbol();
        gameField[3][3] = playerX.getSymbol();

        boolean actual = verticalWinPositionDetector.isWin(gameField, playerX);
        assertFalse(actual);
    }

    @Test
    public void isWin_false_v2() {
        gameField[1][3] = playerX.getSymbol();
        gameField[2][3] = playerX.getSymbol();
        gameField[3][3] = playerX.getSymbol();
        gameField[4][3] = playerO.getSymbol();

        boolean actual = verticalWinPositionDetector.isWin(gameField, playerX);
        assertFalse(actual);
    }

    @Test
    public void isWin_false_v3() {
        gameField[1][0] = playerO.getSymbol();
        gameField[2][0] = playerX.getSymbol();
        gameField[3][0] = playerX.getSymbol();
        gameField[0][0] = playerO.getSymbol();

        boolean actual = verticalWinPositionDetector.isWin(gameField, playerX);
        assertFalse(actual);
    }

    private String[][] createField(){
        String[][] field = new String[6][7];

        for (int i = 0; i < field.length; i++){
            for (int  j = 0; j < field[0].length; j++){
                field[i][j] = "-";
            }
        }
        return field;
    }
}