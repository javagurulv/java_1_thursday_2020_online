package student_vadims_vladisevs.lesson_12.level_4.task_25;

import java.util.ArrayList;
import java.util.List;

class OutOfMemoryErrorDemo {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();

            while (true) {
                list.add(new Object());
            }

    }
}
