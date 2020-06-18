package student_alexander_bogachenkov.lesson8_11062020.homeworks.day_5;

import java.util.Random;

class ShapeUtil {

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
        double area = 0;
        for (Shape shape : shapes) {
            area += shape.calculateArea();
        }
        return area;
    }

    double calculatePerimeter(Shape[] shapes) {
        double perimeter = 0;
        for (Shape shape : shapes) {
            perimeter += shape.calculatePerimeter();
        }
        return perimeter;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

    Circle createRandomCircle() {
        Random random = new Random();
        int randomRadius = random.nextInt(100);
        return new Circle(randomRadius);
    }

    Square createRandomSquare() {
        Random random = new Random();
        int randomSideLength = random.nextInt(100);
        return new Square(randomSideLength);
    }

    Rectangle createRandomRectangle() {
        Random random = new Random();
        int randomSideLength = random.nextInt(100);
        return new Rectangle(randomSideLength, randomSideLength);
    }

    Triangle createRandomTriangle() {
        Random random = new Random();
        int randomSideLength = random.nextInt(100);
        return new Triangle(randomSideLength, randomSideLength, randomSideLength);
    }
}
