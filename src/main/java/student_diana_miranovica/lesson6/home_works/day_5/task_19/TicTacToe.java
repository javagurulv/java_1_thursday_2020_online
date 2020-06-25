package student_diana_miranovica.lesson6.home_works.day_5.task_19;

import java.util.Scanner;

class TicTacToe {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }



    //task 19
    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int row[] : field) {
            if ((row[0] == playerToCheck) && (row[1] == playerToCheck) && (row[2] == playerToCheck)) {
                return true;
            }

        }

        return false;
    }

    //task 20
    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int column = 0; column < field[0].length; column++) {
            if ((field[0][column] == playerToCheck) && (field[1][column] == playerToCheck) &&
                    (field[2][column] == playerToCheck)) {
                return true;
            }
        }
        return false;
    }

    //task 21
    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {

        if (field[1][1] != playerToCheck) return false;
        if ((field[0][0] == playerToCheck) && (field[2][2] == playerToCheck)) return true;
        return ((field[0][2] == playerToCheck) && (field[2][0] == playerToCheck));

    }

    //task 22
    public boolean isWinPosition(int[][] field, int playerToCheck) {
        if (isWinPositionForHorizontals(field, playerToCheck)) return true;
        if (isWinPositionForVerticals(field, playerToCheck)) return true;
        return (isWinPositionForDiagonals(field,playerToCheck));
    }

    //task 23
    public boolean isDrawPosition(int[][] field, int playerToCheck) {
        if (isWinPositionForHorizontals(field, playerToCheck) ||
                isWinPositionForVerticals(field, playerToCheck) ||
                isWinPositionForDiagonals(field,playerToCheck) ||
                isTableFull(field)) {
            return true;
        } else {
            return false;}
    }

    public boolean isTableFull(int[][] field){

        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                if(field[i][j] == -1 )
                    return true;
        return false;
    }


    //task 24
    public int[][] createField(){
        int field [][] = new int[3][3];
        for (int i = 0; i < field.length; i++){
            for (int j = 0; j < field.length; j++){
                field[i][j] = -1;
            }
        }
        return field;

    }
    //task25
     public Move getNextMove() {
         System.out.println("Enter number in cell the column and the row from 0 to 2");
         System.out.println("Input number for the row: ");
         int row = new Scanner(System.in).nextInt();
         System.out.println("Input number for the column: ");
         int column = new Scanner(System.in).nextInt();
         return new Move(row,column);


     }

    //task 26
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
            field[move0.getRow()][move0.getColumn()] = 0;
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (!isDrawPosition(field, 0)) {
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
            if (!isDrawPosition(field, 1)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

}