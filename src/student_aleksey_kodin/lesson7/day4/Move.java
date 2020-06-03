package student_aleksey_kodin.lesson7.day4;

class Move {
    private final int row;
    private final int column;

    public Move(int row,int column) {
        this.row = row;
        this.column = column;
    }
    public int getRow() {
        if (row < 0 || row > 2) {
            return -1;
        }
    return row;
    }
    public int getColumn() {
        if (column < 0 || column > 2) {
            return -1;
        }
    return column;
    }
}
