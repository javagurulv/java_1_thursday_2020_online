package student_alexander_bogachenkov.lesson8_11062020.homeworks.day_4.task_19;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void calculateArea() {
        Triangle victim = new Triangle("triangle", 5, 6, 3);
        double expected = 7.4833;
        double actual = victim.calculateArea();
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void calculatePerimeter() {
        Triangle victim = new Triangle("triangle", 5, 6, 3);
        double expected = 14.00;
        double actual = victim.calculatePerimeter();
        assertEquals(expected, actual, 0.01);
    }
}