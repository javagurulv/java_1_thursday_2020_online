package student_igors_mihejevs.lesson_6.day_5;

class TicTacToeDemo {

    public static void main(String[] args) {
        TicTacToe tikTakToe = new TicTacToe();

        int[][] tttDemo1 = {{1, 0, 1}, {-1, 1, 0}, {0, 0, 0}};
        tikTakToe.printDoubleArrayToConsole(tttDemo1);
        System.out.println(tikTakToe.isWinPositionForHorizontals(tttDemo1, 0));
        int[][] tttDemo2 = {{1, 0, 1}, {-1, 0, 0}, {1, 0, 0}};
        tikTakToe.printDoubleArrayToConsole(tttDemo2);
        System.out.println(tikTakToe.isWinPositionForVerticals(tttDemo2, 0));
        int[][] tttDemo3 = {{0, 0, 1}, {-1, 0, 0}, {1, 0, 0}};
        tikTakToe.printDoubleArrayToConsole(tttDemo3);
        System.out.println(tikTakToe.isWinPositionForVerticals(tttDemo3, 0));
        int[][] tttDemo4 = {{1, 0, 1}, {0, 0, 1}, {1, 0, 0}};
        tikTakToe.printDoubleArrayToConsole(tttDemo4);
        System.out.println(tikTakToe.isWinPosition(tttDemo4, 1));
    }

}
