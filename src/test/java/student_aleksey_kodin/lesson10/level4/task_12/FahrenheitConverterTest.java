package student_aleksey_kodin.lesson10.level4.task_12;

import org.junit.Test;

import static org.junit.Assert.*;

public class FahrenheitConverterTest {

    @Test
    public void convert() {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        double result = fahrenheitConverter.convert(100);

        assertEquals(212,result,0);
    }
}