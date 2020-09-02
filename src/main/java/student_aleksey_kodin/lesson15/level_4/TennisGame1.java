package student_aleksey_kodin.lesson15.level_4;

class TennisGame1 implements TennisGame{

    private int m_score1 = 0;
    private int m_score2 = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }
   @Override
    public void wonPoint(String playerName) {
        if (playerName.equals("player1"))
            m_score1 += 1;
        else
            m_score2 += 1;
    }

    @Override
    public String score() {
        StringBuilder score = new StringBuilder();
        int tempScore;
        if (m_score1 == m_score2) {
            score = switch (m_score1) {
                case 0 -> new StringBuilder("Love-All");
                case 1 -> new StringBuilder("Fifteen-All");
                case 2 -> new StringBuilder("Thirty-All");
                default -> new StringBuilder("Deuce");
            };
        } else if (m_score1 >= 4 || m_score2 >= 4) {
            int minusResult = m_score1 - m_score2;
            if (minusResult == 1) score = new StringBuilder("Advantage player1");
            else if (minusResult == -1) score = new StringBuilder("Advantage player2");
            else if (minusResult >= 2) score = new StringBuilder("Win for player1");
            else score = new StringBuilder("Win for player2");
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = m_score1;
                else {
                    score.append("-");
                    tempScore = m_score2;
                }
                switch (tempScore) {
                    case 0 -> score.append("Love");
                    case 1 -> score.append("Fifteen");
                    case 2 -> score.append("Thirty");
                    case 3 -> score.append("Forty");
                }
            }
        }
        return score.toString();
    }
}
