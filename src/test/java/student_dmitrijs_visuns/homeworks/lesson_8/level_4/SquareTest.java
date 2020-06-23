package student_dmitrijs_visuns.homeworks.lesson_8.level_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void calculateArea() {
        Square square = new Square(6);
        double result = square.calculateArea();
        double expected = 36;
        assertEquals(result, expected, 0.01);
    }

    @Test
    public void calculatePerimeter() {
        Square square = new Square(6);
        double result = square.calculatePerimeter();
        double expected = 24;
        assertEquals(result, expected, 0.01);
    }
}
