package student_alexander_bogachenkov.lesson13_23072020.homeworks.level_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void shouldAdd_whenStringDoesNotContainAnything() {
        StringCalculator calculator = new StringCalculator();
        int actual = calculator.add("");
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAdd_whenStringContainsOneNumber() {
        StringCalculator calculator = new StringCalculator();
        int actual = calculator.add("3");
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAdd_whenStringContainsTwoNumbers() {
        StringCalculator calculator = new StringCalculator();
        int actual = calculator.add("3,5");
        int expected = 8;
        assertEquals(expected, actual);
    }

}