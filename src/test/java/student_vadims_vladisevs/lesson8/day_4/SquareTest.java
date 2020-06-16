package student_vadims_vladisevs.lesson8.day_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void calculateArea() {
        Square square = new Square(2);
        double actual = square.calculateArea();
        assertEquals(4, actual, 0.1);
    }

    @Test
    public void calculatePerimeter() {
        Square square = new Square(2);
        double actual = square.calculatePerimeter();
        assertEquals(8, actual, 0.1);
    }
}