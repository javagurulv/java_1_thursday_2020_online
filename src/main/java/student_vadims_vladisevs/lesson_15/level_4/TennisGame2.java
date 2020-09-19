package student_vadims_vladisevs.lesson_15.level_4;

class TennisGame2 implements TennisGame{
    public int P1point = 0;
    public int P2point = 0;

    public String P1result = "";
    public String P2result = "";
    private String player1Name;
    private String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    @Override
    public String getScore() {
        String score = "";

        if (isTheSameResult()) {
            score += getPoint(P1point) + "-All";
        } else {
            P1result = getPoint(P1point);
            P2result = getPoint(P2point);
            score = P1result + "-" + P2result;
        }

        if (isDeuce()) {
            score = "Deuce";
        }

        if (isFirstPlayerAdvantage()) {
            score = "Advantage player1";
        }

        if (isSecondPlayerAdvantage()) {
            score = "Advantage player2";
        }

        if (isFirstPlayerWin()) {
            score = "Win for player1";
        }
        if (isSecondPlayerWin()) {
            score = "Win for player2";
        }
        return score;
    }

    private String getPoint(int playerPoint){
        if (playerPoint == 0)
            return  "Love";
        if (playerPoint == 1)
            return  "Fifteen";
        if (playerPoint == 2)
            return  "Thirty";
        return "Forty";
    }

    private boolean isTheSameResult(){
        return P1point == P2point && P1point < 4;
    }

    private boolean isFirstPlayerWin(){
        return P1point >= 4 && P2point >= 0 && (P1point - P2point) >= 2;
    }

    private boolean isSecondPlayerWin(){
        return P2point >= 4 && P1point >= 0 && (P2point-P1point) >= 2;
    }

    private boolean isFirstPlayerAdvantage(){
        return P1point > P2point && P2point >= 3;
    }

    private boolean isSecondPlayerAdvantage(){
        return P2point > P1point && P1point >= 3;
    }

    private boolean isDeuce(){
        return P1point == P2point && P1point >= 3;
    }


    private void P1Score() {
        P1point++;
    }

    private void P2Score() {
        P2point++;
    }

    @Override
    public void wonPoint(String player) {
        if (player.equals("player1"))
            P1Score();
        else
            P2Score();
    }
}
