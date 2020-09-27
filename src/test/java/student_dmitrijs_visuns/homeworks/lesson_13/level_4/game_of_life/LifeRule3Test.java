package student_dmitrijs_visuns.homeworks.lesson_13.level_4.game_of_life;

import org.junit.Test;

import static org.junit.Assert.*;

public class LifeRule3Test {

    @Test
    public void shouldReturnFalseWhenCellIsAlreadyDead() {
        LifeRule3 testRule = new LifeRule3();
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
    public void shouldReturnInitialStateWhen3Neighbours() {
        LifeRule3 testRule = new LifeRule3();
        boolean[][] curGen = {
                {false, false, false, false, false},
                {false, true, true, false, false},
                {false, true, true, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false}
        };
        boolean expected = curGen[1][1];
        boolean result = testRule.isActivated(curGen, 1, 1);
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnFalseWhen4Neighbours() {
        LifeRule3 testRule = new LifeRule3();
        boolean[][] curGen = {
                {false, false, false, false, false},
                {false, true, true, false, false},
                {false, true, true, false, false},
                {false, false, false, true, false},
                {false, false, false, false, false}
        };
        boolean result = testRule.isActivated(curGen, 2, 2);
        assertFalse(result);
    }

}