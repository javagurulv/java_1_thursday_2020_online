package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_1.task_5;

import java.util.ArrayList;
import java.util.List;

class BookListContainsDemo {

    private static List<Book> books = new ArrayList<>();

    public static void main(String[] args) {

        books.add(new Book("J. K. Rowling", "Harry Potter"));
        books.add(new Book("J. K. Rowling", "Harry Potter. Second Part"));
        books.add(new Book("Robert Martin", "Clean Code"));

        boolean isContainingBook = books.contains(new Book("Robert Martin", "Clean Code"));

        System.out.println(isContainingBook);
    }

}
