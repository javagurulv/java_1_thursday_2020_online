package student_alexander_bogachenkov.lesson8_11062020.homeworks.day_4.task_17;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void calculateArea() {
        Square victim = new Square("square", 3);
        double expected = 9.00;
        double actual = victim.calculateArea();
        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void calculatePerimeter() {
        Square victim = new Square("square", 3);
        double expected = 12.00;
        double actual = victim.calculatePerimeter();
        assertEquals(expected, actual, 0.1);
    }
}