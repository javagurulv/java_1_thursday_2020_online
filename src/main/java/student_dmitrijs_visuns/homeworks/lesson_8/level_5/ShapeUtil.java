package student_dmitrijs_visuns.homeworks.lesson_8.level_5;

import java.util.Random;

class ShapeUtil {

    // Task_20
    Circle createRandomCircle () {
        Random randomNumber = new Random();
        double radius = randomNumber.nextInt(20);
        return new Circle(radius);
    }

    // Task_21
    Square createRandomSquare () {
        Random randomNumber = new Random();
        double side = randomNumber.nextInt(20);
        return new Square(side);
    }

    // Task_22
    Rectangle createRandomRectangle () {
        Random randomNumber = new Random();
        double width = randomNumber.nextInt(20);
        double height = randomNumber.nextInt(20);
        return new Rectangle(width, height);
    }

    // Task_23
    Triangle createRandomTriangle() {
        Random randomNumber = new Random();
        double sideA = randomNumber.nextInt(20);
        double sideB = randomNumber.nextInt(20);
        double sideC = randomNumber.nextInt(20);
        return new Triangle(sideA, sideB, sideC);
    }


    // Task_24
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

    // Task_25
    double calculateArea(Shape[] shapes) {
        double areaOfAllShapes = 0;
        for (Shape shape : shapes) {
            areaOfAllShapes = areaOfAllShapes + shape.calculateArea();
        }
        return areaOfAllShapes;
    }

    // Task_26
    double calculatePerimeter(Shape[] shapes) {
        double perimeterOfAllShapes = 0;
        for (Shape shape : shapes) {
            perimeterOfAllShapes = perimeterOfAllShapes + shape.calculateArea();
        }
        return perimeterOfAllShapes;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }



}
