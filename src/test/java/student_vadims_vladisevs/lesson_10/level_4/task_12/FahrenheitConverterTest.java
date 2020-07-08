package student_vadims_vladisevs.lesson_10.level_4.task_12;

import org.junit.Test;

import static org.junit.Assert.*;

public class FahrenheitConverterTest {

    @Test
    public void convertV1() {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        double actual = fahrenheitConverter.convert(0);
        assertEquals(32.0, actual, 0.1);
    }

    @Test
    public void convertV2() {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        double actual = fahrenheitConverter.convert(10);
        assertEquals(50.0, actual, 0.1);
    }

    @Test
    public void convertV3() {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        double actual = fahrenheitConverter.convert(-10);
        assertEquals(14.0, actual, 0.1);
    }
}