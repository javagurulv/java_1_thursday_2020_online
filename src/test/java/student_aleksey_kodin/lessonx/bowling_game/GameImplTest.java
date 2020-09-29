package student_aleksey_kodin.lessonx.bowling_game;

import org.junit.Test;
import student_aleksey_kodin.lessonx.bowling_game.logic.Report;
import student_aleksey_kodin.lessonx.bowling_game.logic.Roll;

import static org.junit.Assert.*;

public class GameImplTest {
    GameImpl game = new GameImpl(new Roll(), new Report());

    @Test
    public void checkGame_1() {
        game.roll(5);
        game.roll(3);
        game.roll(5);
        game.roll(3);
        game.roll(5);
        game.roll(3);
        game.roll(5);
        game.roll(3);
        game.roll(5);
        game.roll(3);
        game.roll(5);
        game.roll(3);
        game.roll(5);
        game.roll(3);
        game.roll(5);
        game.roll(3);
        game.roll(5);
        game.roll(3);
        game.roll(5);
        game.roll(3);

        assertTrue(game.isGameFinished());
        assertEquals(11, game.getNextNumberOfFrame());
        assertEquals(80, game.score());
    }

    @Test
    public void checkGame_2() {
        game.roll(1);
        game.roll(7);
        game.roll(1);
        game.roll(1);

        assertEquals(3, game.getNextNumberOfFrame());
        assertEquals(10, game.score());
    }

    @Test
    public void checkSpare_1() {
        game.roll(5);
        game.roll(5);
        game.roll(7);

        assertEquals(2, game.getNextNumberOfFrame());
        assertEquals(17, game.score());
    }

    @Test
    public void checkSpare_2() {
        game.roll(5);
        game.roll(5);
        game.roll(10);

        assertEquals(2, game.getNextNumberOfFrame());
        assertEquals(20, game.score());
    }

    @Test
    public void checkSpare_3() {
        game.roll(0);
        game.roll(10);
        game.roll(1);

        assertEquals(2, game.getNextNumberOfFrame());
        assertEquals(11, game.score());
    }

    @Test
    public void checkStrike_1() {
        game.roll(10);
        game.roll(5);
        game.roll(1);

        assertEquals(2, game.getNextNumberOfFrame());
        assertEquals(16, game.score());
    }

    @Test
    public void checkStrike_2() {
        game.roll(10);
        game.roll(0);
        game.roll(10);

        assertEquals(2, game.getNextNumberOfFrame());
        assertEquals(20, game.score());
    }

    @Test
    public void checkFrameNumberOfPins_1() {
        assertEquals(10, game.getFrameNumberOfPins());
    }

    @Test
    public void checkFrameNumberOfPins_2() {
        game.roll(5);
        assertEquals(5, game.getFrameNumberOfPins());
    }

    @Test
    public void checkFrameNumberOfPins_3() {
        game.roll(3);
        assertEquals(7, game.getFrameNumberOfPins());
    }
}