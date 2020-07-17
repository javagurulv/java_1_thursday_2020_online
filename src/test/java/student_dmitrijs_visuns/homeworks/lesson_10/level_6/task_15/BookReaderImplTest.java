package student_dmitrijs_visuns.homeworks.lesson_10.level_6.task_15;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookReaderImplTest {

    @Test
    public void DetectingBlankAuthorField () {
        BookReaderImpl prototype = new BookReaderImpl();
        Book book1 = new Book(" ", "Aladdin");
        assertFalse(prototype.addBookToLibrary(book1));
    }

    @Test
    public void DetectingBlankTitleField () {
        BookReaderImpl prototype = new BookReaderImpl();
        Book book1 = new Book("Mark Twain", "     ");
        assertFalse(prototype.addBookToLibrary(book1));
    }

}