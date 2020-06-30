package student_julija_skopeca.practical_tasks.lesson_8.level_5;

import java.util.Random;

public class ShapeUtil {

    Circle createRandomCircle() {
        int radius = new Random().nextInt(3);
        return new Circle(radius);
    }

    Square createRandomSquare() {
        int edge = new Random().nextInt(3);
        return new Square(edge);
    }

    Rectangle createRandomRectangle() {
        int windth = new Random().nextInt(3);
        int lengh = new Random().nextInt(5);
        return new Rectangle(windth, lengh);
    }

    Triangle createRandomTriangle() {
        int altitude = new Random().nextInt(3);
        int lengh = new Random().nextInt(3);
        return new Triangle(altitude, lengh);
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
        double sumAreas = 0;
        for (Shape shape : shapes) {
            sumAreas += shape.calculateArea();
        }
        return sumAreas;
    }

    double calculatePerimeter(Shape[] shapes) {
        double sumPerimeters = 0;
        for (Shape shape : shapes) {
            sumPerimeters += shape.calculatePerimeter();
        }
        return sumPerimeters;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

}
