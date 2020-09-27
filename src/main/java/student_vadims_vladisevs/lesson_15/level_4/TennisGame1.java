package student_vadims_vladisevs.lesson_15.level_4;

class TennisGame1 implements TennisGame{

    private int player1Points = 0;
    private int player2Points = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    @Override
    public void wonPoint(String playerName) {
        if (playerName.equals("player1"))
            player1Points += 1;
        else
            player2Points += 1;
    }

    @Override
    public String getScore() {
        String scoreToPrint = "";
        int score = 0;
        if (player1Points == player2Points) {
            scoreToPrint = switch (player1Points) {
                case 0 -> "Love-All";
                case 1 -> "Fifteen-All";
                case 2 -> "Thirty-All";
                default -> "Deuce";
            };
        } else if (player1Points >= 4 || player2Points >= 4) {
            int playersScoreDifference = player1Points - player2Points;

            if (playersScoreDifference == 1) {
                scoreToPrint ="Advantage player1";
            }
            else if (playersScoreDifference == -1) {
                scoreToPrint ="Advantage player2";
            }
            else if (playersScoreDifference >= 2) {
                scoreToPrint = "Win for player1";
            }
            else scoreToPrint ="Win for player2";
        }
        else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    score = player1Points;
                } else {
                    scoreToPrint +="-"; score = player2Points;
                }
                switch (score) {
                    case 0 -> scoreToPrint += "Love";
                    case 1 -> scoreToPrint += "Fifteen";
                    case 2 -> scoreToPrint += "Thirty";
                    case 3 -> scoreToPrint += "Forty";
                }
            }
        }
        return scoreToPrint;
    }
}
