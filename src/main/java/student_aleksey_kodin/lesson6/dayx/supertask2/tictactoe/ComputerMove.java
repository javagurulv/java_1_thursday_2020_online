package student_aleksey_kodin.lesson6.dayx.supertask2.tictactoe;

public class ComputerMove {
    private final int FREE_CELL = -1;

    private int rowDefencePosition;
    private int columnDefencePosition;
    private int rowWinPosition;
    private int columnWinPosition;


    private final MoveLogic moveLogic = new MoveLogic();

    public boolean isComputerCanWin(int[][] field, Player player) {
        if (moveLogic.isWin(field, player)) {
            setWinMovePosition();
            return true;
        }
        return false;
    }

    public boolean isCanWinOpponent(int[][] field, Player player) {
        if (moveLogic.isWin(field, player)) {
            setDefenseMovePosition();
            return true;
        }
        return false;
    }

    public void simpleNextMove(int[][] field, Player player) {
        checkNextMove(field, player);
    }

    private void setWinMovePosition() {
        setRowWinPosition(moveLogic.getRowWinPosition());
        setColumnWinPosition(moveLogic.getColumnWinPosition());
    }

    private void setDefenseMovePosition() {
        setRowDefencePosition(moveLogic.getRowWinPosition());
        setColumnDefencePosition(moveLogic.getColumnWinPosition());
    }

    public int getRowDefencePosition() {
        return rowDefencePosition;
    }

    public void setRowDefencePosition(int rowDefencePosition) {
        this.rowDefencePosition = rowDefencePosition;
    }

    public int getColumnDefencePosition() {
        return columnDefencePosition;
    }

    public void setColumnDefencePosition(int columnDefencePosition) {
        this.columnDefencePosition = columnDefencePosition;
    }

    public int getRowWinPosition() {
        return rowWinPosition;
    }

    public void setRowWinPosition(int rowWinPosition) {
        this.rowWinPosition = rowWinPosition;
    }

    public int getColumnWinPosition() {
        return columnWinPosition;
    }

    public void setColumnWinPosition(int columnWinPosition) {
        this.columnWinPosition = columnWinPosition;
    }

    private void checkNextMove(int[][] field, Player player) {

        if (isFreeCell(field[0][0])) {
            field[0][0] = player.getPlayerFigure();
            return;
        }
        if (isFreeCell(field[2][0])) {
            field[2][0] = player.getPlayerFigure();
            return;
        }
        if (isFreeCell(field[2][2])) {
            field[2][2] = player.getPlayerFigure();
            return;
        }
        if (isFreeCell(field[0][2])) {
            field[0][2] = player.getPlayerFigure();
            return;
        }
        if (isFreeCell(field[1][1])) {
            field[1][1] = player.getPlayerFigure();
            return;
        }
        findFreeCellForMove(field, player);
    }

    private boolean isFreeCell(int cell) {
        return cell == FREE_CELL;
    }

    private void findFreeCellForMove(int[][] field, Player player) {
        for (int row = 0; row < field.length; row++) {
            for (int column = 0; column < field[0].length; column++) {
                if (field[row][column] == FREE_CELL) {
                    field[row][column] = player.getPlayerFigure();
                    return;
                }
            }
        }
    }
}
