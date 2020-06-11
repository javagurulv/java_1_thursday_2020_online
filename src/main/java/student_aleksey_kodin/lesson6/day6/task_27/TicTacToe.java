package student_aleksey_kodin.lesson6.day6.task_27;

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
            if (isTwoInRow(field[row][0], field[row][1], field[row][2])) {
                if (isPlayerWinCombination(field[row][0], field[row][1], field[row][2],playerToCheck)) {
                    if (findWinRowAndColumn(field, row, true)) {
                        return true;
                    }
                }
            }
        }
            for (int column = 0; column < field[0].length; column++) {
                if (isTwoInRow(field[0][column],field[1][column],field[2][column])) {
                    if (isPlayerWinCombination(field[0][column],field[1][column],field[2][column],playerToCheck)) {
                        if (findWinRowAndColumn(field, column, false)) {
                            return true;
                        }
                    }
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
                isWinPositionForDiagonals(field,playerToCheck)) return false;
    return isFreePlace(field);
    }
    public Move getNextMove() {
        System.out.println("Input row: ");
            int row = new Scanner(System.in).nextInt();
                System.out.println("Input column: ");
                    int column = new Scanner(System.in).nextInt();
    return new Move(row,column);
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
            Move move0 = getNextMove();
            field[move0.getRow()][move0.getColumn()] = 0;
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (!isDraw(field,0)) {
                System.out.println("DRAW!");
                break;
            }
            Move move1 = getNextMove();
            field[move1.getRow()][move1.getColumn()] = 1;
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (!isDraw(field,1)) {
                System.out.println("DRAW!");
                break;
            }
        }
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
        if (!isEmptyPlace(firstValue,secondValue,thirdValue)) return false;
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
    private boolean isEmptyPlace(int firstValue, int secondValue, int thirdValue) {
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
    private boolean isFreePlace(int[][] field) {
        for (int row = 0; row < field.length; row++) {
            for (int column = 0; column < field[0].length; column++) {
                if (field[row][column] == -1) {
                    setRowMovePosition(row);
                    setColumnMovePosition(column);
                    return true;
                }
            }
        }
    return false;
    }
    private boolean checkNextMove(int[][] field) {
        if (field[0][0] == -1) {
            setRowMovePosition(0);
            setColumnMovePosition(0);
            return true;
        }
        if (field[2][0] == -1) {
            setRowMovePosition(2);
            setColumnMovePosition(0);
            return true;
        }
        if (field[2][2] == -1) {
            setRowMovePosition(2);
            setColumnMovePosition(2);
            return true;
        }
        if (field[0][2] == -1) {
            setRowMovePosition(0);
            setColumnMovePosition(2);
            return true;
        }
        if (field[1][1] == -1) {
            setRowMovePosition(1);
            setColumnMovePosition(1);
            return true;
        }
        return isFreePlace(field);
    }
    private boolean isPlayerWinCombination(int firstValue, int secondValue, int thirdValue,int playerToCheck) {
        return firstValue == playerToCheck || secondValue == playerToCheck || thirdValue == playerToCheck;
    }
}
