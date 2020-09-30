package student_alexander_bogachenkov.lesson15_11082020.homeworks.level_3.task_11;

class TennisGameImpl implements TennisGame {

    private String firstPlayerName;
    private String secondPlayerName;
    private int firstPlayerScore = 0;
    private int secondPlayerScore = 0;

    @Override
    public void wonPoint(String playerName) {
        if (isFirstPlayerName(playerName) || isSecondPlayerName(playerName)) {
            addPointToPlayer(playerName);
        } else {
            assignNameToFreePosition(playerName);
            addPointToPlayer(playerName);
        }
    }

    @Override
    public String score() {
        if (firstPlayerScore == 0 && secondPlayerScore == 0) {
            return "Love - Love";
        } else if (firstPlayerScore == 0 && secondPlayerScore == 1) {
            return "Love - Fifteen";
        } else if (firstPlayerScore == 1 && secondPlayerScore == 0) {
            return "Fifteen - Love";
        } else if (firstPlayerScore == 1 && secondPlayerScore == 1) {
            return "Fifteen - Fifteen";
        } else if (firstPlayerScore == 1 && secondPlayerScore == 2) {
            return "Fifteen - Thirty";
        } else if (firstPlayerScore == 2 && secondPlayerScore == 1) {
            return "Thirty - Fifteen";
        } else if (firstPlayerScore == 2 && secondPlayerScore == 2) {
            return "Thirty - Thirty";
        } else if (firstPlayerScore == 2 && secondPlayerScore == 3) {
            return "Thirty - Forty";
        } else if (firstPlayerScore == 3 && secondPlayerScore == 2) {
            return "Forty - Thirty";
        } else if (firstPlayerScore == 3 && secondPlayerScore == 3) {
            return "Deuce";
        } else if (firstPlayerScore == 3 && secondPlayerScore == 4) {
            return secondPlayerName + " advantage";
        } else if (firstPlayerScore == 4 && secondPlayerScore == 3) {
            return firstPlayerName + " advantage";
        } else if (firstPlayerScore == 4 && secondPlayerScore == 2) {
            return firstPlayerName + " WON";
        } else if (firstPlayerScore == 4 && secondPlayerScore == 1) {
            return firstPlayerName + " WON";
        } else if (firstPlayerScore == 4 && secondPlayerScore == 0) {
            return firstPlayerName + " WON";
        } else if (firstPlayerScore == 2 && secondPlayerScore == 4) {
            return secondPlayerName + " WON";
        } else if (firstPlayerScore == 1 && secondPlayerScore == 4) {
            return secondPlayerName + " WON";
        } else if (firstPlayerScore == 0 && secondPlayerScore == 4) {
            return secondPlayerName + " WON";
        } else if (firstPlayerScore == 0 && secondPlayerScore == 2) {
            return "Love - Thirty";
        } else if (firstPlayerScore == 0 && secondPlayerScore == 3) {
            return "Love - Forty";
        } else if (firstPlayerScore == 2 && secondPlayerScore == 0) {
            return "Thirty - Love";
        } else if (firstPlayerScore == 3 && secondPlayerScore == 0) {
            return "Forty - Love";
        } else if (firstPlayerScore == 3 && secondPlayerScore == 1) {
            return "Forty - Fifteen";
        } else if (firstPlayerScore == 1 && secondPlayerScore == 3) {
            return "Fifteen - Forty";
        } else {
            return "Something went wrong...";
        }
    }

    private void addPointToPlayer(String playerName) {
        if (playerName.equals(firstPlayerName)) {
            firstPlayerScore++;
        } else if (playerName.equals(secondPlayerName)) {
            secondPlayerScore++;
        }
    }

    private void assignNameToFreePosition(String playerName) {
        if (firstPlayerName == null) {
            firstPlayerName = playerName;
        } else if (secondPlayerName == null) {
            secondPlayerName = playerName;
        }
    }

    private boolean isFirstPlayerName(String name) {
        return name.equals(firstPlayerName);
    }

    private boolean isSecondPlayerName(String name) {
        return name.equals(secondPlayerName);
    }

    public int getFirstPlayerScore() {
        return firstPlayerScore;
    }

    public int getSecondPlayerScore() {
        return secondPlayerScore;
    }
}
