package student_aleksey_kodin.lesson15.level_3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class TennisGameImplTest {
    TennisGameImpl tennisGame = new TennisGameImpl();
    Player player1 = new Player("player1");
    Player player2 = new Player("player2");

    @Test
    public void noPoints() {
        String result = tennisGame.score(player1, player2);
        assertEquals(result, "LOVE - LOVE");
    }

    @Test
    public void player1_OnePoint() {
        tennisGame.wonPoint(player1);
        String result = tennisGame.score(player1, player2);
        assertEquals(result, "FIFTEEN - LOVE");
    }

    @Test
    public void player1_TwoPoints() {
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player1);
        String result = tennisGame.score(player1, player2);
        assertEquals(result, "THIRTY - LOVE");
    }

    @Test
    public void player1_ThreePoints() {
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player1);
        String result = tennisGame.score(player1, player2);
        assertEquals(result, "FORTY - LOVE");
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
        assertEquals(result, "LOVE - FIFTEEN");
    }

    @Test
    public void player2_TwoPoints() {
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player2);
        String result = tennisGame.score(player1, player2);
        assertEquals(result, "LOVE - THIRTY");
    }

    @Test
    public void player2_ThreePoints() {
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player2);
        String result = tennisGame.score(player1, player2);
        assertEquals(result, "LOVE - FORTY");
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
        assertEquals(result, "FIFTEEN - FIFTEEN");
    }

    @Test
    public void player1_player2_haveTwoPoints() {
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player2);
        String result = tennisGame.score(player1, player2);
        assertEquals(result, "THIRTY - THIRTY");
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
        assertEquals(result, "DEUCE");
    }

    @Test
    public void player1_ADVANTAGE() {
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player2);
        String result = tennisGame.score(player1, player2);
        assertEquals(result, "ADVANTAGE - player1");
    }

    @Test
    public void player2_ADVANTAGE() {
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player1);
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player2);
        tennisGame.wonPoint(player2);
        String result = tennisGame.score(player1, player2);
        assertEquals(result, "ADVANTAGE - player2");
    }

    @Test
    public void player1_winAfterADVANTAGE() {
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
    public void player2_winAfterADVANTAGE() {
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