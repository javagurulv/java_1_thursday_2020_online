package student_diana_miranovica.lesson_10.level_4.task_12;

import junit.framework.TestCase;
import org.junit.Test;
import student_aleksey_kodin.lesson10.level4.task_11.Fahrenheit;

import static org.junit.Assert.assertEquals;

public class FahrenheitConverterTest  {


    @Test
    public void convertNegativeTemperature(){
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        double expected = 5;
        double actual = fahrenheitConverter.convert(-15);
        assertEquals(expected,actual, 0.1);
    }

    @Test
    public void  convertPositiveTemperature(){
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        double expected = 50;
        double actual = fahrenheitConverter.convert(+10);
        assertEquals(expected, actual, 0.1);
    }



}