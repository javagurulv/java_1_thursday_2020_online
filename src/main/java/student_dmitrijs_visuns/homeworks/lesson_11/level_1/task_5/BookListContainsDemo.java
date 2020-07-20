package student_dmitrijs_visuns.homeworks.lesson_11.level_1.task_5;

import java.util.ArrayList;
import java.util.List;

public class BookListContainsDemo {

    public static void main(String[] args) {

       List<Book> bookList = new ArrayList<>();

       Book book1 = new Book ("Jack", "White Fang");
       Book book2 = new Book ("Fack", "White Tang");
       bookList.add(book1);

       System.out.println("Does bookList contain book1: " + bookList.contains(book1));
       System.out.println("Does bookList contain book2: " + bookList.contains(book2));


    }

}
