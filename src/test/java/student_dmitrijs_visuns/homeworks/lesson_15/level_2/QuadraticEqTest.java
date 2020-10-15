package student_dmitrijs_visuns.homeworks.lesson_15.level_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuadraticEqTest {

    @Test
    public void shouldReturnEquationHasNoRoots () {
        QuadraticEq testEq = new QuadraticEq();
        String result = testEq.calc(2,2,2);
        assertEquals("Equation has no roots", result);
    }

    @Test
    public void shouldReturnOneRoot () {
        QuadraticEq testEq = new QuadraticEq();
        String result = testEq.calc(1,-6,9);
        assertEquals("x = 3.0", result);
    }

    @Test
    public void shouldReturnTwoRoots () {
        QuadraticEq testEq = new QuadraticEq();
        String result = testEq.calc(2,5,-7);
        assertEquals("x1 = -3.5, x2 = 1.0", result);
    }

}