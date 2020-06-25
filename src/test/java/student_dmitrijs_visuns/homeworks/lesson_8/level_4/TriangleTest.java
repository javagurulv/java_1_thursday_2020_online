package student_dmitrijs_visuns.homeworks.lesson_8.level_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void calculateArea() {
        Triangle triangle = new Triangle(6, 7, 8);
        double result = triangle.calculateArea();
        double expected = 20.33;
        assertEquals(result, expected, 0.01);
    }

    @Test
    public void calculatePerimeter() {
        Triangle triangle = new Triangle(6, 7, 8);
        double result = triangle.calculatePerimeter();
        double expected = 21;
        assertEquals(result, expected, 0.01);
    }
}
