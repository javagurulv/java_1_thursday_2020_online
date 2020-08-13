package student_julija_skopeca.practical_tasks.lesson_10.level_6.task_14;

import java.util.ArrayList;

interface BookReader {

    boolean add(Book book);

    boolean delete(Book book);

    String PrintBookDatabase();

    ArrayList<Book> getByAuthor(String author);

    ArrayList<Book> getByAuthorName(String author);

    ArrayList<Book> getByBookTitle(String title);

    ArrayList<Book> getByBookTitleByParts(String title);

    boolean markAsFinished(Book book);

    String[] PrintFinishedBookDatabase();

    String[] PrintUnFinishedBookDatabase();




}

