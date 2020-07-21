package student_dmitrijs_visuns.homeworks.lesson_11.level_1.task_3;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {

    public static void main(String[] args) {

        List<Integer> demoList = new ArrayList<>();
        demoList.add(4);
        demoList.add(4);
        demoList.add(6);
        demoList.add(7);
        demoList.add(1,123);
        System.out.println("Current list size: " + demoList.size());
        demoList.remove(Integer.valueOf(4));
        demoList.remove(1);
        System.out.println("Current list size: " + demoList.size());
        System.out.println("Is list empty now: " + demoList.isEmpty());

        System.out.println("List items:");
        for (Integer listItem : demoList) {
            System.out.println(listItem);
        }

    }

}
