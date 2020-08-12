package student_aleksey_kodin.lesson6.dayx.supertask2.tictactoe;

import java.util.InputMismatchException;
import java.util.Scanner;

class HumanMove {
    private final int FREE_CELL = -1;

    public void humanMove(Player player, int[][] field) {
        while (true) {
            Move move = getNextMove();
            if (isPlayerDoIllegalMove(move)) {
                printErrorMessage();
                continue;
            }
            if (isPlayerMoveToFreeCell(field, move)) {
                field[move.getRow()][move.getColumn()] = player.getPlayerFigure();
                break;
            } else {
                printErrorMessage();
            }
        }
    }

    private Move getNextMove() {
        int row = FREE_CELL;
        int column = FREE_CELL;
        try {
            System.out.println("Input row:");
            row = getPlayerMove();
            System.out.println("Input column:");
            column = getPlayerMove();

        } catch (InputMismatchException e) {
            System.out.println("Please enter numbers from 0 to 2");
        }
        return new Move(row, column);
    }

    private int getPlayerMove() {
        return new Scanner(System.in).nextInt();
    }

    private boolean isPlayerDoIllegalMove(Move playerMove) {
        return playerMove.getRow() == FREE_CELL || playerMove.getColumn() == FREE_CELL;
    }

    private void printErrorMessage() {
        System.out.println("Illegal move. Try again");
    }

    private boolean isPlayerMoveToFreeCell(int[][] field, Move playerMove) {
        return field[playerMove.getRow()][playerMove.getColumn()] == FREE_CELL;
    }
}
