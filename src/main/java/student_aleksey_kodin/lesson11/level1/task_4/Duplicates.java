package student_aleksey_kodin.lesson11.level1.task_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Duplicates {
    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println("[Array List]");
        demo.createList();
        System.out.println("[Linked List]");
        demo.createLinkedList();
    }
}

class Demo {
    private final List<String> myList = new ArrayList<>();
    private final LinkedList<String> myLinkedList = new LinkedList<>();

    void createList() {
        myList.add("one");
        myList.add("one");
        myList.add("two");
        myList.add("two");
        myList.add("three");
        myList.add("three");

        myList.forEach(System.out::println);
    }

    void createLinkedList() {
        myLinkedList.add("one");
        myLinkedList.add("one");
        myLinkedList.add("two");
        myLinkedList.add("two");
        myLinkedList.add("three");
        myLinkedList.add("three");

        myLinkedList.forEach(System.out::println);
    }
}
