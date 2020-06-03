package student_dmitrijs_visuns.homeworks.lesson_6.day_5;

class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest ttt = new TicTacToeTest();
        ttt.tttTest();

    }


    public void tttTest () {
        TicTacToe test = new TicTacToe();
        int[][] newField = test.createField();
        test.printFieldToConsole(newField);
        test.isWinPositionForHorizontals(newField, 0);


    }

}
