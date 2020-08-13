package student_dmitrijs_visuns.homeworks.lesson_11.level_1.task_2;

import java.util.ArrayList;
import java.util.List;

class Task_2 {

    // java.util.List может хранить только ссылки на объекты. Для упрощения работы со списками среда разработки
    // использует автоматические методы wrapping/unwrapping, оборачивающие используемые примитивные типы данных
    // в объекты (примитив int оборачивается в Integer и наоборот, итд.).

    public static void main(String[] args) {

        List<Integer> arrListExample = new ArrayList<>();
        int i = 5;

        arrListExample.add(5);
        arrListExample.add(i);
        arrListExample.add(new Integer(5));

        for (Integer listItem : arrListExample) {
            System.out.println(listItem);
        }

    }


}
