package student_julija_skopeca.practical_tasks.lesson_6.day_6;

import java.util.Scanner;

class TicTacToe {

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

    public int[][] createField() {
        int[][]field = new int[3][3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = -1;
            }
        }
        return field;
    }

    public Move getNextMove() {
        System.out.println("Further enter a cell number of a row and column - 0 to 2");
        System.out.println("Enter number of cell in the row: ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Enter number of cell in the column: ");
        int y = new Scanner(System.in).nextInt();
        return new Move(x,y);
    }

    public void printFieldToConsole(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void play() {
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

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < 3; i++){
            if ((field[i][0] == playerToCheck) && (field[i][1] == playerToCheck) &&
                    (field[i][2] == playerToCheck)) {
                return true;
            }
        }
        return false;
    }

    public boolean isisWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < 3; i++){
            if ((field[0][i] == playerToCheck) && (field[1][i] == playerToCheck) &&
                    (field[2][i] == playerToCheck)) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        for (int i = 0; i < 3; i++){
            if ((field[0][0] == playerToCheck) &&
                    (field[1][1] == playerToCheck) &&
                    (field[2][2] == playerToCheck) ||
                    (field[2][0] == playerToCheck) &&
                            (field[1][1] == playerToCheck) &&
                            (field[0][2] == playerToCheck))
            {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        if (isWinPositionForHorizontals(field,playerToCheck) ||
                isisWinPositionForVerticals(field,playerToCheck) ||
                isWinPositionForDiagonals(field,playerToCheck)) {
            return true;
        } else {
            return false;}
    }


    public boolean isTableFull(int[][] field) {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (field[i][j] == -1)
                    return true;
        return false;
    }


    public boolean isDrawPosition(int[][] field) {

        if (isWinPosition(field, 0) ||
                isWinPosition(field,1) ||
                isTableFull(field)) {
            return false;
        } else {
            return true;}
    }
}
