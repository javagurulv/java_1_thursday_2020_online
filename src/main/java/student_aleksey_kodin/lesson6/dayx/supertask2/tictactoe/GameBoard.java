package student_aleksey_kodin.lesson6.dayx.supertask2.tictactoe;

public class GameBoard {

    public int[][] createGameBoard() {
        final int FREE_CELL = -1;
        final int NUMBER_OF_ROW = 3;
        final int NUMBER_OF_COLUMN = 3;

        int[][] field = new int[NUMBER_OF_ROW][NUMBER_OF_COLUMN];
        for (int row = 0; row < field.length; row++) {
            for (int column = 0; column < field[0].length; column++) {
                field[row][column] = FREE_CELL;
            }
        }
        return field;
    }

    public void printGameBoardToConsole(int[][] field) {
        final int PLAYER_ONE = 0;
        final int PLAYER_TWO = 1;

        for (int[] row : field) {
            System.out.println();
            for (int column = 0; column < field[0].length; column++) {
                if ((row[column] == PLAYER_ONE) || (row[column] == PLAYER_TWO)) {
                    System.out.print(" " + row[column] + " ");
                } else {
                    System.out.print(row[column] + " ");
                }
            }
        }
        System.out.println();
    }
}



