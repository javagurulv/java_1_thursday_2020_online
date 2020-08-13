package student_julija_skopeca.practical_tasks.lesson_11.level_1.task_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Task_2_Lists_DataTypes {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        //java.util.List может хранить обьекты в случае Arraylist, но
        //Классы-оболочки(wrapp) предоставляют возможность использовать/преобразовывать
        //примитивные типы данных.

        numbers.add(1);

        List<Integer> numbers1 = new LinkedList<>();
        //хранит ссылки на обьекты.

        numbers1.add(1);



    }
}
