package student_aleksey_kodin.lesson10.level6.task_22;

import java.util.List;

interface BookReader {

    boolean addBook(Book book);

    boolean deleteBook(Book book);

    String[] createBookList();

    List<Book> searchForBooksByAuthor(String authorName);

    List<Book> searchForBooksByTitle(String bookTitle);

    boolean finishedBooks(Book book);
}
