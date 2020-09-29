package student_diana_miranovica.lesson_10.level_4.task_12;

import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class KelvinConverterTest  {

    @Test
    public void convertNegativeTemperature(){
        KelvinConverter kelvinConverter = new KelvinConverter();
        double expected = 248.15;
        double actual = kelvinConverter.convert(-25);
        assertEquals(expected,actual, 0.05);
    }
    @Test
    public void  convertPositiveTemperature(){
        KelvinConverter kelvinConverter = new KelvinConverter();
        double expected = 291.15;
        double actual = kelvinConverter.convert(+18);
        assertEquals(expected,actual, 0.05);
    }

}