package student_julija_skopeca.practical_tasks.lesson_10.level_6.task_14;

import java.util.ArrayList;

interface BookReader {

    boolean Add(Book book);

    boolean Delete(Book book);

    String PrintBookDatabase();

    ArrayList<Book> getByAuthor(String author);

    ArrayList<Book> getByAuthorName(String author);




}

