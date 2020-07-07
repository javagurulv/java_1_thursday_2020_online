package student_aleksey_kodin.lesson11.level2.task_12;

import org.junit.Test;
import static org.junit.Assert.*;

public class BookDatabaseImplTest {
    BookDatabaseImpl demo = new BookDatabaseImpl();
    Book book_1 = new Book("Author#1", "Book#1");
    Book book_2 = new Book("Author#2", "Book#2");
    Book book_3 = new Book("Author#3", "Book#3");
    Book book_4 = new Book("Author#4", "Book#4");


    @Test
    public void countAllBooks_1() {
        int result = demo.countAllBooks();
        assertEquals(0,result);
    }

    @Test
    public void countAllBooks_2() {
        demo.save(book_1);
        int result = demo.countAllBooks();
        assertEquals(1,result);
    }

    @Test
    public void countAllBooks_3() {
        demo.save(book_1);
        demo.save(book_2);
        int result = demo.countAllBooks();
        assertEquals(2,result);
    }

    @Test
    public void countAllBooks_4() {
        demo.save(book_1);
        demo.save(book_2);
        demo.save(book_3);
        int result = demo.countAllBooks();
        assertEquals(3,result);
    }

    @Test
    public void countAllBooks_5() {
        demo.save(book_1);
        demo.save(book_2);
        demo.save(book_3);
        demo.save(book_4);
        int result = demo.countAllBooks();
        assertEquals(4,result);
    }
}