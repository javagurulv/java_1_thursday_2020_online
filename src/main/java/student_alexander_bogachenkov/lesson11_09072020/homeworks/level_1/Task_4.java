package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Task_4 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(4);
        numbers.add(4);
        numbers.add(4);

        for (Integer number : numbers) {
            System.out.println(number);
        }

        List<Integer> linkedNumbers = new LinkedList<>();
        linkedNumbers.add(6);
        linkedNumbers.add(6);
        linkedNumbers.add(6);
        linkedNumbers.add(6);

        for (Integer number : linkedNumbers) {
            System.out.println(number);
        }
    }
}
