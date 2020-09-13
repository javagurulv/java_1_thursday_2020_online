package student_igors_mihejevs.lesson_8.homework.level_4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {

    @Test
    public void testOfSquareAreaCalculating() {
        Shape square = new Square(5);
        assertEquals(25, square.calculateArea(), 0.009);
    }

    @Test
    public void testOfSquarePerimeterCalculating() {
        Shape square = new Square(5);
        assertEquals(20, square.calculatePerimeter(), 0.009);
    }

}