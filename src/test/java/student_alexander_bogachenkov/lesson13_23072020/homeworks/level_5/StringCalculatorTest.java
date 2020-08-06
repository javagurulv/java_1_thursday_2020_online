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
    public void shouldAdd_whenStringIsNull() {
        StringCalculator calculator = new StringCalculator();
        int actual = calculator.add(null);
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

    @Test
    public void shouldAdd_whenStringContainsThreeNumbers() {
        StringCalculator calculator = new StringCalculator();
        int actual = calculator.add("3,5,9");
        int expected = 17;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAdd_whenStringContainsFiveNumbers() {
        StringCalculator calculator = new StringCalculator();
        int actual = calculator.add("3,5,9,2,3");
        int expected = 22;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAdd_whenStringHasNewLineSymbol() {
        StringCalculator calculator = new StringCalculator();
        int actual = calculator.add("1\\n23,4");
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAdd_whenStringContainsSeparator() {
        StringCalculator calculator = new StringCalculator();
        int actual = calculator.add("//[;]\\n1;2");
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAdd_whenStringContainsSomeSeparators() {
        StringCalculator calculator = new StringCalculator();
        int actual = calculator.add("//[;][&]\\n1;2&3");
        int expected = 6;
        assertEquals(expected, actual);
    }

}