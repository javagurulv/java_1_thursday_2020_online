package student_igors_mihejevs.lesson_11.homework.level_1.task_3;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class IntegerListDemo {

    public static void main(String[] args) {

        List<Integer> numbersAL = new ArrayList<>();

        System.out.println("List is empty = " + numbersAL.isEmpty()); // List is empty (true)

        numbersAL.add(5); // add to the end
        numbersAL.add(7); // add to the end
        numbersAL.add(9); // add to the end
        numbersAL.add(0, Integer.parseInt("3")); // add to the beginning

        for (Integer number : numbersAL) {
            System.out.print(number + " ");
        }
        System.out.println();

        numbersAL.forEach(System.out::println);

        System.out.println("Length of the List = " + numbersAL.size()); // print the length of the list

        System.out.println("Element 0 before deleting = " + numbersAL.get(0));
        numbersAL.remove(0); // removing elements with index 0
        System.out.println("Length of the List after deleting = " + numbersAL.size());
        System.out.println("Element 0 after deleting = " + numbersAL.get(0));
        for (Integer number : numbersAL) {
            System.out.print(number + " ");
        }
        System.out.println();

        numbersAL.remove(Integer.valueOf(7)); // removing element 7
        for (Integer number : numbersAL) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("List is empty = " + numbersAL.isEmpty()); // List is not empty (false)
    }

}
