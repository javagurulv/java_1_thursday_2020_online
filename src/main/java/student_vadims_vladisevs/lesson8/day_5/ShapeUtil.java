package student_vadims_vladisevs.lesson8.day_5;

import java.util.Random;

class ShapeUtil {
    Random rnd = new Random();

    Circle createRandomCircle(){
        return new Circle(rnd.nextInt(10) + 1);
    }

    Square createRandomSquare(){
        return new Square(rnd.nextInt(10) + 1);
    }

    Rectangle createRandomRectangle(){
        return new Rectangle(rnd.nextInt(10) + 1, rnd.nextInt(10) + 1);
    }

    Triangle createRandomTriangle(){
        return new Triangle((rnd.nextInt(10) + 1), (rnd.nextInt(10) + 1), (rnd.nextInt(10) + 1));
    }

    Shape createRandomShape(){
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

    double calculateArea(Shape[] shapes){
        double sumArea = 0.0;
        for (Shape tempShape : shapes){
            sumArea += tempShape.calculateArea();
        }
        return sumArea;
    }

    double calculatePerimeter(Shape[] shapes){
        double sumPerimeter = 0.0;
        for (Shape tempShape : shapes){
            sumPerimeter += tempShape.calculatePerimeter();
        }
        return sumPerimeter;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }


}