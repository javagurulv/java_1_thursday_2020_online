package student_vadims_vladisevs.lesson8.day_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {


    @Test
    public void calculateArea() {
        Circle test = new Circle(5.0);
        double actual = test.calculateArea();
        assertEquals(78.5, actual, 0.1);
    }

    @Test
    public void calculatePerimeter() {
        Circle test = new Circle(5.0);
        double actual = test.calculatePerimeter();
        assertEquals(31.4, actual, 0.1);
    }
}