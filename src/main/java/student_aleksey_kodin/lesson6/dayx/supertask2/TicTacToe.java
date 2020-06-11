package student_aleksey_kodin.lesson6.dayx.supertask2;

import java.util.InputMismatchException;
import java.util.Scanner;

class TicTacToe {
    private int rowWinPosition;
    private int columnWinPosition;
    private int rowMovePosition;
    private int columnMovePosition;

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }
    public int[][] createField() {
        int[][] field = new int[3][3];
        for (int row = 0; row < field.length; row++) {
            for (int column = 0; column < field[0].length; column++) {
                field[row][column] = -1;
            }
        }
    return field;
    }
    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int[] row : field) {
            if ((row[0] == playerToCheck) && (row[1] == playerToCheck) && (row[2] == playerToCheck)) {
                return true;
            }
        }
    return false;
    }
    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
            for (int column = 0; column < field[0].length; column++) {
                if ((field[0][column] == playerToCheck) && (field[1][column] == playerToCheck) &&
                        (field[2][column] == playerToCheck)) {
                    return true;
                }
            }
    return false;
    }
    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        if (field[1][1] != playerToCheck) return false;
        if ((field[0][0] == playerToCheck) && (field[2][2] == playerToCheck)) return true;
        return (field[0][2] == playerToCheck) && (field[2][0] == playerToCheck);
    }
    public boolean isWinPosition(int[][] field,int playerToCheck) {
        if (isWinPositionForHorizontals(field,playerToCheck)) return true;
        if (isWinPositionForVerticals(field,playerToCheck)) return true;
        return isWinPositionForDiagonals(field, playerToCheck);
    }
    public boolean isWin(int[][] field,int playerToCheck) {
        for (int row = 0; row < field.length; row++) {
           if (isTwoInRow(field[row][0], field[row][1], field[row][2]) &&
                   isPlayerWinCombination(field[row][0], field[row][1], field[row][2],playerToCheck)
                        && (findWinRowAndColumn(field, row, true))) {
           return true;
           }
        }
            for (int column = 0; column < field[0].length; column++) {
                if (isTwoInRow(field[0][column],field[1][column],field[2][column]) &&
                      isPlayerWinCombination(field[0][column],field[1][column],field[2][column],playerToCheck)
                          && findWinRowAndColumn(field, column, false)) {
                return true;
                }
            }
        if (isTwoInRow(field[0][0],field[1][1],field[2][2])) {
            return  findWinDiagonals(field,true);
            }

        if (isTwoInRow(field[0][2],field[1][1],field[2][0])) {
            return findWinDiagonals(field, false);
        }
    return false;
    }
    public boolean isDraw(int[][] field,int playerToCheck) {
        if (isWinPositionForHorizontals(field,playerToCheck) && isWinPositionForVerticals(field,playerToCheck) &&
                isWinPositionForDiagonals(field,playerToCheck)) return true;
    return !isFreeCell(field);
    }
    public void printFieldToConsole(int[][] field) {
        for (int[] row : field) {
            System.out.println();
            for (int column = 0; column < field[0].length; column++) {
                if ((row[column] == 0) || (row[column] == 1)) {
                    System.out.print(" " + row[column] + " ");
                } else {
                    System.out.print(row[column] + " ");
                }
            }
        }
        System.out.println();
    }
    public void play() {
        int[][] field = createField();
        while(true) {
            if (movePlayer0(field)) {
                field[getRowMovePosition()][getColumnMovePosition()] = 0;
            }
            printFieldToConsole(field);

            if (checkToWin(field,0)) { break; }
            if (checkToDraw(field, 0)) { break; }

            movePlayer1(field);

            printFieldToConsole(field);

            if (checkToWin(field, 1)) { break; }
            if (checkToDraw(field, 1)) { break; }
        }
    }
    private boolean movePlayer0(int[][] field) {
            if (isComputerCanWin(field,0)) {
                setWinMovePosition();
                return true;
            }
            if (isPlayerCanWin(field,1)) {
                setWinMovePosition();
                return true;
            }
    return checkNextMove(field);
    }
    private boolean isComputerCanWin(int[][] field,int playerToCheck) {
        return isWin(field,playerToCheck);
    }
    private boolean isPlayerCanWin(int[][] field,int playerToCheck) {
        return isWin(field,playerToCheck);
    }
    private void setWinMovePosition() {
        setRowMovePosition(getRowWinPosition());
        setColumnMovePosition(getColumnWinPosition());
    }
    private void movePlayer1(int[][] field) {
        while (true) {
            Move move1 = getNextMove();
            if (isPlayerDoIllegalMove(move1)) {
                printErrorMessage();
                continue;
            }
            if (isPlayerMoveToFreeCell(field,move1)) {
                field[move1.getRow()][move1.getColumn()] = 1;
                break;
            } else {
                printErrorMessage();
            }
        }
    }
    public Move getNextMove() {
        int row = -1;
        int column = -1;
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
        return playerMove.getRow() == -1 || playerMove.getColumn() == -1;
    }
    private boolean isPlayerMoveToFreeCell(int[][] field,Move playerMove) {
        return field[playerMove.getRow()][playerMove.getColumn()] == -1;
    }
    private void printErrorMessage() {
        System.out.println("Illegal move. Try again");
    }
    private boolean checkToDraw(int[][] field,int playerToCheck) {
        if (isDraw(field, playerToCheck)) {
            System.out.println("DRAW!");
            return true;
        }
    return false;
    }
    private boolean checkToWin(int[][] field, int playerToCheck) {
        if (isWinPosition(field, playerToCheck)) {
            System.out.println("Player " + playerToCheck + " WIN!");
            return true;
        }
    return false;
    }
    public int getRowWinPosition() {
        return rowWinPosition;
    }
    public void setRowWinPosition(int rowWinPosition) {
        this.rowWinPosition = rowWinPosition;
    }
    public int getColumnWinPosition() {
        return columnWinPosition;
    }
    public void setColumnWinPosition(int columnWinPosition) {
        this.columnWinPosition = columnWinPosition;
    }
    public int getRowMovePosition() {
        return rowMovePosition;
    }
    public void setRowMovePosition(int rowMovePosition) {
        this.rowMovePosition = rowMovePosition;
    }
    public int getColumnMovePosition() {
        return columnMovePosition;
    }
    public void setColumnMovePosition(int columnMovePosition) {
        this.columnMovePosition = columnMovePosition;
    }
    private boolean isTwoInRow(int firstValue, int secondValue, int thirdValue){
        if (firstValue == -1 && secondValue == -1 && thirdValue == -1) return false;
        if (!isEmptyCell(firstValue,secondValue,thirdValue)) return false;
        return firstValue == secondValue || secondValue == thirdValue || firstValue == thirdValue;
    }
    private boolean findWinRowAndColumn(int[][] field,int position,boolean isRow) {
        for (int count = 0; count < 3; count++) {
            if(isRow) {
                if (field[position][count] == -1) {
                    setRowWinPosition(position);
                    setColumnWinPosition(count);
                    return true;
                }
            } else {
                if (field[count][position] == -1) {
                    setRowWinPosition(count);
                    setColumnWinPosition(position);
                    return true;
                }
            }
        }
    return false;
    }
    private boolean findWinDiagonals(int[][] field,boolean isLeftToRight) {
        if (isLeftToRight) {
            for (int count = 0; count < 3; count++) {
                if (field[count][count] == -1) {
                    setRowWinPosition(count);
                    setColumnWinPosition(count);
                    return true;
                }
            }
        } else {
            int shift = 0;
            for (int count = 2; count >= 0; count--) {
                if (field[shift][count] == -1) {
                    setRowWinPosition(shift);
                    setColumnWinPosition(count);
                    return true;
                }
                shift++;
            }
        }
    return false;
    }
    private boolean isEmptyCell(int firstValue, int secondValue, int thirdValue) {
        if (firstValue == secondValue) {
            if (firstValue == -1) return false;
        }
        if (secondValue == thirdValue) {
            if (secondValue == -1) return false;
        }
        if (firstValue == thirdValue) {
            return firstValue != -1;
        }
    return true;
    }
    private boolean isFreeCell(int[][] field) {
        for (int row = 0; row < field.length; row++) {
            for (int column = 0; column < field[0].length; column++) {
                if (field[row][column] == -1) {
                    setNextMove(row,column);
                    return true;
                }
            }
        }
    return false;
    }
    private boolean checkNextMove(int[][] field) {
        if (isHaveFreeCell(field[0][0])) {
            setNextMove(0,0);
            return true;
        }
        if (isHaveFreeCell(field[2][0])) {
            setNextMove(2,0);
            return true;
        }
        if (isHaveFreeCell(field[2][2])) {
            setNextMove(2,2);
            return true;
        }
        if (isHaveFreeCell(field[0][2])) {
            setNextMove(0,2);
            return true;
        }
        if (isHaveFreeCell(field[1][1])) {
            setNextMove(1,1);
            return true;
        }
        return isFreeCell(field);
    }
    private boolean isHaveFreeCell(int cell) {
        final int FREE_CELL = -1;
        return cell == FREE_CELL;
    }
    private void  setNextMove(int row, int column) {
        setRowMovePosition(row);
        setColumnMovePosition(column);
    }
    private boolean isPlayerWinCombination(int firstValue, int secondValue, int thirdValue,int playerToCheck) {
        return firstValue == playerToCheck || secondValue == playerToCheck || thirdValue == playerToCheck;
    }
}
