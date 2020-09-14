package student_igors_mihejevs.lesson_10.homework.level_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class FahrenheitConverterTest {

    @Test
    public void ShouldReturnCorrectTemperatureInFahrenheit() {
        TemperatureConverter temperatureConverterFahrenheit = new FahrenheitConverter();
        assertEquals(temperatureConverterFahrenheit.convert(20), 68.0, 0.001 );
    }

    @Test
    public void ShouldReturnCorrectTemperatureInFahrenheitNegative() {
        TemperatureConverter temperatureConverterFahrenheit = new FahrenheitConverter();
        assertNotEquals(temperatureConverterFahrenheit.convert(21), 68.0, 0.001 );
    }

}