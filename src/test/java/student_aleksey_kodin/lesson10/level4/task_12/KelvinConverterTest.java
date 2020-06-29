package student_aleksey_kodin.lesson10.level4.task_12;

import org.junit.Test;

import static org.junit.Assert.*;

public class KelvinConverterTest {

    @Test
    public void convert() {
        KelvinConverter kelvinConverter = new KelvinConverter();
        double result = kelvinConverter.convert(100);

        assertEquals(373.15,result,0);

    }
}