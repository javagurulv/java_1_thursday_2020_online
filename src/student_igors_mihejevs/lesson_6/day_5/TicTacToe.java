package student_igors_mihejevs.lesson_6.day_5;

import java.util.Arrays;

class TicTacToe {

    // create double array
    int[][] createDoubleArray(int arrayLength1, int arrayLength2) {
        return new int[arrayLength1][arrayLength2];
    }

    // initialise array (fill in with -1)
    void initializeArray(int[][] arr) {
        int initNumber = -1;
        for (int[] ints : arr) {
            Arrays.fill(ints, initNumber);
        }
    }

    // print double array
    void printDoubleArrayToConsole(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Row " + (i + 1) + " : " + Arrays.toString(arr[i]));
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

}
