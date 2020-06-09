package student_aleksey_kodin.lesson8.day5.task_21;

import student_aleksey_kodin.lesson8.day5.base_class.Circle;
import student_aleksey_kodin.lesson8.day5.base_class.Square;

import java.util.Random;

class ShapeUtil {

    Circle createRandomCircle() {
        int randomRadius = new Random().nextInt(11);
        return new Circle(randomRadius);
    }
    Square createRandomSquare() {
        int randomBase = new Random().nextInt(11);
        return new Square(randomBase);
    }
}
