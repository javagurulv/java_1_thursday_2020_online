package student_igors_mihejevs.lesson_8.level_4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Test
    public void testOfRectangleAreaCalculating() {
        Shape rectangle = new Rectangle(8, 5);
        assertEquals(40, rectangle.calculateArea(), 2);
    }

    @Test
    public void testOfRectanglePerimeterCalculating() {
        Shape rectangle = new Rectangle(8, 5);
        assertEquals(26, rectangle.calculatePerimeter(), 2);
    }

}