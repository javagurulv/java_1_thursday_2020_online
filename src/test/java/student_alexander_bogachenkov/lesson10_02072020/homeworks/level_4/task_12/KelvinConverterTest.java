package student_alexander_bogachenkov.lesson10_02072020.homeworks.level_4.task_12;

import org.junit.Test;

import static org.junit.Assert.*;

public class KelvinConverterTest {

    @Test
    public void shouldConvertPositiveTemperature() {
        KelvinConverter kelvinConverter = new KelvinConverter();
        double expected = 298.65;
        double actual = kelvinConverter.convert(25.5);
        assertEquals(expected, actual, 0.05);
    }

    @Test
    public void shouldConvertNegativeTemperature() {
        KelvinConverter kelvinConverter = new KelvinConverter();
        double expected = 259.15;
        double actual = kelvinConverter.convert(-14);
        assertEquals(expected, actual, 0.05);
    }

}