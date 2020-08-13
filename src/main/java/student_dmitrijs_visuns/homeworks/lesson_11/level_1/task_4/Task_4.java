package student_dmitrijs_visuns.homeworks.lesson_11.level_1.task_4;

/*
Могут ли реализации интерфейса java.util.List хранить одинаковые
        элементы (дубликаты)? Напишите код программы, который демонстрирует
        ответ на этот вопрос.
*/

import java.util.ArrayList;
import java.util.List;

class Task_4 {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(5);

        for (Integer element : list) {
            System.out.println("List contains element: " + element);
        }


    }



}
