package student_igors_mihejevs.lesson_8.level_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void testOfCircleAreaCalculating() {
        Shape circle = new Circle(5);
        assertEquals(78.54, circle.calculateArea(), 2);
    }

    @Test
    public void testOfCirclePerimeterCalculating() {
        Shape circle = new Circle(5);
        assertEquals(31.42, circle.calculatePerimeter(), 2);
    }

}