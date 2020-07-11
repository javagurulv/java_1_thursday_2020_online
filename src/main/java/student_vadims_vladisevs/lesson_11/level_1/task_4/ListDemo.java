package student_vadims_vladisevs.lesson_11.level_1.task_4;

import java.util.ArrayList;
import java.util.List;

class ListDemo {
    public static void main(String[] args) {
        /*
        java.util.List может хранить дубликаты
         */

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);

        for (int number : list){
            System.out.println(number);
        }
    }


}
