package student_aleksey_kodin.lesson15.level_3;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
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

    @CodeReviewComment(teacher = "May be pointWon() method without parameters?")
    public void setPlayerPoint(int playerPoint) {
        this.playerPoint = playerPoint;
    }
}
