package student_dmitrijs_visuns.homeworks.lesson_13.level_4.game_of_life;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountAliveNeighboursTest {

    @Test
    public void shouldCount2neighbours() {
        CountAliveNeighbours testCount = new CountAliveNeighbours();
        boolean[][] curGen = {
                {false, false, false, false, false},
                {false, true, true, false, false},
                {false, true, true, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false}
        };

        int result = testCount.count(curGen, 1,1);
        assertEquals(3, result);
    }

    @Test
    public void shouldCount0neighbours() {
        CountAliveNeighbours testCount = new CountAliveNeighbours();
        boolean[][] curGen = {
                {false, false, false, false, false},
                {false, true, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false}
        };

        int result = testCount.count(curGen, 1,1);
        assertEquals(0, result);
    }

}