package student_aleksey_kodin.lesson8.level5.task_27;

import student_aleksey_kodin.lesson8.level5.base_class.*;

import java.util.Random;

public class ShapeUtil {

    public Circle createRandomCircle() {
        int randomRadius = new Random().nextInt(10) + 1;
        return new Circle(randomRadius);
    }
    public Square createRandomSquare() {
        int base = new Random().nextInt(10) + 1;
        int randomHeight = new Random().nextInt(10) + 1;
        return new Square(base);
    }
    public Rectangle createRandomRectangle() {
        int randomWidth = new Random().nextInt(10) + 1;
        int randomHeight = new Random().nextInt(10) + 1;
        return new Rectangle(randomWidth,randomHeight);
    }
    public Triangle createRandomTriangle() {
        int randomBaseA = new Random().nextInt(10) + 1;
        int randomBaseB = new Random().nextInt(10) + 1;
        int randomBaseC = new Random().nextInt(10) + 1;
        int randomHeight = new Random().nextInt(10) + 1;
        return new Triangle(randomBaseA,randomBaseB,randomBaseC,randomHeight);
    }
    Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }
    public double calculateArea(Shape[] shapes) {
        double sumArea = 0;
        for (Shape shape : shapes) {
            sumArea = sumArea + shape.calculateArea();
        }
    return sumArea;
    }
    public double calculatePerimeter(Shape[] shapes) {
        double sumPerimeter = 0;
        for (Shape shape : shapes) {
            sumPerimeter = sumPerimeter + shape.calculateArea();
        }
        return sumPerimeter;
    }
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
    public double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}
