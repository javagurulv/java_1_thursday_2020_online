package student_vadims_vladisevs.lesson_10.level_4.task_11;

import org.junit.Test;

import static org.junit.Assert.*;

public class CelsiusToKelvinConverterTest {

    @Test
    public void convertV1() {
        CelsiusToKelvinConverter celsiusToKelvinConverter = new CelsiusToKelvinConverter();
        double actual = celsiusToKelvinConverter.convert(0);
        assertEquals(273.15, actual, 0.1);
    }

    @Test
    public void convertV2() {
        CelsiusToKelvinConverter celsiusToKelvinConverter = new CelsiusToKelvinConverter();
        double actual = celsiusToKelvinConverter.convert(10);
        assertEquals(283.15, actual, 0.1);
    }

    @Test
    public void convertV3() {
        CelsiusToKelvinConverter celsiusToKelvinConverter = new CelsiusToKelvinConverter();
        double actual = celsiusToKelvinConverter.convert(-10);
        assertEquals(263.15, actual, 0.1);
    }
}