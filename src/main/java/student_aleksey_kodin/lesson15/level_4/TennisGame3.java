package student_aleksey_kodin.lesson15.level_4;

class TennisGame3 implements TennisGame {
    private int player2Points;
    private int player1Points;
    private final String player1Name;
    private final String player2Name;

    public TennisGame3(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    @Override
    public String score() {
        final int DIFFERENCE_BETWEEN_POINTS = 1;
        final int NO_ADVANTAGE = 4;
        final int NO_DEUCE = 6;
        String score;

        if (player1Points < NO_ADVANTAGE && player2Points < NO_ADVANTAGE && !(player1Points + player2Points == NO_DEUCE)) {
            String[] pointsName = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            score = pointsName[player1Points];
            return (player1Points == player2Points) ? score + "-All" : score + "-" + pointsName[player2Points];
        } else {
            if (player1Points == player2Points)
                return "Deuce";
            score = player1Points > player2Points ? player1Name : player2Name;
            return ((player1Points - player2Points) * (player1Points - player2Points) == DIFFERENCE_BETWEEN_POINTS)
                    ? "Advantage " + score : "Win for " + score;
        }
    }

    @Override
    public void wonPoint(String playerName) {
        final int NEXT_POINT = 1;
        if (playerName.equals("player1"))
            this.player1Points += NEXT_POINT;
        else
            this.player2Points += NEXT_POINT;

    }
}
