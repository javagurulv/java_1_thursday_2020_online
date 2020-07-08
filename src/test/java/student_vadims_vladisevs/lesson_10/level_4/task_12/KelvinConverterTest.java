package student_vadims_vladisevs.lesson_10.level_4.task_12;

import org.junit.Test;

import static org.junit.Assert.*;

public class KelvinConverterTest {

    @Test
    public void convertV1() {
        KelvinConverter kelvinConverter = new KelvinConverter();
        double actual = kelvinConverter.convert(0);
        assertEquals(273.15, actual, 0.1);
    }

    @Test
    public void convertV2() {
        KelvinConverter kelvinConverter = new KelvinConverter();
        double actual = kelvinConverter.convert(10);
        assertEquals(283.15, actual, 0.1);
    }

    @Test
    public void convertV3() {
        KelvinConverter kelvinConverter = new KelvinConverter();
        double actual = kelvinConverter.convert(-10);
        assertEquals(263.15, actual, 0.1);
    }
}