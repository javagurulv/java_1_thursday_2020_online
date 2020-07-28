package student_dmitrijs_visuns.homeworks.lesson_12.level_4.task_25;

import java.util.ArrayList;
import java.util.List;

class OutOfMemory {


    public static void main(String[] args) {

        List<Object> bigList = new ArrayList<>();

        while (true) {
            bigList.add(new Object());

        }

    }
}
