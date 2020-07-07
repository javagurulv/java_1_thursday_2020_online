package student_aleksey_kodin.lesson11.level2.task_6;

import org.junit.Test;
import static org.junit.Assert.*;

public class BookDatabaseImplTest {
    BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
    Book book_1 = new Book("Author#1","Name#1");
    Book book_2 = new Book("Author#2","Name#2");
    Book book_3 = new Book("Author#3","Name#3");

    @Test
    public void save_1() {
        long result = bookDatabase.save(book_1);
        assertEquals(1,result);
    }

    @Test
    public void save_2() {
        bookDatabase.save(book_2);
        long result = bookDatabase.save(book_2);
        assertEquals(2,result);
    }

    @Test
    public void save_3() {
        bookDatabase.save(book_1);
        bookDatabase.save(book_2);
        long result = bookDatabase.save(book_3);
        assertEquals(3,result);
    }
}