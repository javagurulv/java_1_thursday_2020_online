package student_vadims_vladisevs.lesson_10.level_4.task_11;

import org.junit.Test;

import static org.junit.Assert.*;

public class CelsiusToFahrenheitConverterTest {

    @Test
    public void convertV1() {
        CelsiusToFahrenheitConverter celsiusToFahrenheitConverter = new CelsiusToFahrenheitConverter();
        double actual = celsiusToFahrenheitConverter.convert(0);
        assertEquals(32.0, actual, 0.1);
    }

    @Test
    public void convertV2() {
        CelsiusToFahrenheitConverter celsiusToFahrenheitConverter = new CelsiusToFahrenheitConverter();
        double actual = celsiusToFahrenheitConverter.convert(10);
        assertEquals(50.0, actual, 0.1);
    }

    @Test
    public void convertV3() {
        CelsiusToFahrenheitConverter celsiusToFahrenheitConverter = new CelsiusToFahrenheitConverter();
        double actual = celsiusToFahrenheitConverter.convert(-10);
        assertEquals(14.0, actual, 0.1);
    }
}