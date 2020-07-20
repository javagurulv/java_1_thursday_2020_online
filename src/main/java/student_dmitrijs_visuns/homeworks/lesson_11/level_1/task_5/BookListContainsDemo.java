package student_dmitrijs_visuns.homeworks.lesson_11.level_1.task_5;

import java.util.ArrayList;
import java.util.List;

public class BookListContainsDemo {

    List<Book> bookList = new ArrayList<>();

    boolean isInTheList (Book book) {
        return (bookList.contains(book));
    }


    public static void main(String[] args) {

        BookListContainsDemo demo = new BookListContainsDemo();
        Book book1 = new Book ("Jack", "White Fang");
        demo.bookList.add(book1);
        System.out.println("Does list contain book " + book1.getTitle() + " by "
                + book1.getAuthor() + " : " + demo.isInTheList(book1));


    }

}
