package student_aleksey_kodin.lesson6.dayx.supertask2.tictactoe;

class Player {
    private final String playerName;
    private final boolean isPlayerMoveFirst;
    private final boolean isPlayerHuman;
    private final int playerFigure;

    public Player(String playerName, boolean isPlayerMoveFirst, boolean isPlayerHuman, int playerFigure) {
        this.playerName = playerName;
        this.isPlayerMoveFirst = isPlayerMoveFirst;
        this.isPlayerHuman = isPlayerHuman;
        this.playerFigure = playerFigure;
    }

    public String getPlayerName() {
        return playerName;
    }

    public boolean isPlayerMoveFirst() {
        return isPlayerMoveFirst;
    }

    public boolean isPlayerHuman() {
        return isPlayerHuman;
    }

    public int getPlayerFigure() {
        return playerFigure;
    }
}
