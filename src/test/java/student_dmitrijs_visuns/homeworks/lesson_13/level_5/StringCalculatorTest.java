package student_dmitrijs_visuns.homeworks.lesson_13.level_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void shouldReturnZeroWhenBlankString() {
        StringCalculator calc = new StringCalculator();
        int result = calc.add(" ");
        assertTrue(result == 0);
    }

    @Test
    public void shouldReturn4WhenJustOneNumber() {
        StringCalculator calc = new StringCalculator();
        int result = calc.add("4");
        assertTrue(result == 4);
    }

    @Test
    public void shouldReturn7() {
        StringCalculator calc = new StringCalculator();
        int result = calc.add("4,3");
        assertTrue(result == 7);
    }

    @Test
    public void shouldReturn5() {
        StringCalculator calc = new StringCalculator();
        int result = calc.add("1,1,1,1,1");
        assertTrue(result == 5);
    }

    @Test
    public void shouldReturn3() {
        StringCalculator calc = new StringCalculator();
        int result = calc.add("//[;]\\n1;2");
        assertTrue(result == 3);
    }

    @Test
    public void shouldReturn6() {
        StringCalculator calc = new StringCalculator();
        int result = calc.add("//[;][&]\\n1;2&3");
        assertTrue(result == 6);
    }

}