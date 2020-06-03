package student_aleksey_kodin.lesson6.dayx.supertask2;

class Move {
    private final int row;
    private final int column;

    public Move(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        if (isNumberOutOfRangeField(row)) {
            return -1;
        }
        return row;
    }

    public int getColumn() {
        if (isNumberOutOfRangeField(column)) {
            return -1;
        }
        return column;
    }
    private boolean isNumberOutOfRangeField(int playerInput) {
        return playerInput < 0 || playerInput > 2;
    }
}