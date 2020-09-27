package student_vadims_vladisevs.lesson_15.level_3;

class TennisGameImpl implements TennisGame {


    private final int LOVE = 0;
    private final int FIFTEEN = 1;
    private final int THIRTY = 2;
    private final int FORTY = 3;
    private final int DEUCE = 4;
    private final int ADVANTAGE = 5;
    private String firstPlayerName;
    private String secondPlayerName;
    private int firstPlayerScore;
    private int secondPlayerScore;

    public TennisGameImpl(String firstPlayerName, String secondPlayerName){
        this.firstPlayerName = firstPlayerName;
        this.secondPlayerName = secondPlayerName;
        firstPlayerScore = LOVE;
        secondPlayerScore = LOVE;
    }

    @Override
    public void wonPoint(String playerName) {
        if (playerName.equals(firstPlayerName)){
            firstPlayerScore++;
            if (secondPlayerScore == DEUCE){
                secondPlayerScore = FORTY;
                firstPlayerScore = FORTY;
            }

        } else {
            secondPlayerScore++;
            if (firstPlayerScore == DEUCE){
                firstPlayerScore = FORTY;
                secondPlayerScore = FORTY;
            }
        }
    }

    @Override
    public String score() {

        if (isAdvantageFirstPlayer()){
            return "ADVANTAGE player1";
        }

        if (isAdvantageSecondPlayer()){
            return "ADVANTAGE player2";
        }

        if (isFirstPlayerWin()){
            return "Win player1";
        }

        if (isSecondPlayerWin()){
            return "Win player2";
        }

        if (isDeuce()){
            return "DEUCE";
        }

        return scoreToPrint(firstPlayerScore) + " - " + scoreToPrint(secondPlayerScore);
    }


    private String scoreToPrint(int playerScore){
        return switch (playerScore) {
            case 1 -> "FIFTEEN";
            case 2 -> "THIRTY";
            case 3 -> "FORTY";
            default -> "LOVE";
        };
    }


    private boolean isDeuce(){
        return firstPlayerScore == FORTY && secondPlayerScore == FORTY;
    }

    private boolean isFirstPlayerWin(){
        return firstPlayerScore >= DEUCE && secondPlayerScore < DEUCE;
    }

    private boolean isSecondPlayerWin(){
        return secondPlayerScore >= DEUCE && firstPlayerScore < DEUCE;
    }

    private boolean isAdvantageFirstPlayer(){
        return firstPlayerScore == DEUCE && secondPlayerScore == FORTY;
    }
    private boolean isAdvantageSecondPlayer(){
        return secondPlayerScore == DEUCE && firstPlayerScore == FORTY;
    }


}
