package student_alexander_bogachenkov.lesson10_02072020.homeworks.level_4.task_12;

import org.junit.Test;

import static org.junit.Assert.*;

public class FahrenheitConverterTest {

    @Test
    public void shouldConvertPositiveTemperature() {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        double expected = 77.9;
        double actual = fahrenheitConverter.convert(25.5);
        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void shouldConvertNegativeTemperature() {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        double expected = 6.8;
        double actual = fahrenheitConverter.convert(-14);
        assertEquals(expected, actual, 0.1);
    }

}