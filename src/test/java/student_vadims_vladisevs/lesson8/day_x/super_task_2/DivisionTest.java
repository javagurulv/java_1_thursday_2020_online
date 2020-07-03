package student_vadims_vladisevs.lesson8.day_x.super_task_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionTest {

    @Test
    public void calculateV1() {
        Argument arg1 = new Argument(10);
        Argument arg2 = new Argument(5);
        MathOperation division = new Division(arg1, arg2);
        assertEquals(2, division.calculate(), 0.1);
    }

    @Test
    public void calculateV2() {
        Argument arg1 = new Argument(2);
        Argument arg2 = new Argument(2);
        MathOperation division = new Division(arg1, arg2);
        assertEquals(1, division.calculate(), 0.1);
    }
}