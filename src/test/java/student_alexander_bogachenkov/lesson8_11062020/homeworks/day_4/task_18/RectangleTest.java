package student_alexander_bogachenkov.lesson8_11062020.homeworks.day_4.task_18;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void calculateArea() {
        Rectangle victim = new Rectangle("rectangle", 4, 3);
        double actual = victim.calculateArea();
        double expected = 12.00;
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void calculatePerimeter() {
        Rectangle victim = new Rectangle("rectangle", 4, 3);
        double actual = victim.calculatePerimeter();
        double expected = 14.00;
        assertEquals(expected, actual, 0.01);
    }
}