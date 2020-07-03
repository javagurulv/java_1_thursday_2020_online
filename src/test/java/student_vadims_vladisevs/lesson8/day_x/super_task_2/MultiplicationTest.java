package student_vadims_vladisevs.lesson8.day_x.super_task_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationTest {

    @Test
    public void calculateV1() {
        Argument arg1 = new Argument(10);
        Argument arg2 = new Argument(5);
        MathOperation multiplication = new Multiplication(arg1, arg2);
        assertEquals(50, multiplication.calculate(), 0.1);
    }

    @Test
    public void calculateV2() {
        Argument arg1 = new Argument(2);
        Argument arg2 = new Argument(2);
        MathOperation multiplication = new Multiplication(arg1, arg2);
        assertEquals(4, multiplication.calculate(), 0.1);
    }
}