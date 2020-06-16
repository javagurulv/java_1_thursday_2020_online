package student_vadims_vladisevs.lesson8.day_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void calculateArea() {
        Rectangle rectangle = new Rectangle(2,3);
        double actual = rectangle.calculateArea();
        assertEquals(6,actual, 0.1);
    }

    @Test
    public void calculatePerimeter() {
        Rectangle rectangle = new Rectangle(2,3);
        double actual = rectangle.calculatePerimeter();
        assertEquals(10,actual, 0.1);
    }
}