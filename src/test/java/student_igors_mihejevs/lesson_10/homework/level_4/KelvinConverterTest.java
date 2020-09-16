package student_igors_mihejevs.lesson_10.homework.level_4;

import org.junit.Test;

import static org.junit.Assert.*;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class KelvinConverterTest {

    @Test
    public void ShouldReturnCorrectTemperatureInKelvin() {
        TemperatureConverter temperatureConverterKelvin = new KelvinConverter();
        assertEquals(temperatureConverterKelvin.convert(20), 293.15, 0.001 );
    }

    @Test
    public void ShouldReturnCorrectTemperatureInKelvinNegative() {
        TemperatureConverter temperatureConverterKelvin = new KelvinConverter();
        assertNotEquals(temperatureConverterKelvin.convert(21), 293.15, 0.001 );
    }

}