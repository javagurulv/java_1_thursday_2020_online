package student_igors_mihejevs.lesson_11.homework.level_1.task_4;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
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

        List<Integer> numbersToRemove = new ArrayList<>();
        numbersToRemove.add(Integer.parseInt("15"));
        numbersToRemove.add(Integer.parseInt("7"));
        numbersAL.removeAll(numbersToRemove);

        System.out.println("After removing numbers 15 and 7");
        numbersAL.forEach(System.out::println);

    }

}
