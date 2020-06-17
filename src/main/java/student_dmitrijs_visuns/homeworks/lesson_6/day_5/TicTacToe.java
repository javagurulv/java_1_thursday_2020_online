package student_dmitrijs_visuns.homeworks.lesson_6.day_5;

import java.util.Scanner;

class TicTacToe {

    final int NUMBER_OF_HORIZONTALS = 3;
    final int NUMBER_OF_VERTICALS = 3;
    final int EMPTY_SPACE = 0;
    final int PLAYER_ONE = 1;
    final int PLAYER_TWO = 2;

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

    public void play() {
        int[][] gameField = createEmptyGameField();

        while(true) {

            playerOneMove(gameField);
            if (isWinPosition(gameField, PLAYER_ONE)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(gameField)) {
                System.out.println("DRAW!");
                break;
            }

            playerTwoMove(gameField);
            if (isWinPosition(gameField, PLAYER_TWO)) {
                System.out.println("Player 2 WIN!");
                break;
            }
            if (isDrawPosition(gameField)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

    public int[][] createEmptyGameField() {
        int[][] gameField = new int[NUMBER_OF_VERTICALS][NUMBER_OF_HORIZONTALS];
        for (int i = 0; i < NUMBER_OF_VERTICALS; i++) {
            for (int j = 0; j < NUMBER_OF_HORIZONTALS; j++) {
                gameField[i][j] = EMPTY_SPACE;
            }
        }
        return gameField;
    }


    public void printGameFieldToConsole(int[][] gameField) {
        for (int i = 0; i < NUMBER_OF_VERTICALS; i++) {
            for (int j = 0; j < NUMBER_OF_HORIZONTALS; j++) {
                System.out.print("  " + gameField[i][j] + "  ");
            }
            System.out.println("");
        }

    }

    public void playerOneMove (int[][]gameField) {
        printGameFieldToConsole(gameField);
        System.out.println("PLAYER 1 MOVE");
        Move playerOneMove = getMoveAndCheckIsItValid(gameField);
        gameField[playerOneMove.getX()][playerOneMove.getY()] = PLAYER_ONE;
    }

    public void playerTwoMove (int[][] gameField) {
        printGameFieldToConsole(gameField);
        System.out.println("PLAYER 2 MOVE");
        Move playerTwoMove = getMoveAndCheckIsItValid(gameField);
        gameField[playerTwoMove.getX()][playerTwoMove.getY()] = PLAYER_TWO;
    }

    public int inputCoordinateX () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X coordinate (0-" +(NUMBER_OF_HORIZONTALS -1) + "): ");
        int inputX = sc.nextInt();
        while (inputX < 0 || inputX > NUMBER_OF_HORIZONTALS -1) {
            System.out.println("Wrong coordinate, try again");
            inputX = sc.nextInt();
        }
        return inputX;
    }


    public int inputCoordinateY () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Y coordinate (0-" +(NUMBER_OF_VERTICALS -1) + "): ");
        int inputY = sc.nextInt();
        while (inputY < 0 || inputY > NUMBER_OF_VERTICALS -1) {
            System.out.println("Wrong coordinate, try again");
            inputY = sc.nextInt();
        }
        return inputY;
    }


    public Move getNextMove() {
        return new Move(inputCoordinateX(), inputCoordinateY());
    }


    public Move getMoveAndCheckIsItValid (int[][] gameField) {
        Move playerMove = getNextMove();
        while (gameField[playerMove.getX()][playerMove.getY()] != EMPTY_SPACE) {
            System.out.println("This field is already marked!");
            printGameFieldToConsole(gameField);
            playerMove = getNextMove();

        } return playerMove;
    }


    public boolean horizontalsWinPosition1 (int[][] gameField, int playerToCheck) {
        return (gameField [0][0] == playerToCheck &&
                gameField [0][1] == playerToCheck &&
                gameField [0][2] == playerToCheck);
    }


    public boolean horizontalsWinPosition2 (int[][] gameField, int playerToCheck) {
        return (gameField [1][0] == playerToCheck &&
                gameField [1][1] == playerToCheck &&
                gameField [1][2] == playerToCheck);
    }


    public boolean horizontalsWinPosition3 (int[][] gameField, int playerToCheck) {
        return (gameField [2][0] == playerToCheck &&
                gameField [2][1] == playerToCheck &&
                gameField [2][2] == playerToCheck);
    }


    public boolean isWinPositionForHorizontals(int[][] gameField, int playerToCheck) {
       if (horizontalsWinPosition1(gameField, playerToCheck) ||
           horizontalsWinPosition2(gameField, playerToCheck) ||
           horizontalsWinPosition3(gameField, playerToCheck)) {
               return true;
        } else return false;
    }


    public boolean verticalsWinPosition1 (int[][] gameField, int playerToCheck) {
        return (gameField [0][0] == playerToCheck &&
                gameField [1][0] == playerToCheck &&
                gameField [2][0] == playerToCheck);
    }


    public boolean verticalsWinPosition2 (int[][] gameField, int playerToCheck) {
        return (gameField [0][1] == playerToCheck &&
                gameField [1][1] == playerToCheck &&
                gameField [2][1] == playerToCheck);
    }


    public boolean verticalsWinPosition3 (int[][] gameField, int playerToCheck) {
        return (gameField [0][2] == playerToCheck &&
                gameField [1][2] == playerToCheck &&
                gameField [2][2] == playerToCheck);
    }


    public boolean isWinPositionForVerticals(int[][] gameField, int playerToCheck) {
        if (verticalsWinPosition1(gameField, playerToCheck) ||
            verticalsWinPosition2(gameField, playerToCheck) ||
            verticalsWinPosition3(gameField, playerToCheck)) {
            return true;
        } else return false;
    }


    public boolean diagonalsWinPosition1 (int[][] gameField, int playerToCheck) {
        return (gameField [0][0] == playerToCheck &&
                gameField [1][1] == playerToCheck &&
                gameField [2][2] == playerToCheck);
    }


    public boolean diagonalsWinPosition2 (int[][] gameField, int playerToCheck) {
        return (gameField [2][0] == playerToCheck &&
                gameField [1][1] == playerToCheck &&
                gameField [0][2] == playerToCheck);
    }


    public boolean isWinPositionForDiagonals(int[][] gameField, int playerToCheck) {
        if (diagonalsWinPosition1(gameField, playerToCheck) ||
            diagonalsWinPosition2(gameField, playerToCheck)) {
            return true;
        }
        else return false;
    }


    public boolean isWinPosition(int[][] field, int playerToCheck) {
        if (isWinPositionForHorizontals(field, playerToCheck) ||
            isWinPositionForVerticals(field, playerToCheck) ||
            isWinPositionForDiagonals(field, playerToCheck)) {
            return true;
        } else return false;
    }


    public boolean isEmptySpaces (int[][] gameField) {
        boolean isEmpty = false;
        for (int i = 0; i < NUMBER_OF_VERTICALS; i++) {
            for (int j = 0; j < NUMBER_OF_HORIZONTALS; j++) {
                if (gameField[i][j] == EMPTY_SPACE) {
                    isEmpty = true;
                    break;
                }
            }
        } return isEmpty;
    }


    public boolean isWinPositionForFirstPlayer(int[][] gameField) {
        if (isWinPositionForHorizontals(gameField, PLAYER_ONE) ||
                isWinPositionForVerticals(gameField, PLAYER_ONE) ||
                isWinPositionForDiagonals(gameField, PLAYER_ONE)) {
            return true;
        } else return false;

    }


    public boolean isWinPositionForSecondPlayer(int[][] gameField) {
        if (isWinPositionForHorizontals(gameField, PLAYER_TWO) ||
                isWinPositionForVerticals(gameField, PLAYER_TWO) ||
                isWinPositionForDiagonals(gameField, PLAYER_TWO)) {
            return true;
        } else return false;
    }


    public boolean isDrawPosition(int[][] gameField) {
        return (!isWinPositionForFirstPlayer(gameField) &&
                !isWinPositionForSecondPlayer(gameField) &&
                !isEmptySpaces(gameField));
    }


}
