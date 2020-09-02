package student_aleksey_kodin.lesson15.level_3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TennisGameImplTest {
    TennisGameImpl tennisGame = new TennisGameImpl();
    Player player1 = new Player("player1");
    Player player2 = new Player("player2");

    @Test
    public void noPoints() {
        String result = tennisGame.score(player1, player2);
        assertEquals(result, "Love - Love");
    }

    @Test
    public void player1_OnePoint() {
        tennisGame.wonPoint(player1);
        String result = tennisGame.score(player1, player2);
        assertEquals(result, "Fifteen - Love");
    }

    @Test
    public void player1_TwoPoints() {
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player1);
        String result = tennisGame.score(player1, player2);
        assertEquals(result, "Thirty - Love");
    }

    @Test
    public void player1_ThreePoints() {
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player1);
        String result = tennisGame.score(player1, player2);
        assertEquals(result, "Forty - Love");
    }

    @Test
    public void player1_win() {
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player1);
        String result = tennisGame.score(player1, player2);
        assertEquals(result, "Win - player1");
    }

    @Test
    public void player2_OnePoint() {
        tennisGame.wonPoint(player2);
        String result = tennisGame.score(player1, player2);
        assertEquals(result, "Love - Fifteen");
    }

    @Test
    public void player2_TwoPoints() {
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player2);
        String result = tennisGame.score(player1, player2);
        assertEquals(result, "Love - Thirty");
    }

    @Test
    public void player2_ThreePoints() {
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player2);
        String result = tennisGame.score(player1, player2);
        assertEquals(result, "Love - Forty");
    }

    @Test
    public void player2_win() {
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player2);
        String result = tennisGame.score(player1, player2);
        assertEquals(result, "Win - player2");
    }

    @Test
    public void player1_player2_haveOnePoints() {
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player2);
        String result = tennisGame.score(player1, player2);
        assertEquals(result, "Fifteen - Fifteen");
    }

    @Test
    public void player1_player2_haveTwoPoints() {
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player2);
        String result = tennisGame.score(player1, player2);
        assertEquals(result, "Thirty - Thirty");
    }

    @Test
    public void player1_player2_haveThreePoints() {
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player2);
        String result = tennisGame.score(player1, player2);
        assertEquals(result, "Deuce");
    }

    @Test
    public void player1_Advantage() {
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player2);
        String result = tennisGame.score(player1, player2);
        assertEquals(result, "Advantage - player1");
    }

    @Test
    public void player2_Advantage() {
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player2);
        String result = tennisGame.score(player1, player2);
        assertEquals(result, "Advantage - player2");
    }

    @Test
    public void player1_winAfterAdvantage() {
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player2);
        String result = tennisGame.score(player1, player2);
        assertEquals(result, "Win - player1");
    }

    @Test
    public void player2_winAfterAdvantage() {
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player2);
        String result = tennisGame.score(player1, player2);
        assertEquals(result, "Win - player2");
    }

    @Test
    public void player1_win_2() {
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player1);
        String result = tennisGame.score(player1, player2);
        assertEquals(result, "Win - player1");
    }

    @Test
    public void player1_win_3() {
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player1);
        String result = tennisGame.score(player1, player2);
        assertEquals(result, "Win - player1");
    }

    @Test
    public void player2_win_2() {
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player2);
        String result = tennisGame.score(player1, player2);
        assertEquals(result, "Win - player2");
    }

    @Test
    public void player2_win_3() {
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player2);
        String result = tennisGame.score(player1, player2);
        assertEquals(result, "Win - player2");
    }
}