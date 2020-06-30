package student_aleksey_kodin.lesson10.level6.task_17;

import java.util.List;

interface BookReader {

    boolean addBook(Book book);

    boolean deleteBook(Book book);

    String[] createBookList();
}
