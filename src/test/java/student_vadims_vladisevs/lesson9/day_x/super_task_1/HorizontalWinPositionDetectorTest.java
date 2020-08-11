package student_vadims_vladisevs.lesson9.day_x.super_task_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class HorizontalWinPositionDetectorTest {
    Player playerX = new Player("X");
    Player playerO = new Player("O");
    String[][] gameField = createField();
    HorizontalWinPositionDetector horizontalWinPositionDetector = new HorizontalWinPositionDetector();

    @Test
    public void isWin_true_v1() {
        gameField[5][0] = playerX.getSymbol();
        gameField[5][1] = playerX.getSymbol();
        gameField[5][2] = playerX.getSymbol();
        gameField[5][3] = playerX.getSymbol();

        boolean actual = horizontalWinPositionDetector.isWin(gameField, playerX);
        assertTrue(actual);
    }

    @Test
    public void isWin_true_v2() {
        gameField[5][4] = playerX.getSymbol();
        gameField[5][1] = playerX.getSymbol();
        gameField[5][2] = playerX.getSymbol();
        gameField[5][3] = playerX.getSymbol();

        boolean actual = horizontalWinPositionDetector.isWin(gameField, playerX);
        assertTrue(actual);
    }

    @Test
    public void isWin_true_v3() {
        gameField[0][6] = playerX.getSymbol();
        gameField[0][5] = playerX.getSymbol();
        gameField[0][4] = playerX.getSymbol();
        gameField[0][3] = playerX.getSymbol();

        boolean actual = horizontalWinPositionDetector.isWin(gameField, playerX);
        assertTrue(actual);
    }

    @Test
    public void isWin_true_v4() {
        gameField[3][4] = playerX.getSymbol();
        gameField[3][3] = playerX.getSymbol();
        gameField[3][2] = playerX.getSymbol();
        gameField[3][1] = playerX.getSymbol();

        boolean actual = horizontalWinPositionDetector.isWin(gameField, playerX);
        assertTrue(actual);
    }

    @Test
    public void isWin_true_v5() {
        gameField[2][0] = playerX.getSymbol();
        gameField[2][3] = playerX.getSymbol();
        gameField[2][2] = playerX.getSymbol();
        gameField[2][1] = playerX.getSymbol();

        boolean actual = horizontalWinPositionDetector.isWin(gameField, playerX);
        assertTrue(actual);
    }

    @Test
    public void isWin_false_v1() {
        gameField[2][0] = playerX.getSymbol();
        gameField[2][3] = playerX.getSymbol();
        gameField[2][2] = playerX.getSymbol();
        gameField[2][1] = playerO.getSymbol();

        boolean actual = horizontalWinPositionDetector.isWin(gameField, playerX);
        assertFalse(actual);
    }

    @Test
    public void isWin_false_v2() {
        gameField[2][0] = playerX.getSymbol();
        gameField[2][3] = playerX.getSymbol();
        gameField[2][2] = playerX.getSymbol();

        boolean actual = horizontalWinPositionDetector.isWin(gameField, playerX);
        assertFalse(actual);
    }

    @Test
    public void isWin_false_v3() {
        gameField[0][6] = playerO.getSymbol();
        gameField[0][5] = playerX.getSymbol();
        gameField[0][4] = playerX.getSymbol();
        gameField[0][3] = playerO.getSymbol();

        boolean actual = horizontalWinPositionDetector.isWin(gameField, playerX);
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