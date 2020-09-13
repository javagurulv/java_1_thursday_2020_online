package student_aleksey_kodin.lesson15.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TennisGame2 implements TennisGame {
    public int P1point = 0;
    public int P2point = 0;
    public String P1res = "";
    public String P2res = "";

    private final String player1Name;
    private final String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    @Override
    public String score() {
        String score = "";
        if (P1point == P2point && P1point < 4) {

            score += getPlayerPoint(P1point) + "-All";
        }
        if (P1point == P2point && P1point >= 3)
            score = "Deuce";

        if (P1point > 0 && P2point == 0) {
            P1res = getPlayerPoint(P1point);
            P2res = "Love";
            score = P1res + "-" + P2res;
        }
        if (P2point > 0 && P1point == 0) {
            P1res = "Love";
            P2res = getPlayerPoint(P2point);
            score = P1res + "-" + P2res;
        }

        if (P1point > P2point && P1point < 4) {
            P1res = getPlayerPoint(P1point);
            P2res = getPlayerPoint(P2point);
            score = P1res + "-" + P2res;
        }
        if (P2point > P1point && P2point < 4) {
            P1res = getPlayerPoint(P1point);
            P2res = getPlayerPoint(P2point);
            score = P1res + "-" + P2res;
        }
        score = getAdvantage(score, P1point, P2point);

        return getWin(score, P1point, P2point);
    }

    public void P1Score() {
        P1point++;
    }

    public void P2Score() {
        P2point++;
    }

    public void wonPoint(String player) {
        if (player.equals(player1Name))
            P1Score();
        else
            P2Score();
    }

    private String getPlayerPoint(int point) {
        if (point == 0)
            return "Love";
        if (point == 1)
            return "Fifteen";
        if (point == 2)
            return "Thirty";

        return "Forty";
    }

    private String getAdvantage(String score, int P1point, int P2point) {
        if (P1point > P2point && P2point >= 3) {
            return "Advantage " + player1Name;
        }
        if (P2point > P1point && P1point >= 3) {
            return "Advantage " + player2Name;
        }
        return score;
    }

    private String getWin(String score, int P1point, int P2point) {
        if (P1point >= 4 && P2point >= 0 && (P1point - P2point) >= 2) {
            score = "Win for " + player1Name;
        }
        if (P2point >= 4 && P1point >= 0 && (P2point - P1point) >= 2) {
            score = "Win for " + player2Name;
        }
        return score;
    }
}
