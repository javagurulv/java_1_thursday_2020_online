package student_aleksey_kodin.lesson10.level4.task_11;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertTest {
    Convert convert = new Convert();
    Celsius celsius = new Celsius();
    Kelvin kelvin = new Kelvin();
    Fahrenheit fahrenheit = new Fahrenheit();

    @Test
    public void testConvertCelsiusToKelvin() {
        celsius.setCelsius(100);
        double result = convert.convert(celsius, kelvin);
        assertEquals(373.15, result, 0);
    }

    @Test
    public void testConvertKelvinToCelsius() {
        kelvin.setKelvin(373.15);
        double result = convert.convert(kelvin, celsius);
        assertEquals(100, result, 0);
    }

    @Test
    public void testConvertCelsiusToFahrenheit() {
        celsius.setCelsius(100);
        double result = convert.convert(celsius, fahrenheit);
        assertEquals(212, result, 0);

    }

    @Test
    public void testConvertFahrenheitToCelsius() {
        fahrenheit.setFahrenheit(212);
        double result = convert.convert(fahrenheit, celsius);
        assertEquals(100, result, 0);
    }
}