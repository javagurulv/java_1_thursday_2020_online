package student_alexander_bogachenkov.lesson15_11082020.homeworks.level_2.task_7;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuadraticEqTest {

    @Test
    public void shouldCalc_whenDiscriminantIsOverZero() {
        QuadraticEq calculator = new QuadraticEq();
        assertEquals("x1 = 2.0, x2 = 6.0",calculator.calc(1, -8, 12));
    }

    @Test
    public void shouldCalc_whenDiscriminantEqualsZero() {
        QuadraticEq calculator = new QuadraticEq();
        assertEquals("x = 3.0", calculator.calc(1, -6, 9));
    }

    @Test
    public void discriminantIsLessThanZero() {
        QuadraticEq calculator = new QuadraticEq();
        assertEquals("Equation has no roots", calculator.calc(5, 3, 7));
    }
}