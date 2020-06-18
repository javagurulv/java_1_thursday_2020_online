package student_vadims_vladisevs.lesson8.day_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeUtilTest {

    @Test
    public void calculateArea() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shape = new Shape[4];
        shape[0] = shapeUtil.createRandomCircle();
        shape[1] = shapeUtil.createRandomSquare();
        shape[2] = shapeUtil.createRandomRectangle();
        shape[3] = shapeUtil.createRandomTriangle();

        double expected = shape[0].calculateArea() + shape[1].calculateArea() + shape[2].calculateArea() + shape[3].calculateArea();
        double actual = shapeUtil.calculateArea(shape);
        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void calculatePerimeter() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shape = new Shape[4];
        shape[0] = shapeUtil.createRandomCircle();
        shape[1] = shapeUtil.createRandomSquare();
        shape[2] = shapeUtil.createRandomRectangle();
        shape[3] = shapeUtil.createRandomTriangle();

        double expected = shape[0].calculatePerimeter() + shape[1].calculatePerimeter() + shape[2].calculatePerimeter() + shape[3].calculatePerimeter();
        double actual = shapeUtil.calculatePerimeter(shape);
        assertEquals(expected, actual, 0.1);
    }
}