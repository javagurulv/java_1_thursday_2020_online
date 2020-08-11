package student_vadims_vladisevs.lesson9.day_x.super_task_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiagonalWinPositionDetectorTest {

    String[][] gameField = createField();
    Player playerX = new Player("X");
    Player playerO = new Player("O");
    DiagonalWinPositionDetector diagonalWinPositionDetector = new DiagonalWinPositionDetector();


    @Test
    public void isWinLeftDiagonal_true_v1() {
        gameField[2][0] = playerX.getSymbol();
        gameField[3][1] = playerX.getSymbol();
        gameField[4][2] = playerX.getSymbol();
        gameField[5][3] = playerX.getSymbol();
        boolean actual = diagonalWinPositionDetector.isWin(gameField, playerX);
        assertTrue(actual);
    }

    @Test
    public void isWinLeftDiagonal_true_v10() {
        gameField[0][0] = playerX.getSymbol();
        gameField[1][1] = playerX.getSymbol();
        gameField[2][2] = playerX.getSymbol();
        gameField[3][3] = playerX.getSymbol();
        boolean actual = diagonalWinPositionDetector.isWin(gameField, playerX);
        assertTrue(actual);
    }

    @Test
    public void isWinLeftDiagonal_true_v11() {
        gameField[4][4] = playerX.getSymbol();
        gameField[1][1] = playerX.getSymbol();
        gameField[2][2] = playerX.getSymbol();
        gameField[3][3] = playerX.getSymbol();
        boolean actual = diagonalWinPositionDetector.isWin(gameField, playerX);
        assertTrue(actual);
    }

    @Test
    public void isWinLeftDiagonal_true_v12() {
        gameField[4][4] = playerX.getSymbol();
        gameField[5][5] = playerX.getSymbol();
        gameField[2][2] = playerX.getSymbol();
        gameField[3][3] = playerX.getSymbol();
        boolean actual = diagonalWinPositionDetector.isWin(gameField, playerX);
        assertTrue(actual);
    }

    @Test
    public void isWinLeftDiagonal_true_v2() {
        gameField[1][0] = playerX.getSymbol();
        gameField[2][1] = playerX.getSymbol();
        gameField[3][2] = playerX.getSymbol();
        gameField[4][3] = playerX.getSymbol();
        boolean actual = diagonalWinPositionDetector.isWin(gameField, playerX);
        assertTrue(actual);
    }

    @Test
    public void isWinLeftDiagonal_true_v3() {
        gameField[2][1] = playerX.getSymbol();
        gameField[3][2] = playerX.getSymbol();
        gameField[4][3] = playerX.getSymbol();
        gameField[5][4] = playerX.getSymbol();
        boolean actual = diagonalWinPositionDetector.isWin(gameField, playerX);
        assertTrue(actual);
    }

    @Test
    public void isWinLeftDiagonal_true_v4() {
        gameField[0][1] = playerX.getSymbol();
        gameField[1][2] = playerX.getSymbol();
        gameField[2][3] = playerX.getSymbol();
        gameField[3][4] = playerX.getSymbol();
        boolean actual = diagonalWinPositionDetector.isWin(gameField, playerX);
        assertTrue(actual);
    }

    @Test
    public void isWinLeftDiagonal_true_v5() {
        gameField[4][5] = playerX.getSymbol();
        gameField[1][2] = playerX.getSymbol();
        gameField[2][3] = playerX.getSymbol();
        gameField[3][4] = playerX.getSymbol();
        boolean actual = diagonalWinPositionDetector.isWin(gameField, playerX);
        assertTrue(actual);
    }

    @Test
    public void isWinLeftDiagonal_true_v6() {
        gameField[2][3] = playerX.getSymbol();
        gameField[3][4] = playerX.getSymbol();
        gameField[4][5] = playerX.getSymbol();
        gameField[5][6] = playerX.getSymbol();
        boolean actual = diagonalWinPositionDetector.isWin(gameField, playerX);
        assertTrue(actual);
    }

    @Test
    public void isWinLeftDiagonal_true_v7() {
        gameField[0][2] = playerX.getSymbol();
        gameField[1][3] = playerX.getSymbol();
        gameField[2][4] = playerX.getSymbol();
        gameField[3][5] = playerX.getSymbol();
        boolean actual = diagonalWinPositionDetector.isWin(gameField, playerX);
        assertTrue(actual);
    }

    @Test
    public void isWinLeftDiagonal_true_v8() {
        gameField[0][3] = playerX.getSymbol();
        gameField[1][4] = playerX.getSymbol();
        gameField[2][5] = playerX.getSymbol();
        gameField[3][6] = playerX.getSymbol();
        boolean actual = diagonalWinPositionDetector.isWin(gameField, playerX);
        assertTrue(actual);
    }

    @Test
    public void isWinLeftDiagonal_true_v9() {
        gameField[4][6] = playerX.getSymbol();
        gameField[1][3] = playerX.getSymbol();
        gameField[2][4] = playerX.getSymbol();
        gameField[3][5] = playerX.getSymbol();
        boolean actual = diagonalWinPositionDetector.isWin(gameField, playerX);
        assertTrue(actual);
    }

    @Test
    public void isWinRightDiagonal_true_v1() {
        gameField[0][6] = playerX.getSymbol();
        gameField[1][5] = playerX.getSymbol();
        gameField[2][4] = playerX.getSymbol();
        gameField[3][3] = playerX.getSymbol();
        boolean actual = diagonalWinPositionDetector.isWin(gameField, playerX);
        assertTrue(actual);
    }

    @Test
    public void isWinRightDiagonal_true_v2() {
        gameField[4][2] = playerX.getSymbol();
        gameField[1][5] = playerX.getSymbol();
        gameField[2][4] = playerX.getSymbol();
        gameField[3][3] = playerX.getSymbol();
        boolean actual = diagonalWinPositionDetector.isWin(gameField, playerX);
        assertTrue(actual);
    }

    @Test
    public void isWinRightDiagonal_true_v3() {
        gameField[4][2] = playerX.getSymbol();
        gameField[5][1] = playerX.getSymbol();
        gameField[2][4] = playerX.getSymbol();
        gameField[3][3] = playerX.getSymbol();
        boolean actual = diagonalWinPositionDetector.isWin(gameField, playerX);
        assertTrue(actual);
    }

    @Test
    public void isWinRightDiagonal_true_v4() {
        gameField[0][5] = playerX.getSymbol();
        gameField[1][4] = playerX.getSymbol();
        gameField[2][3] = playerX.getSymbol();
        gameField[3][2] = playerX.getSymbol();
        boolean actual = diagonalWinPositionDetector.isWin(gameField, playerX);
        assertTrue(actual);
    }

    @Test
    public void isWinRightDiagonal_true_v5() {
        gameField[4][1] = playerX.getSymbol();
        gameField[1][4] = playerX.getSymbol();
        gameField[2][3] = playerX.getSymbol();
        gameField[3][2] = playerX.getSymbol();
        boolean actual = diagonalWinPositionDetector.isWin(gameField, playerX);
        assertTrue(actual);
    }

    @Test
    public void isWinRightDiagonal_true_v6() {
        gameField[5][0] = playerX.getSymbol();
        gameField[4][1] = playerX.getSymbol();
        gameField[2][3] = playerX.getSymbol();
        gameField[3][2] = playerX.getSymbol();
        boolean actual = diagonalWinPositionDetector.isWin(gameField, playerX);
        assertTrue(actual);
    }

    @Test
    public void isWinRightDiagonal_true_v7() {
        gameField[0][4] = playerX.getSymbol();
        gameField[1][3] = playerX.getSymbol();
        gameField[2][2] = playerX.getSymbol();
        gameField[3][1] = playerX.getSymbol();
        boolean actual = diagonalWinPositionDetector.isWin(gameField, playerX);
        assertTrue(actual);
    }

    @Test
    public void isWinRightDiagonal_true_v8() {
        gameField[1][3] = playerX.getSymbol();
        gameField[2][2] = playerX.getSymbol();
        gameField[3][1] = playerX.getSymbol();
        gameField[4][0] = playerX.getSymbol();
        boolean actual = diagonalWinPositionDetector.isWin(gameField, playerX);
        assertTrue(actual);
    }

    @Test
    public void isWinRightDiagonal_true_v9() {
        gameField[0][3] = playerX.getSymbol();
        gameField[1][2] = playerX.getSymbol();
        gameField[2][1] = playerX.getSymbol();
        gameField[3][0] = playerX.getSymbol();
        boolean actual = diagonalWinPositionDetector.isWin(gameField, playerX);
        assertTrue(actual);
    }

    @Test
    public void isWinRightDiagonal_true_v10() {
        gameField[1][6] = playerX.getSymbol();
        gameField[2][5] = playerX.getSymbol();
        gameField[3][4] = playerX.getSymbol();
        gameField[4][3] = playerX.getSymbol();
        boolean actual = diagonalWinPositionDetector.isWin(gameField, playerX);
        assertTrue(actual);
    }

    @Test
    public void isWinRightDiagonal_true_v11() {
        gameField[5][2] = playerX.getSymbol();
        gameField[2][5] = playerX.getSymbol();
        gameField[3][4] = playerX.getSymbol();
        gameField[4][3] = playerX.getSymbol();
        boolean actual = diagonalWinPositionDetector.isWin(gameField, playerX);
        assertTrue(actual);
    }

    @Test
    public void isWinRightDiagonal_true_v12() {
        gameField[2][6] = playerX.getSymbol();
        gameField[3][5] = playerX.getSymbol();
        gameField[4][4] = playerX.getSymbol();
        gameField[5][3] = playerX.getSymbol();
        boolean actual = diagonalWinPositionDetector.isWin(gameField, playerX);
        assertTrue(actual);
    }

    @Test
    public void isWin_false_v1() {
        boolean actual = diagonalWinPositionDetector.isWin(gameField, playerX);
        assertFalse(actual);
    }

    @Test
    public void isWin_false_v2() {
        gameField[2][6] = playerX.getSymbol();
        gameField[3][5] = playerX.getSymbol();
        gameField[4][4] = playerX.getSymbol();
        gameField[5][3] = playerO.getSymbol();

        boolean actual = diagonalWinPositionDetector.isWin(gameField, playerX);
        assertFalse(actual);
    }

    @Test
    public void isWin_false_v3() {
        gameField[1][1] = playerX.getSymbol();
        gameField[2][2] = playerX.getSymbol();
        gameField[3][3] = playerX.getSymbol();
        gameField[4][4] = playerO.getSymbol();

        boolean actual = diagonalWinPositionDetector.isWin(gameField, playerX);
        assertFalse(actual);
    }

    @Test
    public void isWin_false_v4() {
        gameField[1][1] = playerX.getSymbol();
        gameField[2][2] = playerX.getSymbol();
        gameField[3][3] = playerX.getSymbol();

        boolean actual = diagonalWinPositionDetector.isWin(gameField, playerX);
        assertFalse(actual);
    }

    @Test
    public void isWin_false_v5() {
        gameField[1][1] = playerX.getSymbol();
        gameField[2][2] = playerX.getSymbol();
        gameField[3][3] = playerX.getSymbol();
        gameField[5][5] = playerX.getSymbol();

        boolean actual = diagonalWinPositionDetector.isWin(gameField, playerX);
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