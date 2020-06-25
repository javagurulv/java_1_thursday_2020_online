package student_dmitrijs_visuns.homeworks.lesson_8.level_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void calculateArea() {
        Circle circle = new Circle(10);
        double result = circle.calculateArea();
        double expected = 314.16;
        assertEquals(result, expected, 0.01);
    }

    @Test
    public void calculatePerimeter() {
        Circle circle = new Circle(10);
        double result = circle.calculatePerimeter();
        double expected = 62.83;
        assertEquals(result, expected, 0.01);
    }

}