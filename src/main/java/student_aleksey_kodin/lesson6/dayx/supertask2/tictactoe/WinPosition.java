package student_aleksey_kodin.lesson6.dayx.supertask2.tictactoe;

public class WinPosition {
    public boolean checkToWin(int[][] field, Player player) {
        if (isWinPosition(field, player)) {
            System.out.println(player.getPlayerName() + " WIN!");
            return true;
        }
        return false;
    }

    private boolean isWinPosition(int[][] field, Player player) {
        if (isWinPositionForHorizontals(field, player)) return true;
        if (isWinPositionForVerticals(field, player)) return true;
        return isWinPositionForDiagonals(field, player);
    }

    private boolean isWinPositionForHorizontals(int[][] field, Player player) {
        for (int[] row : field) {
            if ((row[0] == player.getPlayerFigure()) && (row[1] == player.getPlayerFigure()) && (row[2] == player.getPlayerFigure())) {
                return true;
            }
        }
        return false;
    }

    private boolean isWinPositionForVerticals(int[][] field, Player player) {
        for (int column = 0; column < field[0].length; column++) {
            if ((field[0][column] == player.getPlayerFigure()) && (field[1][column] == player.getPlayerFigure()) &&
                    (field[2][column] == player.getPlayerFigure())) {
                return true;
            }
        }
        return false;
    }

    private boolean isWinPositionForDiagonals(int[][] field, Player player) {
        if (field[1][1] != player.getPlayerFigure()) {
            return false;
        }
        if ((field[0][0] == player.getPlayerFigure()) && (field[2][2] == player.getPlayerFigure())) {
            return true;
        }
        return (field[0][2] == player.getPlayerFigure()) && (field[2][0] == player.getPlayerFigure());
    }
}
