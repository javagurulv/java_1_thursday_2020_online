package student_diana_miranovica.lesson_11.level_1.task_3;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(45);
        numbers.add(103);
        numbers.add(3,35);
        numbers.add(2,32);

        for (Integer number : numbers){
            System.out.println(number);
        }

        System.out.println("List numbers length = " + numbers.size());

        numbers.remove(4);
        numbers.remove(Integer.valueOf("103"));

        System.out.println("List numbers length = " + numbers.size());

        System.out.println("List numbers isEmpty = " + numbers.isEmpty());

        for (Integer number : numbers){
            System.out.println(number);
        }
    }
}
