package student_igors_mihejevs.lesson_10.homework.level_4;

import org.junit.Test;

import static org.junit.Assert.*;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class KelvinConverterTest {

    TemperatureConverter temperatureConverterKelvin = new KelvinConverter();

    @Test
    public void ShouldReturnCorrectTemperatureInKelvin() {
        assertEquals(temperatureConverterKelvin.convert(20), 293.15, 0.001 );
    }

    @Test
    public void ShouldReturnCorrectTemperatureInKelvinNegative() {
        assertNotEquals(temperatureConverterKelvin.convert(21), 293.15, 0.001 );
    }

}