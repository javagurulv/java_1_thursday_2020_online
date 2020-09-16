package student_igors_mihejevs.lesson_8.homework.level_4;

import org.junit.Test;

import static org.junit.Assert.*;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CircleTest {

    @Test
    public void testOfCircleAreaCalculating() {
        Shape circle = new Circle(5);
        assertEquals(78.54, circle.calculateArea(), 0.009);
    }

    @Test
    public void testOfCirclePerimeterCalculating() {
        Shape circle = new Circle(5);
        assertEquals(31.42, circle.calculatePerimeter(), 0.009);
    }

}