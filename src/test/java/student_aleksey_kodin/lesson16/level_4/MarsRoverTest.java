package student_aleksey_kodin.lesson16.level_4;

import org.junit.Test;
import static org.junit.Assert.*;

public class MarsRoverTest {
    @Test
    public void test_1() {
        String result = MarsRover.move(1,2,'N',"LMLMLMLMM");
        assertEquals(result, "1 3 N");
    }

    @Test
    public void test_2() {
        String result = MarsRover.move(3,3,'E',"MMRMMRMRRM");
        assertEquals(result, "5 1 E");
    }
}