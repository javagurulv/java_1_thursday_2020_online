package student_vadims_vladisevs.lesson_10.level_6.task_20;

import java.util.ArrayList;

interface BookReader {
    boolean addBookToLibrary(Book book, Library library);
    boolean removeBookFromLibrary(Book book, Library library);
    String[] listOfBook(Library library);
    ArrayList<Book> findByAuthor(String author, Library library);
    ArrayList<Book> findByTitle(String title, Library library);
}
