package student_aleksey_kodin.lesson10.levelx.supertask4;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertKelvinToCelsiusTest {
    Convert celsiusToKelvin = new Convert(new ConvertCelsiusToKelvin());
    Convert celsiusToFahrenheit = new Convert(new ConvertCelsiusToFahrenheit());
    Convert fahrenheitToKelvin = new Convert(new ConvertFahrenheitToKelvin());
    Convert fahrenheitToCelsius = new Convert(new ConvertFahrenheitToCelsius());
    Convert KelvinToCelsius = new Convert(new ConvertKelvinToCelsius());
    Convert KelvinToFahrenheit = new Convert(new ConvertKelvinToFahrenheit());

    @Test
    public void convertCelsiusToKelvin() {
        double result = celsiusToKelvin.convertation(10);

        assertEquals(283.15, result, 0);
    }

    @Test
    public void convertCelsiusToFahrenheit() {
        double result = celsiusToFahrenheit.convertation(10);

        assertEquals(50, result, 0);

    }

    @Test
    public void convertFahrenheitToKelvin() {
        double result = fahrenheitToKelvin.convertation(5);

        assertEquals(258.15, result, 0);

    }

    @Test
    public void convertFahrenheitToCelsius() {
        double result = fahrenheitToCelsius.convertation(5);

        assertEquals(-15, result, 0);

    }

    @Test
    public void convertKelvinToCelsius() {
        double result = KelvinToCelsius.convertation(5);

        assertEquals(-268.15, result, 0);
    }

    @Test
    public void convertKelvinToFahrenheit() {
        double result = KelvinToFahrenheit.convertation(100);

        assertEquals(-279.66, result, 1);
    }
}