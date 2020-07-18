package student_alexander_bogachenkov.lesson10_02072020.homeworks.level_6.task_21;

import java.util.List;

interface BookReader {

    boolean addBook(Book book);

    boolean deleteBook(Book book);

    String[] getAllBooks();

    List<Book> findBooksByTitle(String title);

    List<Book> findBooksByAuthor(String author);

}
