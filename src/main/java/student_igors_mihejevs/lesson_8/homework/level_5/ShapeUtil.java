package student_igors_mihejevs.lesson_8.homework.level_5;

import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ShapeUtil {

    Circle createRandomCircle() {
        return new Circle(new Random().nextInt(20) + 1);
    }

    Square createRandomSquare() {
        return new Square(new Random().nextInt(20) + 1);
    }

    Rectangle createRandomRectangle() {
        return new Rectangle(new Random().nextInt(20) + 1, new Random().nextInt(20) + 1);
    }

    Triangle createRandomTriangle() {
        return new Triangle(new Random().nextInt(20) + 1, new Random().nextInt(20) + 1,
                new Random().nextInt(20) + 1);
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
        double totalAreaOfAllFigures = 0;
        for (Shape shape : shapes) {
            totalAreaOfAllFigures = totalAreaOfAllFigures + shape.calculateArea();
        }
        return totalAreaOfAllFigures;
    }

    double calculatePerimeter(Shape[] shapes) {
        double totalPerimeterOfAllFigures = 0;
        for (Shape shape : shapes) {
            totalPerimeterOfAllFigures = totalPerimeterOfAllFigures + shape.calculatePerimeter();
        }
        return totalPerimeterOfAllFigures;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

}
