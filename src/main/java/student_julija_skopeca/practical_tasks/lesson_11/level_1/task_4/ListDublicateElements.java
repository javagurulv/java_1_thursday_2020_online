package student_julija_skopeca.practical_tasks.lesson_11.level_1.task_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ListDublicateElements {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(1);

        for(Integer number : numbers){
            System.out.println(numbers);
        }

        List<String> text = new LinkedList<>();
        text.add("A");
        text.add("A");

        for(String words : text){
            System.out.println(words);
        }

    }

}
