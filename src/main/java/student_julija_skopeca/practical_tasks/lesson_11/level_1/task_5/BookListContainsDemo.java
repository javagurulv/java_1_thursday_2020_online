package student_julija_skopeca.practical_tasks.lesson_11.level_1.task_5;

import java.util.LinkedList;
import java.util.List;

class BookListContainsDemo {

    private static List<Book> book = new LinkedList<>();

    public static void main(String[] args) {

        book.add(new Book("Author", "Title1"));
        book.add(new Book("Author", "Title2"));

        boolean ifContainABook = book.contains(new Book("Author", "Title1"));
        System.out.println(ifContainABook);

        boolean ifContainABook1 = book.contains(new Book("Author", "Title"));
        System.out.println(ifContainABook1);


    }
}
