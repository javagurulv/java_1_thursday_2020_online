package student_alexander_bogachenkov.lesson10_02072020.homeworks.level_6.task_19;

import java.util.List;

interface BookReader {

    boolean addBook(Book book);

    boolean deleteBook(Book book);

    String[] getAllBooks();

    List<Book> findBooksByAuthor(String author);

}
