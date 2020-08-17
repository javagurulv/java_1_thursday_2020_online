package student_igors_mihejevs.lesson_6.homework.level_5_6;

import java.util.Arrays;
import java.util.Scanner;

class TicTacToe {

    // create field and initialise it (fill in with -1)
    int[][] createField() {
        int[][] field = new int[3][3];
        int initNumber = -1;
        for (int[] ints : field) {
            Arrays.fill(ints, initNumber);
        }
        return field;
    }

    void printFieldToConsole(int[][] field) {
        for (int[] ints : field) {
            System.out.println(Arrays.toString(ints));
        }
    }

    boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        boolean isWin = false;
        for (int[] ints : field) {
            int counter = 0;
            for (int anInt : ints) {
                if (anInt == playerToCheck) counter++;
            }
            if (counter == 3) {
                isWin = true;
                break;
            }
        }
        return isWin;
    }

    boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        boolean isWin = false;
        for (int i = 0; i < field.length; i++) {
            int counter = 0;
            for (int j = 0; j < field[i].length; j++) {
                if (field[j][i] == playerToCheck) counter++;
            }
            if (counter == 3) {
                isWin = true;
                break;
            }

        }
        return isWin;
    }

    boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        boolean isWin = false;

        if ((field[0][0] == field[1][1]) && (field[0][0] == field[2][2]) && (field[0][0] == playerToCheck))
            isWin = true;
        else if ((field[0][2] == field[1][1]) && (field[0][2] == field[2][0]) && (field[0][2] == playerToCheck))
            isWin = true;
        return isWin;
    }

    boolean isWinPosition(int[][] field, int playerToCheck) {
        return (isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck)
                || isWinPositionForDiagonals(field, playerToCheck));
    }

    boolean isDrawPosition(int[][] field) {
        boolean isDraw = false;
        boolean isEmpty = false;
        for (int[] ints : field) {
            for (int anInt : ints) {
                if (anInt == -1) {
                    isEmpty = true;
                    break;
                }
            }
            if (isEmpty) break;
        }
        if (!isEmpty && !isWinPosition(field, 0) && !isWinPosition(field, 1))
            isDraw = true;
        return isDraw;
    }

    Move getNextMove() {
        Scanner sc = new Scanner(System.in);

        int firstCoordinate;
        int secondCoordinate;
        System.out.println("You need to enter coordinates of place, where do you want to go");
        do {
            System.out.print("Input first coordinate X (row) - number between 1 and 3 : ");
            firstCoordinate = sc.nextInt() - 1;
            System.out.print("Input second coordinate Y (column) - number between 1 and 3 : ");
            secondCoordinate = sc.nextInt() - 1;
        }
        while (firstCoordinate < 0 || firstCoordinate > 2 || secondCoordinate < 0 || secondCoordinate > 2);
        return new Move(firstCoordinate, secondCoordinate);
    }

    void play() {
        int[][] field = createField();
        while(true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

}
