package student_vadims_vladisevs.lesson8.day_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void calculateArea() {
        Triangle triangle = new Triangle(4, 3, 8);
        double actual = triangle.calculateArea();
        assertEquals(6, actual, 0.1);
    }

    @Test
    public void calculatePerimeter() {
        Triangle triangle = new Triangle(4, 3, 8);
        double actual = triangle.calculatePerimeter();
        assertEquals(15, actual, 0.1);
    }
}