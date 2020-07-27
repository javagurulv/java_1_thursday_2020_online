package student_aleksey_kodin.lesson13.level5;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {
    StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void calculate_v1() {
        int result = stringCalculator.add("");
        assertEquals(result,0);
    }

    @Test
    public void calculate_v2() {
        int result = stringCalculator.add("1");
        assertEquals(result,1);
    }

    @Test
    public void calculate_v3() {
        int result = stringCalculator.add(",15");
        assertEquals(result,15);
    }

    @Test
    public void calculate_v4() {
        int result = stringCalculator.add("1,2");
        assertEquals(result,3);
    }

    @Test
    public void calculate_v5() {
        int result = stringCalculator.add("1,2,7");
        assertEquals(result,10);
    }

    @Test
    public void calculate_v6() {
        int result = stringCalculator.add("1,2,7,10");
        assertEquals(result,20);
    }
}