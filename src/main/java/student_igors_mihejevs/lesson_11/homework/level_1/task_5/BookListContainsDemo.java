package student_igors_mihejevs.lesson_11.homework.level_1.task_5;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BookListContainsDemo {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Kathy Sierra, Bert Bates", "Head First Java"));
        books.add(new Book("Robert C. Martin", "Clean Code"));
        books.add(new Book("Kathy Sierra, Bert Bates", "Head First Java"));
        books.add(new Book("Joshua Bloch", "Effective Java"));

        System.out.println("Contains one book (Joshua Bloch Effective Java) : " +
                books.contains(new Book("Joshua Bloch", "Effective Java")));

        List<Book> containsBooks = new ArrayList<>();
        containsBooks.add(new Book("Joshua Bloch", "Effective Java"));
        containsBooks.add(new Book("Robert C. Martin", "Clean Code"));

        System.out.println("Contains two books (Effective Java, Clean Code) : " + books.containsAll(containsBooks));
    }

}
