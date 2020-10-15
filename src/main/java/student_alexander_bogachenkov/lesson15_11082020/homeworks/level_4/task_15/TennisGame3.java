package student_alexander_bogachenkov.lesson15_11082020.homeworks.level_4.task_15;

public class TennisGame3 implements TennisGame {

    private int player2Score;
    private int player1Score;
    private final String player1Name;
    private final String player2Name;

    public TennisGame3(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {
        String score;
        if (player1Score < 4 && player2Score < 4 && !(player1Score + player2Score == 6)) {
            String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            score = p[player1Score];
            return (player1Score == player2Score) ? score + "-All" : score + "-" + p[player2Score];
        } else {
            if (player1Score == player2Score)
                return "Deuce";
            score = player1Score > player2Score ? player1Name : player2Name;
            return ((player1Score - player2Score) * (player1Score - player2Score) == 1) ? "Advantage " + score : "Win for " + score;
        }
    }

    public void wonPoint(String playerName) {
        if (playerName.equals("player1"))
            this.player1Score += 1;
        else
            this.player2Score += 1;

    }

}