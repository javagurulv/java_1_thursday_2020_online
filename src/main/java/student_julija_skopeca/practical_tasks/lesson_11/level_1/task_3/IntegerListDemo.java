package student_julija_skopeca.practical_tasks.lesson_11.level_1.task_3;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        numbers.add(0,10);
        numbers.add(10);

        for (Integer number : numbers) {
            System.out.println(number);
        }

        System.out.println("List numbers length = " + numbers.size());

        numbers.remove(0);
        numbers.remove(Integer.valueOf("10"));

        System.out.println("List numbers isEmpty = " + numbers.isEmpty());

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
