package student_igors_mihejevs.lesson_7.level_6;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerCalculatorTest {

    @Test
    public void testOfPositiveExponent() {
        PowerCalculator powerCalculator = new PowerCalculator();
        double result = powerCalculator.exponentiation(2, 5);
        assertEquals(32, result, 0);
    }

    @Test
    public void testOfNegativeExponent() {
        PowerCalculator powerCalculator = new PowerCalculator();
        double result = powerCalculator.exponentiation(2, -5);
        assertEquals(0.03125, result, 0);
    }

    @Test
    public void testOfZeroExponent() {
        PowerCalculator powerCalculator = new PowerCalculator();
        double result = powerCalculator.exponentiation(2, 0);
        assertEquals(1, result, 0);
    }

}