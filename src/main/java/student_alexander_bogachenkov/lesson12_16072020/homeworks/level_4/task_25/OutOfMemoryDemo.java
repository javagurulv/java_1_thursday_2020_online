package student_alexander_bogachenkov.lesson12_16072020.homeworks.level_4.task_25;

import java.util.ArrayList;
import java.util.List;

class OutOfMemoryDemo {
    private List<String> list = new ArrayList<String>();

    public static void main(String args[]) throws Exception {
        Integer[] array = new Integer[100000 * 100000];
    }
}