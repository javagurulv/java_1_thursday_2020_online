package student_aleksey_kodin.lesson15.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TennisGame3 implements TennisGame {
    private int player2Points;
    private int player1Points;
    private final String player1Name;
    private final String player2Name;
    final int DIFFERENCE_BETWEEN_POINTS = 1;
    final int NO_ADVANTAGE = 4;
    final int NO_DEUCE = 6;

    public TennisGame3(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    @Override
    public String score() {

        String score;

        if (isPlayersAdvantage(player1Points, player2Points) && isNoDeuce(player1Points, player2Points)) {
            String[] pointsName = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            score = pointsName[player1Points];

            if (isDeuce(player1Points, player2Points)) {
                return score + "-All";
            }
            return score + "-" + pointsName[player2Points];

        } else {

            if (isDeuce(player1Points, player2Points)) {
                return "Deuce";
            }

            score = getPlayerWinPoint(player1Points, player2Points);

            if (isAdvantage(player1Points, player2Points)) {
                return "Advantage " + score;
            }
            return "Win for " + score;
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

    private String getPlayerWinPoint(int player1Points, int player2Points) {
        return player1Points > player2Points ? player1Name : player2Name;
    }

    private Boolean isPlayersAdvantage(int player1Points, int player2Points) {
        return player1Points < NO_ADVANTAGE && player2Points < NO_ADVANTAGE;
    }

    private Boolean isNoDeuce(int player1Points, int player2Points) {
        return !(player1Points + player2Points == NO_DEUCE);
    }

    private Boolean isDeuce(int player1Points, int player2Points) {
        return player1Points == player2Points;
    }

    private int getPointsDifference(int player1Points, int player2Points) {
        return player1Points - player2Points;
    }

    private Boolean isAdvantage(int player1Points, int player2Points) {
        return getPointsDifference(player1Points, player2Points) *
                (getPointsDifference(player1Points, player2Points)) == DIFFERENCE_BETWEEN_POINTS;
    }
}
