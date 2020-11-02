package student_igors_mihejevs.lesson_10.homework.level_4;

import org.junit.Test;

import static org.junit.Assert.*;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class FahrenheitConverterTest {

    TemperatureConverter temperatureConverterFahrenheit = new FahrenheitConverter();

    @Test
    public void ShouldReturnCorrectTemperatureInFahrenheit() {
        assertEquals(temperatureConverterFahrenheit.convert(20), 68.0, 0.001 );
    }

    @Test
    public void ShouldReturnCorrectTemperatureInFahrenheitNegative() {
        assertNotEquals(temperatureConverterFahrenheit.convert(21), 68.0, 0.001 );
    }

}