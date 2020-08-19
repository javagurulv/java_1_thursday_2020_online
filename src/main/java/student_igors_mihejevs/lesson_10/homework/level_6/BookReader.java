package student_igors_mihejevs.lesson_10.homework.level_6;

import java.util.List;

interface BookReader {

    boolean addBook (Book book);

    boolean removeBook (Book book);

    boolean MarkBookAsAlreadyRead (Book book);

    boolean MarkBookAsNotRead (Book book);

    String[] listOfAllBooks ();

    String[] listOfAllReadBooks ();

    List<Book> listByAuthorOrContainsPartOfAuthorName (String author);

    List<Book> listByTitleOrContainsPartOfTitle (String title);

}
