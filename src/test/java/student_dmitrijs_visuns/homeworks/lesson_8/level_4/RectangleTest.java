package student_dmitrijs_visuns.homeworks.lesson_8.level_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void calculateArea() {
        Rectangle rectangle = new Rectangle(5, 7);
        double result = rectangle.calculateArea();
        double expected = 35;
        assertEquals(result, expected, 0.01);
    }

    @Test
    public void calculatePerimeter() {
        Rectangle rectangle = new Rectangle(5, 7);
        double result = rectangle.calculatePerimeter();
        double expected = 24;
        assertEquals(result, expected, 0.01);
    }
}