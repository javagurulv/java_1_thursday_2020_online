package student_igors_mihejevs.lesson_8.level_4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {

    @Test
    public void testOfCircleAreaCalculating() {
        Shape square = new Square(5);
        assertEquals(25, square.calculateArea(), 2);
    }

    @Test
    public void testOfCirclePerimeterCalculating() {
        Shape square = new Square(5);
        assertEquals(20, square.calculatePerimeter(), 2);
    }

}