package student_dmitrijs_visuns.homeworks.lesson_13.level_4.game_of_life;

import org.junit.Test;

import static org.junit.Assert.*;

public class LifeRule2Test {

    @Test
    public void shouldReturnFalseWhenCellIsAlreadyDead() {
        LifeRule2 testRule = new LifeRule2();
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
    public void shouldReturnTrueWhen2Neighbours() {
        LifeRule2 testRule = new LifeRule2();
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
    public void shouldReturnTrueWhen3Neighbours() {
        LifeRule2 testRule = new LifeRule2();
        boolean[][] curGen = {
                {false, false, false, false, false},
                {false, true, true, false, false},
                {false, true, true, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false}
        };
        boolean result = testRule.isActivated(curGen, 1, 1);
        assertTrue(result);
    }

    @Test
    public void shouldReturnInitialStateWhenMoreThan3Neighbours() {
        LifeRule2 testRule = new LifeRule2();
        boolean[][] curGen = {
                {false, false, false, false, false},
                {false, true, true, false, false},
                {false, true, true, true, false},
                {false, false, false, false, false},
                {false, false, false, false, false}
        };
        boolean expected = (curGen[2][2]);
        boolean result = testRule.isActivated(curGen, 2, 2);
        assertEquals(expected, result);
    }

}