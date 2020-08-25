package student_igors_mihejevs.lesson_11.homework.level_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {

    @Test
    public void shouldReturnCorrectIdAndAddBookToDatabase() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Long id1 = Long.parseLong("2");
        Long id2 = Long.parseLong("3");
        assertEquals(id1, bookDatabase.save(new Book("Kathy Sierra, Bert Bates", "Head First Java")));
        assertEquals(id2, bookDatabase.save(new Book("Joshua Bloch", "Effective Java")));
    }

    @Test
    public void shouldReturnTrueIfBookCorrectlyDeletedByID() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Long id1 = Long.parseLong("1");
        Long id2 = Long.parseLong("2");
        bookDatabase.save(new Book("Kathy Sierra, Bert Bates", "Head First Java"));
        bookDatabase.save(new Book("Joshua Bloch", "Effective Java"));
        assertTrue(bookDatabase.delete(id1));
        assertTrue(bookDatabase.delete(id2));
    }

    @Test
    public void shouldReturnTrueIfBookCorrectlyDeletedByBookNameAndAuthor() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = (new Book("Kathy Sierra, Bert Bates", "Head First Java"));
        Book book2 = (new Book("Joshua Bloch", "Effective Java"));
        Book book3 = (new Book("Joshua    Bloch", "Effective Java"));
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        assertTrue(bookDatabase.delete(book1));
        assertTrue(bookDatabase.delete(book2));
        assertFalse(bookDatabase.delete(book3));
    }

}