package student_aleksey_kodin.lesson15.level_3;

class Player {
    private final String playerName;
    private int playerPoint;

    Player(String playerName) {
        this.playerName = playerName;
        playerPoint = 0;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerPoint() {
        return playerPoint;
    }

    public void setPlayerPoint(int playerPoint) {
        this.playerPoint = playerPoint;
    }
}
