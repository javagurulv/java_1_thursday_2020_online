package student_aleksey_kodin.lesson8.level5.task_22;

import student_aleksey_kodin.lesson8.level5.base_class.Circle;
import student_aleksey_kodin.lesson8.level5.base_class.Square;
import student_aleksey_kodin.lesson8.level5.base_class.Rectangle;

import java.util.Random;

class ShapeUtil {

    Circle createRandomCircle() {
        int randomRadius = new Random().nextInt(11);
        return new Circle(randomRadius);
    }
    Square createRandomSquare() {
        int base = new Random().nextInt(11);
        int randomHeight = new Random().nextInt(11);
        return new Square(base);
    }
    Rectangle createRandomRectangle() {
        int randomWidth = new Random().nextInt(11);
        int randomHeight = new Random().nextInt(11);
        return new Rectangle(randomWidth,randomHeight);
    }
}
