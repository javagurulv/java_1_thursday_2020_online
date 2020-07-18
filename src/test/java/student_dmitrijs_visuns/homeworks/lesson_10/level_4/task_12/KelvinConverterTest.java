package student_dmitrijs_visuns.homeworks.lesson_10.level_4.task_12;

import org.junit.Test;

import static org.junit.Assert.*;

public class KelvinConverterTest {

    @Test
    public void celsiusToKelvin () {
        KelvinConverter converter = new KelvinConverter();
        assertEquals(converter.convert(30), 303.15, 0.0);
    }

}