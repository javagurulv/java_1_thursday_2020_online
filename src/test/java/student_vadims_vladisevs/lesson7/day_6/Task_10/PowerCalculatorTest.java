package student_vadims_vladisevs.lesson7.day_6.Task_10;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerCalculatorTest {
    PowerCalculator powerCalculator = new PowerCalculator();

    @Test
    public void calculateTestV1() {
        int actual = powerCalculator.calculate(2,3);
        assertEquals(8,actual);
    }

    @Test
    public void calculateTestV2(){
        int actual = powerCalculator.calculate(5,2);
        assertEquals(25,actual);
    }

    @Test
    public void calculateTestV3() {
        int actual = powerCalculator.calculate(3,3);
        assertEquals(27,actual);
    }
}