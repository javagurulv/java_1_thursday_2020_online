package student_aleksey_kodin.lesson10.level6.task_25;

import java.util.List;

interface BookReader {

    boolean addBook(Book book);

    boolean deleteBook(Book book);

    String[] createBookList();

    List<Book> searchForBooksByAuthor(String authorName);

    List<Book> searchForBooksByTitle(String bookTitle);

    boolean finishedBooks(Book book);

    boolean unreadBooks(Book book);

    String[] createFinishedBookList();

    String[] createUnreadBookList();
}
