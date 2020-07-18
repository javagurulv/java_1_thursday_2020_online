package student_dmitrijs_visuns.homeworks.lesson_10.level_6.task_18;

import java.util.List;

interface BookReader {

    boolean addBookToLibrary (Book book);

    boolean removeBookFromLibrary (Book book);

    String [] getBooksListFromLibrary ();

    List <Book> findBookByExactAuthorName (String exactAuthorName);


}
