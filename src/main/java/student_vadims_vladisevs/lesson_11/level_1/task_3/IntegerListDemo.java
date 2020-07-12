package student_vadims_vladisevs.lesson_11.level_1.task_3;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();


        integerList.add(4);
        integerList.add(5);
        integerList.add(5);
        integerList.add(1);
        integerList.add(0,2);
        integerList.add(1,3);

        int listSize = integerList.size();

        integerList.remove(0);
        integerList.remove(Integer.parseInt("2"));

        boolean isEmpty = integerList.isEmpty();

        for (int number : integerList){
            System.out.println(number);
        }
    }
}
