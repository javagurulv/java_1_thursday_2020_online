package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class IntegerListDemo {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(0, 1);

        numbers.add(2);

        int numbersLength = numbers.size();

        numbers.remove(0);

        numbers.remove(Integer.valueOf(2));

        boolean isEmptyNumbers = numbers.isEmpty();

        for (Integer number : numbers) {
            System.out.println(number);
        }

     }
}
