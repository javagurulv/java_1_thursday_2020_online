package student_vadims_vladisevs.lesson6.day_6;

import java.util.Arrays;
import java.util.Scanner;

class TicTacToe {


    public void play() {
        int[][] field = createField();
        while(true) {
            printFieldToConsole(field);
            while (true) {
                Move move0 = getNextMove();
                if ((field[move0.getX()][move0.getY()] == -1)) {
                    field[move0.getX()][move0.getY()] = 0;
                    break;
                } else {
                    System.out.println("Game field cell not empty. Try again! ");
                }
            }
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
            System.out.println("----------");
            System.out.println("Next player move!");

            printFieldToConsole(field);
            while (true) {
                Move move1 = getNextMove();
                if ((field[move1.getX()][move1.getY()] == -1)) {
                    field[move1.getX()][move1.getY()] = 1;
                    break;
                } else {
                    System.out.println("Game field cell not empty. Try again! ");
                }
            }
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
            System.out.println("----------");
            System.out.println("Next player move!");
        }
    }


    public Move getNextMove(){
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter X coordinate: ");
        int x = scr.nextInt();
        System.out.println("Enter Y coordinate: ");
        int y = scr.nextInt();
        return new Move(x,y);
    }


    public boolean isDrawPosition(int[][] field){

        if ((!isWinPosition(field, 0)) && (!isWinPosition(field, 1))) {
            int count = 0;
            for (int i = 0; i < field.length; i++) {
                int[] tempArray = getRow(field, i);
                for (int tempValue : tempArray) {
                    if (tempValue == -1) {
                        count++;
                    }
                }
            }
            return count == 0;
        }

        return false;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck){
        if (isWinPositionForVerticals(field,playerToCheck)){
            return true;
        }

        if (isWinPositionForHorizontals(field, playerToCheck)){
            return true;
        }

        if (isWinPositionForDiagonals(field, playerToCheck)){
            return true;
        }

        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck){
        int[] tempArray = getFirstDiagonal(field);
        if ((tempArray[0] == playerToCheck) && (tempArray[1] == playerToCheck) && (tempArray[2] == playerToCheck)){
            return true;
        }

        tempArray = getSecondDiagonal(field);
        if ((tempArray[0] == playerToCheck) && (tempArray[1] == playerToCheck) && (tempArray[2] == playerToCheck)){
            return true;
        }

        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck){
        for (int i = 0; i < field.length; i++) {
            int[] tempArray = getColumn(field, i);
            if ((tempArray[0] == playerToCheck) && (tempArray[1] == playerToCheck) && (tempArray[2] == playerToCheck)){
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            int[] tempArray = getRow(field, i);
            if ((tempArray[0] == playerToCheck) && (tempArray[1] == playerToCheck) && (tempArray[2] == playerToCheck)){
                return true;
            }
        }
        return false;
    }

    public int[] getFirstDiagonal(int[][] array){
        int[] tempArray = new int[array.length];
        for (int i = 0; i < array.length; i++){
            tempArray[i] = array[i][i];
        }
        return tempArray;
    }

    public int[] getSecondDiagonal(int[][] array){
        int[] tempArray = new int[array.length];
        tempArray[0] = array[0][2];
        tempArray[1] = array[1][1];
        tempArray[2] = array[2][0];
        return tempArray;
    }


    public int[] getRow(int[][] array, int index){
        return array[index];
    }


    public int[] getColumn(int[][] array, int index) {
        int[] tempArray = new int[array[0].length];
        for (int i = 0; i < tempArray.length; i++ ){
            tempArray[i] = array[i][index];
        }
        return tempArray;
    }





    public int[][] createField(){
        int[][] gameField = new int[3][3];
        for (int i = 0; i < gameField.length; i++){
            Arrays.fill(gameField[i], -1);
        }
        return gameField;
    }

    public void printFieldToConsole(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public boolean isFieldEmpty(int[][] field){
        int count = 0;
        for (int i = 0; i < field.length; i++) {
            int[] tempArray = getRow(field, i);
            for (int tempValue : tempArray) {
                if (tempValue != -1) {
                    count++;
                }
            }
        }
        return count == 0;

    }


}
