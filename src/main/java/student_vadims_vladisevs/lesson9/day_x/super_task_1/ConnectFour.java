package student_vadims_vladisevs.lesson9.day_x.super_task_1;

import java.util.Scanner;

class ConnectFour {

    public void start() {
        String[][] gameField = createField();
        Player playerX = new Player("X");
        Player playerO = new Player("O");

        while (true) {
            printFieldToConsole(gameField);
            while (true) {
                System.out.println("Player X move. Enter column number: ");
                int columnNumber = getNextMove();
                if (isEmptyCellInColumn(columnNumber, gameField)) {
                    Move moveX = makeMove(columnNumber, gameField);
                    gameField[moveX.getRowNumber()][moveX.getColumnNumber()] = playerX.getSymbol();
                    printFieldToConsole(gameField);
                    break;
                } else {
                    System.out.println("No free slots in " + columnNumber + " column.");
                }
            }

            if (isWinOrDraw(gameField, playerX)){
                break;
            }


                while (true) {
                    System.out.println("Player O move. Enter column number: ");
                    int columnNumber = getNextMove();
                    if (isEmptyCellInColumn(columnNumber, gameField)) {
                        Move moveO = makeMove(columnNumber, gameField);
                        gameField[moveO.getRowNumber()][moveO.getColumnNumber()] = playerO.getSymbol();
                        printFieldToConsole(gameField);
                        break;
                    } else {
                        System.out.println("No free slots in " + columnNumber + " column.");
                    }
                }

                if (isWinOrDraw(gameField, playerO)) {
                    break;
                }

            }
        }




    private boolean isWinOrDraw(String[][] gameField, Player player){
        WinPositionDetector winDetector = new WinPositionDetector();
        DrawDetector drawDetector = new DrawDetector();

        if (winDetector.isWin(gameField, player)) {
            System.out.println("Player " + player.getSymbol() + " WIN!");
            return true;
        }

        if (drawDetector.isDraw(gameField)){
            System.out.println("End of the game. Draw!");
            return true;
        }

        return false;
    }

    private boolean isEmptyCellInColumn(int columnNumber, String[][] gameField) {
        for (int i = gameField.length - 1; i > -1; i--) {
            if (gameField[i][columnNumber - 1].equals("-")) {
                return true;
            }
        }
        return false;
    }

    private Move makeMove(int columnNumber, String[][] gameField){
        int rowNumber = 0;
        for (int i = gameField.length - 1; i > 0; i--){
            if (gameField[i][columnNumber - 1].equals("-")){
                rowNumber = i;
                break;
            }
        }
        return new Move(rowNumber, columnNumber - 1);
    }

    private int getNextMove(){
        Scanner scr = new Scanner(System.in);
        return scr.nextInt();
    }



    private String[][] createField(){
        String[][] field = new String[6][7];

        for (int i = 0; i < field.length; i++){
            for (int  j = 0; j < field[0].length; j++){
                field[i][j] = "-";
            }
        }
        return field;
    }



    private void printFieldToConsole(String[][] field){
        System.out.println("1 2 3 4 5 6 7");
        for (String[] strings : field) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println("");
        }
    }
}
