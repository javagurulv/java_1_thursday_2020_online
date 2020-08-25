package student_igors_mihejevs.lesson_11.homework.level_1.task_4;

import java.util.ArrayList;
import java.util.List;

class DuplicateListDemo {

    public static void main(String[] args) {

        // Да, может хранить одинаковые элементы (дубликаты)

        List<Integer> numbersAL = new ArrayList<>();

        numbersAL.add(5);
        numbersAL.add(7);
        numbersAL.add(15);
        numbersAL.add(15);
        numbersAL.add(9);
        numbersAL.add(15);
        numbersAL.add(0, Integer.parseInt("3"));

        numbersAL.forEach(System.out::println);
    }

}
