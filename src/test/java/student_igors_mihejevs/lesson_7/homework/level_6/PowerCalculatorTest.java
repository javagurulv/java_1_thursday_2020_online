package student_igors_mihejevs.lesson_7.homework.level_6;

import org.junit.Test;

import static org.junit.Assert.*;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class PowerCalculatorTest {

    @Test
    public void testOfPositiveExponent() {
        PowerCalculator powerCalculator = new PowerCalculator();
        assertEquals(32, powerCalculator.exponentiation(2, 5), 0);
    }

    @Test
    public void testOfNegativeExponent() {
        PowerCalculator powerCalculator = new PowerCalculator();
        assertEquals(0.03125, powerCalculator.exponentiation(2, -5), 0);
    }

    @Test
    public void testOfZeroExponent() {
        PowerCalculator powerCalculator = new PowerCalculator();
        assertEquals(1, powerCalculator.exponentiation(2, 0), 0);
    }

}