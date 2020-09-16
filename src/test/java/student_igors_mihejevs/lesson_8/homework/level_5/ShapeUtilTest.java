package student_igors_mihejevs.lesson_8.homework.level_5;

import org.junit.Test;

import static org.junit.Assert.*;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ShapeUtilTest {

    @Test
    public void calculateAreaMethodTest() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle(5);
        shapes[1] = new Square(5);
        shapes[2] = new Rectangle(8, 5);
        shapes[3] = new Triangle(10, 10, 10);

        assertEquals(186.84, shapeUtil.calculateArea(shapes), 0.009);
    }

    @Test
    public void calculatePerimeterMethodTest() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle(5);
        shapes[1] = new Square(5);
        shapes[2] = new Rectangle(8, 5);
        shapes[3] = new Triangle(10, 10, 10);

        assertEquals(107.42, shapeUtil.calculatePerimeter(shapes), 0.009);
    }

}