package student_vadims_vladisevs.lesson_15.level_4;

class TennisGame3 implements TennisGame{

    private int player2score;
    private int player1score;
    private String player1Name;
    private String player2Name;

    public TennisGame3(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    @Override
    public String getScore() {
        String score;
        if (isPlayersScoreLessThanFour() && !(isPlayersScoreSumOverSix())) {
            String[] scoreResult = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            score = scoreResult[player1score];
            return (isSameScore()) ? score + "-All" : score + "-" + scoreResult[player2score];
        } else {
            if (isSameScore())
                return "Deuce";
            score =  isFirstPlayerScoreBigger() ? player1Name : player2Name;
            return (isFirstPlayerAdvantage()) ? "Advantage " + score : "Win for " + score;
        }
    }

    private boolean isFirstPlayerAdvantage(){
        return (player1score - player2score) * (player1score - player2score) == 1;
    }

    private boolean isPlayersScoreSumOverSix(){
        return player1score + player2score == 6;
    }

    private boolean isPlayersScoreLessThanFour(){
        return player1score < 4 && player2score < 4;
    }

    private boolean isFirstPlayerScoreBigger(){
        return player1score > player2score;
    }

    private boolean isSameScore(){
        return player1score == player2score;
    }


    @Override
    public void wonPoint(String playerName) {
        if (playerName.equals("player1"))
            this.player1score += 1;
        else
            this.player2score += 1;

    }

}
