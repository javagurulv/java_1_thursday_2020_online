package student_dmitrijs_visuns.homeworks.lesson_13.level_4.game_of_life;

import org.junit.Test;

import static org.junit.Assert.*;

public class LifeRule4Test {

    @Test
    public void shouldReturnTrueWhenCellIsAlive() {
        LifeRule4 testRule = new LifeRule4();
        boolean[][] curGen = {
                {false, false, false, false, false},
                {false, true, false, false, false},
                {false, true, true, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false}
        };
        boolean result = testRule.isActivated(curGen, 1, 1);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenDeadCellHasNo3Neighbours() {
        LifeRule4 testRule = new LifeRule4();
        boolean[][] curGen = {
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, true, true, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false}
        };
        boolean result = testRule.isActivated(curGen, 1, 1);
        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueWhenDeadCellHas3Neighbours() {
        LifeRule4 testRule = new LifeRule4();
        boolean[][] curGen = {
                {false, false, false, false, false},
                {false, false, true, false, false},
                {false, true, true, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false}
        };
        boolean result = testRule.isActivated(curGen, 1, 1);
        assertTrue(result);
    }

}