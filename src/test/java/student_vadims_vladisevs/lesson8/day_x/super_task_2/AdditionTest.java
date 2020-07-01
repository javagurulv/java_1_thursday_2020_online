package student_vadims_vladisevs.lesson8.day_x.super_task_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTest {

    @Test
    public void calculateV1() {
        Argument arg1 = new Argument(10);
        Argument arg2 = new Argument(5);
        MathOperation addition = new Addition(arg1, arg2);
        assertEquals(15, addition.calculate(), 0.1);
    }

    @Test
    public void calculateV2() {
        Argument arg1 = new Argument(2);
        Argument arg2 = new Argument(2);
        MathOperation addition = new Addition(arg1, arg2);
        assertEquals(4, addition.calculate(), 0.1);
    }
}