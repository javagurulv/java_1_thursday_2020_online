package student_dmitrijs_visuns.homeworks.lesson_10.level_6.task_25;

import java.util.List;

interface BookReader {

    boolean addBookToLibrary (Book book);

    boolean removeBookFromLibrary (Book book);

    boolean markBookAsRead (Book book);

    boolean markBookAsNotRead (Book book);

    String [] getBooksListFromLibrary ();

    String [] getReadBooksListFromLibrary ();

    String[] getNotReadBooksListFromLibrary ();

    List <Book> findBooksByAuthorName (String authorName);

    List <Book> findBookByExactAuthorName (String exactAuthorName);

    List <Book> findBooksByTitle (String bookTitle);

    List <Book> findBookByExactTitle (String exactBookTitle);






}
