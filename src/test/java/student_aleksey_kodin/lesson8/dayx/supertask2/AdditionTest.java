package student_aleksey_kodin.lesson8.dayx.supertask2;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTest {

    @Test
    public void testAddition() {
        Argument arg1 = new Argument(15);
        Argument arg2 = new Argument(20);
        MathOperation addition = new Addition(arg1, arg2);
        double result = addition.calculate();
        assertEquals(35,result,0);
    }
    @Test
    public void testMultiply() {
        Argument arg1 = new Argument(15);
        Argument arg2 = new Argument(20);
        MathOperation multiply = new Multiply(arg1, arg2);
        double result = multiply.calculate();
        assertEquals(300,result,0);
    }
    @Test
    public void testDivision() {
        Argument arg1 = new Argument(100);
        Argument arg2 = new Argument(5);
        MathOperation division = new Division(arg1, arg2);
        double result = division.calculate();
        assertEquals(20,result,0);
    }

}