package student_aleksey_kodin.lesson8.day5.task_26;

import student_aleksey_kodin.lesson8.day5.base_class.*;

import java.util.Random;

class ShapeUtil {

    Circle createRandomCircle() {
        int randomRadius = new Random().nextInt(10) + 1;
        return new Circle(randomRadius);
    }
    Square createRandomSquare() {
        int base = new Random().nextInt(10) + 1;
        int randomHeight = new Random().nextInt(10) + 1;
        return new Square(base);
    }
    Rectangle createRandomRectangle() {
        int randomWidth = new Random().nextInt(10) + 1;
        int randomHeight = new Random().nextInt(10) + 1;
        return new Rectangle(randomWidth,randomHeight);
    }
    Triangle createRandomTriangle() {
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
    double calculateArea(Shape[] shapes) {
        double sumArea = 0;
        for (Shape shape : shapes) {
            sumArea = sumArea + shape.calculateArea();
        }
    return sumArea;
    }
    double calculatePerimeter(Shape[] shapes) {
        double sumPerimeter = 0;
        for (Shape shape : shapes) {
            sumPerimeter = sumPerimeter + shape.calculateArea();
        }
        return sumPerimeter;
    }
}
