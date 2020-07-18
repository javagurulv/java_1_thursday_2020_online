package student_dmitrijs_visuns.homeworks.lesson_10.level_6.task_17;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookReaderImplTest {

    @Test
    public void CheckIfBooksListIsCorrect () {
        BookReaderImpl prototype = new BookReaderImpl();
        Book book1 = new Book ("Heinlein", "Tunnel");
        Book book2 = new Book ("Walt Disney", "Duck Tales");
        prototype.addBookToLibrary(book1);
        prototype.addBookToLibrary(book2);
        String [] testBooksList = prototype.getBooksListFromLibrary();
        assertTrue(testBooksList[0].equals("Tunnel [Heinlein]")
                && (testBooksList[1].equals("Duck Tales [Walt Disney]")));
    }

}