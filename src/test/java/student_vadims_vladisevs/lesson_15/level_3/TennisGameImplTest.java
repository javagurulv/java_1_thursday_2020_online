package student_vadims_vladisevs.lesson_15.level_3;

import org.junit.Test;

import static org.junit.Assert.*;

public class TennisGameImplTest {

    TennisGame game = new TennisGameImpl("player1", "player2");

    @Test
    public void TennisGameTest_startScore() {
        String actual = game.score();
        assertEquals(actual, "LOVE - LOVE");
    }

    @Test
    public void TennisGameTest_player1Win_v1() {
        game.wonPoint("player1");
        String actual = game.score();
        assertEquals(actual, "FIFTEEN - LOVE");
    }

    @Test
    public void TennisGameTest_player1Win_v2() {
        game.wonPoint("player1");
        game.wonPoint("player1");
        String actual = game.score();
        assertEquals(actual, "THIRTY - LOVE");
    }

    @Test
    public void TennisGameTest_player1Win_v3() {
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");
        String actual = game.score();
        assertEquals(actual, "FORTY - LOVE");
    }

    @Test
    public void TennisGameTest_player1Win_v4() {
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");
        game.wonPoint("player1");
        String actual = game.score();
        assertEquals(actual, "Win player1");
    }


    @Test
    public void TennisGameTest_player2Win_v1() {
        game.wonPoint("player2");
        String actual = game.score();
        assertEquals(actual, "LOVE - FIFTEEN");
    }

    @Test
    public void TennisGameTest_player2Win_v2() {
        game.wonPoint("player2");
        game.wonPoint("player2");
        String actual = game.score();
        assertEquals(actual, "LOVE - THIRTY");
    }

    @Test
    public void TennisGameTest_player2Win_v3() {
        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player2");
        String actual = game.score();
        assertEquals(actual, "LOVE - FORTY");
    }

    @Test
    public void TennisGameTest_player2Win_v4() {
        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player2");
        game.wonPoint("player2");
        String actual = game.score();
        assertEquals(actual, "Win player2");
    }

    @Test
    public void TennisGameTest_deuce() {
        game.wonPoint("player1");
        game.wonPoint("player2");
        game.wonPoint("player1");
        game.wonPoint("player2");
        game.wonPoint("player1");
        game.wonPoint("player2");
        String actual = game.score();
        assertEquals(actual, "DEUCE");
    }

    @Test
    public void TennisGameTest_v1() {
        game.wonPoint("player1");
        game.wonPoint("player2");
        String actual = game.score();
        assertEquals(actual, "FIFTEEN - FIFTEEN");
    }

    @Test
    public void TennisGameTest_v2() {
        game.wonPoint("player1");
        game.wonPoint("player2");
        game.wonPoint("player1");
        game.wonPoint("player2");
        String actual = game.score();
        assertEquals(actual, "THIRTY - THIRTY");
    }
    @Test
    public void TennisGameTest_v3() {
        game.wonPoint("player1");
        game.wonPoint("player2");
        game.wonPoint("player1");
        game.wonPoint("player2");
        game.wonPoint("player1");
        String actual = game.score();
        assertEquals(actual, "FORTY - THIRTY");
    }

    @Test
    public void TennisGameTest_advantageFirstPlayer() {
        game.wonPoint("player1");
        game.wonPoint("player2");
        game.wonPoint("player1");
        game.wonPoint("player2");
        game.wonPoint("player1");
        game.wonPoint("player2");
        game.wonPoint("player1");
        String actual = game.score();
        assertEquals(actual, "ADVANTAGE player1");
    }

    @Test
    public void TennisGameTest_advantageSecondPlayer() {
        game.wonPoint("player1");
        game.wonPoint("player2");
        game.wonPoint("player1");
        game.wonPoint("player2");
        game.wonPoint("player1");
        game.wonPoint("player2");
        game.wonPoint("player2");
        String actual = game.score();
        assertEquals(actual, "ADVANTAGE player2");
    }

}