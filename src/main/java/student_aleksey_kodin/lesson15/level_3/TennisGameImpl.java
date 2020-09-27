package student_aleksey_kodin.lesson15.level_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TennisGameImpl implements TennisGame {
    @Override
    public void wonPoint(Player player) {
        final int NEXT_POINT = 1;
        player.setPlayerPoint(player.getPlayerPoint() + NEXT_POINT);
    }

    @Override
    public String score(Player player1, Player player2) {
        final int NO_POINTS = 0;

        Player winPlayer = isWin(player1, player2);
        Player advantagePlayer = isAdvantage(player1, player2);

        if (winPlayer != null) {
            player1.setPlayerPoint(NO_POINTS);
            player2.setPlayerPoint(NO_POINTS);
            return "Win - " + winPlayer.getPlayerName();
        }
        if (isDeuce(player1, player2)) {
            return Points.DEUCE.toString();
        }
        if (advantagePlayer != null) {
            return Points.ADVANTAGE.toString() + " - " + advantagePlayer.getPlayerName();
        }

        return returnPlayerPoint(player1) + " - " + returnPlayerPoint(player2);
    }

    private String returnPlayerPoint(Player player) {
        return switch (player.getPlayerPoint()) {
            case 1 -> Points.FIFTEEN.toString();
            case 2 -> Points.THIRTY.toString();
            case 3 -> Points.FORTY.toString();
            default -> Points.LOVE.toString();
        };
    }

    private Boolean isDeuce(Player player1, Player player2) {
        final int HAVE_POINTS_FOR_DEUCE = 3;
        if (player1.getPlayerPoint() >= HAVE_POINTS_FOR_DEUCE && player2.getPlayerPoint() >= HAVE_POINTS_FOR_DEUCE) {
            return player1.getPlayerPoint() == player2.getPlayerPoint();
        }
        return false;
    }

    private Player isWin(Player player1, Player player2) {
        final int DIFFERENCE_POINTS = 2;
        if (isPointsEnoughForWin(player1) && differenceBetweenPlayersPoints(player1, player2) >= DIFFERENCE_POINTS) {
            return player1;
        }
        if (isPointsEnoughForWin(player2) && differenceBetweenPlayersPoints(player1, player2) >= DIFFERENCE_POINTS) {
            return player2;
        }
        return null;
    }

    private Player isAdvantage(Player player1, Player player2) {
        final int DIFFERENCE_POINTS = 1;
        if (isPointsEnoughForWin(player1) && differenceBetweenPlayersPoints(player1, player2) == DIFFERENCE_POINTS) {
            return player1;
        }
        if (isPointsEnoughForWin(player2) && differenceBetweenPlayersPoints(player1, player2) == DIFFERENCE_POINTS) {
            return player2;
        }
        return null;
    }

    private boolean isPointsEnoughForWin(Player player) {
        final int HAVE_POINTS_FOR_WIN = 3;
        return player.getPlayerPoint() > HAVE_POINTS_FOR_WIN;
    }

    private int differenceBetweenPlayersPoints(Player player1, Player player2) {
        return Math.abs(player1.getPlayerPoint() - player2.getPlayerPoint());
    }
}
