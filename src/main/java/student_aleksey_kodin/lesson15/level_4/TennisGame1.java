package student_aleksey_kodin.lesson15.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TennisGame1 implements TennisGame {

    private int player1Points = 0;
    private int player2Points = 0;
    private final String player1Name;
    private final String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    @Override
    public void wonPoint(String playerName) {
        if (playerName.equals(player1Name))
            player1Points += 1;
        else
            player2Points += 1;
    }

    @Override
    public String score() {
        StringBuilder score = new StringBuilder();

        if (isDeuce(player1Points, player2Points)) {
            return getDeuceScore(player1Points).toString();
        }
        if (isMorePoints(player1Points, player2Points)) {
            int pointsDifference = player1Points - player2Points;
            score = getAdvantagePlayer(pointsDifference);

            if (isAdvantage(score)) {
                return score.toString();
            }
            return getWinPlayer(pointsDifference).toString();
        }
        return getScore(score).toString();
    }

    private Boolean isDeuce(int player1Points, int player2Points) {
        return player1Points == player2Points;
    }

    private StringBuilder getDeuceScore(int player1Points) {
        return switch (player1Points) {
            case 0 -> new StringBuilder("Love-All");
            case 1 -> new StringBuilder("Fifteen-All");
            case 2 -> new StringBuilder("Thirty-All");
            default -> new StringBuilder("Deuce");
        };
    }

    private Boolean isAdvantage(StringBuilder score) {
        return score.length() != 0;
    }

    private Boolean isMorePoints(int player1Points, int player2Points) {
        return player1Points >= 4 || player2Points >= 4;
    }

    private StringBuilder getAdvantagePlayer(int difference) {
        if (difference == 1) {
            return new StringBuilder("Advantage ").append(player1Name);
        }
        if (difference == -1) {
            return new StringBuilder("Advantage ").append(player2Name);
        }
        return new StringBuilder();
    }

    private StringBuilder getWinPlayer(int difference) {
        if (difference >= 2) {
            return new StringBuilder("Win for ").append(player1Name);
        }
        if (difference <= -2) {
            return new StringBuilder("Win for ").append(player2Name);
        }
        return new StringBuilder();
    }

    private StringBuilder getScore(StringBuilder score) {
        int tempScore;

        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = player1Points;
            } else {
                score.append("-");
                tempScore = player2Points;
            }
            switch (tempScore) {
                case 0 -> score.append("Love");
                case 1 -> score.append("Fifteen");
                case 2 -> score.append("Thirty");
                case 3 -> score.append("Forty");
            }
        }
        return score;
    }
}
