package student_igors_mihejevs.lesson_8.level_4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    @Test
    public void testOfTriangleAreaCalculating() {
        Shape triangle = new Triangle(10, 10, 10);
        assertEquals(43.30, triangle.calculateArea(), 0.009);
    }

    @Test
    public void testOfTrianglePerimeterCalculating() {
        Shape triangle = new Triangle(10, 10, 10);
        assertEquals(30, triangle.calculatePerimeter(), 0.009);
    }

}