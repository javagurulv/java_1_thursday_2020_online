package student_aleksey_kodin.lesson8.day5.task_20;

import student_aleksey_kodin.lesson8.day5.base_class.Circle;

import java.util.Random;

class ShapeUtil {

    Circle createRandomCircle() {
        int randomRadius = new Random().nextInt(11);
        return new Circle(randomRadius);
    }
}
