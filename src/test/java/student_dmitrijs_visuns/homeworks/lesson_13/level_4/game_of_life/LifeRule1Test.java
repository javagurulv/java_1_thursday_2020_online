package student_dmitrijs_visuns.homeworks.lesson_13.level_4.game_of_life;

import org.junit.Test;

import static org.junit.Assert.*;

public class LifeRule1Test {

    @Test
    public void shouldReturnTrueWhen2Neighbours() {
        LifeRule1 testRule = new LifeRule1();
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
    public void shouldReturnFalseWhen1Neighbour() {
        LifeRule1 testRule = new LifeRule1();
        boolean[][] curGen = {
                {false, false, false, false, false},
                {false, true, false, false, false},
                {false, false, true, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false}
        };
        boolean result = testRule.isActivated(curGen, 1, 1);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenCellIsAlreadyDead() {
        LifeRule1 testRule = new LifeRule1();
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

}