package student_alexander_bogachenkov.lesson15_11082020.homeworks.level_3.task_11;

import org.junit.Test;

import static org.junit.Assert.*;

public class TennisGameImplTest {

    @Test
    public void shouldAddPointToPlayer_whenNoPlayersAdded() {
        TennisGameImpl game = new TennisGameImpl();
        game.wonPoint("Jack");
        assertEquals(1, game.getFirstPlayerScore());
    }

    @Test
    public void shouldAddPointToPlayer_whenOnePlayerAdded() {
        TennisGameImpl game = new TennisGameImpl();
        game.wonPoint("Jack");
        game.wonPoint("Simon");
        game.wonPoint("Simon");
        assertEquals(2, game.getSecondPlayerScore());
    }

    @Test
    public void shouldReturnScoreLoveLove() {
        TennisGameImpl game = new TennisGameImpl();
        assertEquals("Love - Love", game.score());
    }

    @Test
    public void shouldReturnScoreFifteenLove() {
        TennisGameImpl game = new TennisGameImpl();
        game.wonPoint("Jack");
        assertEquals("Fifteen - Love", game.score());
    }

    @Test
    public void shouldReturnScoreThirtyFifteen() {
        TennisGameImpl game = new TennisGameImpl();
        game.wonPoint("Jack");
        game.wonPoint("Jack");
        game.wonPoint("Simon");
        assertEquals("Thirty - Fifteen", game.score());
    }
}