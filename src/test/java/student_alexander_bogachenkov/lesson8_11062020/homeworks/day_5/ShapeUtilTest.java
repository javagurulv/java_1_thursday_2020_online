package student_alexander_bogachenkov.lesson8_11062020.homeworks.day_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeUtilTest {

    @Test
    public void calculateArea() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(7);
        shapes[1] = new Square(5);
        shapes[2] = new Rectangle(3, 6);
        shapes[3] = new Triangle(7, 6, 5);
        double actualResult = shapeUtil.calculateArea(shapes);
        double expectedResult = 211.64;
        assertEquals(expectedResult, actualResult, 0.05);
    }

    @Test
    public void calculatePerimeter() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(7);
        shapes[1] = new Square(5);
        shapes[2] = new Rectangle(3, 6);
        shapes[3] = new Triangle(7, 6, 5);
        double actualResult = shapeUtil.calculatePerimeter(shapes);
        double expectedResult = 100;
        assertEquals(expectedResult, actualResult, 0.05);
    }
}