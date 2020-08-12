package student_aleksey_kodin.lesson6.dayx.supertask2.tictactoe;

class DrawPosition {

    public boolean checkToDraw(int[][] field) {

        if (isDraw(field)) {
            System.out.println("DRAW!");
            return true;
        }
        return false;
    }

    private boolean isDraw(int[][] field) {
        final int FREE_CELL = -1;

        for (int[] ints : field) {
            for (int column = 0; column < field[0].length; column++) {
                if (ints[column] == FREE_CELL) {
                    return false;
                }
            }
        }
        return true;
    }
}
