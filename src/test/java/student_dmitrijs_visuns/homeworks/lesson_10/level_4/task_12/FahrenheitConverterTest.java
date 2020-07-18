package student_dmitrijs_visuns.homeworks.lesson_10.level_4.task_12;

import org.junit.Test;

import static org.junit.Assert.*;

public class FahrenheitConverterTest {

    @Test
    public void celsiusToFarenheit () {
        FahrenheitConverter converter = new FahrenheitConverter();
        assertEquals(converter.convert(30), 86, 0.0);
    }


}