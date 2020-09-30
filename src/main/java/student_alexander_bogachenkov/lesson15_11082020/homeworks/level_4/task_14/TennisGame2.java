package student_alexander_bogachenkov.lesson15_11082020.homeworks.level_4.task_14;

public class TennisGame2 implements TennisGame {
    public int player1Count = 0;
    public int player2Count = 0;

    public String P1res = "";
    public String P2res = "";

    public String getScore() {
        String score = "";
        if (player1Count == player2Count && player1Count < 4) {
            switch (player1Count) {
                case 0 -> score = "Love";
                case 1 -> score = "Fifteen";
                case 2 -> score = "Thirty";
            }
            score += "-All";
        }
        if (player1Count == player2Count && player1Count >= 3)
            score = "Deuce";

        if (player1Count > 0 && player2Count == 0) {
            switch (player1Count) {
                case 1 -> P1res = "Fifteen";
                case 2 -> P1res = "Thirty";
                case 3 -> P1res = "Forty";
            }

            P2res = "Love";
            score = P1res + "-" + P2res;
        }
        if (player2Count > 0 && player1Count == 0) {
            switch (player2Count) {
                case 1 -> P1res = "Fifteen";
                case 2 -> P1res = "Thirty";
                case 3 -> P1res = "Forty";
            }

            P1res = "Love";
            score = P1res + "-" + P2res;
        }

        if (player1Count > player2Count && player1Count < 4) {
            switch (player1Count) {
                case 2 -> P1res = "Thirty";
                case 3 -> P1res = "Forty";
            }
            switch (player2Count) {
                case 1 -> P1res = "Fifteen";
                case 2 -> P1res = "Thirty";
            }
            score = P1res + "-" + P2res;
        }
        if (player2Count > player1Count && player2Count < 4) {
            switch (player2Count) {
                case 2 -> P1res = "Thirty";
                case 3 -> P1res = "Forty";
            }
            switch (player1Count) {
                case 1 -> P1res = "Fifteen";
                case 2 -> P1res = "Thirty";
            }
            score = P1res + "-" + P2res;
        }

        if (player1Count > player2Count && player2Count >= 3) {
            score = "Advantage player1";
        }

        if (player2Count > player1Count && player1Count >= 3) {
            score = "Advantage player2";
        }

        if (player1Count >= 4 && player2Count >= 0 && (player1Count - player2Count) >= 2) {
            score = "Win for player1";
        }
        if (player2Count >= 4 && player1Count >= 0 && (player2Count - player1Count) >= 2) {
            score = "Win for player2";
        }
        return score;
    }

    public void P1Score() {
        player1Count++;
    }

    public void P2Score() {
        player2Count++;
    }

    public void wonPoint(String player) {
        if (player == "player1")
            P1Score();
        else
            P2Score();
    }
}