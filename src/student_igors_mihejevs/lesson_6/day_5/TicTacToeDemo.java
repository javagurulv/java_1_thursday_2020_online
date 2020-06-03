package student_igors_mihejevs.lesson_6.day_5;

class TicTacToeDemo {

    public static void main(String[] args) {
        TicTacToe tikTakToe = new TicTacToe();

        int[][] tttDemo = {{1, 0, 1}, {-1, 0, 0}, {1, 0, 0}};
        tikTakToe.printDoubleArrayToConsole(tttDemo);
        System.out.println(tikTakToe.isWinPositionForHorizontals(tttDemo, 0));
        System.out.println(tikTakToe.isWinPositionForVerticals(tttDemo, 0));
    }

}
