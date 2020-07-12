package student_aleksey_kodin.lesson10.level6.task_18;

import java.util.List;

interface BookReader {

    boolean addBook(Book book);

    boolean deleteBook(Book book);

    String[] createBookList();

    // findByAuthor(...)
    List<Book> searchForBooksByAuthor(String authorName);
}
