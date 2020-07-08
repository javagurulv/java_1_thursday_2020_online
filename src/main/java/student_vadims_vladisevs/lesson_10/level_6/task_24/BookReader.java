package student_vadims_vladisevs.lesson_10.level_6.task_24;

import java.util.ArrayList;

interface BookReader {
    boolean addBookToLibrary(Book book, Library library);
    boolean removeBookFromLibrary(Book book, Library library);
    String[] listOfBook(Library library);
    ArrayList<Book> findByAuthor(String author, Library library);
    ArrayList<Book> findByTitle(String title, Library library);
    boolean completedRead(Book book, Library library);
    boolean notCompletedRead(Book book, Library library);
    String[] listOfCompletedBooks(Library library);
}
