package student_vadims_vladisevs.lesson9.day_x.super_task_1;

class Move {

    private int columnNumber;
    private int rowNumber;

    public Move(int rowNumber, int columnNumber){
        this.columnNumber = columnNumber;
        this.rowNumber = rowNumber;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public int getColumnNumber() {
        return columnNumber;
    }
}
