package student_vadims_vladisevs.lesson_11.level_1.task_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ListDemo {
    public static void main(String[] args) {
        /*
        List хранит:
        Только ссылочные типы, любые объекты, включая сторонние классы.
        Строки, потоки вывода, другие коллекции.
        Для хранения примитивных типов данных используются классы-обертки.
         */
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2); // = numbers.add(new Integer(2));
        numbers.add(3);

        List<String> textList = new LinkedList<>();
        textList.add("Random text");
        textList.add("Text");

        List<Class> classList = new ArrayList<>();
        classList.add(new Class(1));
        classList.add(new Class(2));

    }
}
