package student_igors_mihejevs.lesson_11.homework.level_2;

import org.junit.Test;
import java.util.List;
import java.util.Optional;
import static org.junit.Assert.*;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
public class BookDatabaseImplTest {

    BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

    @Test
    public void shouldReturnCorrectIdAndAddBookToDatabase() {
        @CodeReviewComment(teacher = "BookDatabase bookDatabase = new BookDatabaseImpl();")
        Long id1 = Long.parseLong("2");
        Long id2 = Long.parseLong("3");
        assertEquals(id1, bookDatabase.save(new Book("Kathy Sierra, Bert Bates", "Head First Java")));
        assertEquals(id2, bookDatabase.save(new Book("Joshua Bloch", "Effective Java")));
    }

    @Test
    public void shouldReturnTrueIfBookCorrectlyDeletedByID() {
        bookDatabase.save(new Book("Kathy Sierra, Bert Bates", "Head First Java"));
        bookDatabase.save(new Book("Joshua Bloch", "Effective Java"));
        assertTrue(bookDatabase.delete(Long.parseLong("1")));
        assertTrue(bookDatabase.delete(Long.parseLong("2")));
    }

    @Test
    public void shouldReturnTrueIfBookCorrectlyDeletedByBookNameAndAuthor() {
        Book book1 = (new Book("Kathy Sierra, Bert Bates", "Head First Java"));
        Book book2 = (new Book("Joshua Bloch", "Effective Java"));
        Book book3 = (new Book("Joshua    Bloch", "Effective Java"));
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        assertTrue(bookDatabase.delete(book1));
        assertTrue(bookDatabase.delete(book2));
        assertFalse(bookDatabase.delete(book3));
    }

    @Test
    public void shouldReturnOptionalOfOrEmptyByBookID() {
        bookDatabase.save(new Book("Kathy Sierra, Bert Bates", "Head First Java"));
        bookDatabase.save(new Book("Joshua Bloch", "Effective Java"));
        assertEquals(Optional.empty(), bookDatabase.findById(Long.parseLong("3")));
        assertNotEquals(Optional.empty(), bookDatabase.findById(Long.parseLong("1")));
        assertNotEquals(null, bookDatabase.findById(Long.parseLong("2")));
    }

    @Test
    public void shouldReturnListOfBookByAuthor() {
        bookDatabase.save(new Book("Kathy Sierra, Bert Bates", "Head First Java"));
        bookDatabase.save(new Book("Joshua Bloch", "Effective Java"));
        List<Book> listOfBookByAuthors = bookDatabase.findByAuthor("Joshua Bloch");
        assertEquals("Joshua Bloch", listOfBookByAuthors.get(0).getAuthor());
    }

    @Test
    public void shouldReturnListOfBookByTitle() {
        bookDatabase.save(new Book("Kathy Sierra, Bert Bates", "Head First Java"));
        bookDatabase.save(new Book("Joshua Bloch", "Effective Java"));
        List<Book> listOfBookByTitle = bookDatabase.findByTitle("Effective Java");
        assertEquals("Effective Java", listOfBookByTitle.get(0).getTitle());
    }

    @Test
    public void shouldReturnNumberOfBooks() {
        Book book1 = (new Book("Kathy Sierra, Bert Bates", "Head First Java"));
        Book book2 = (new Book("Joshua Bloch", "Effective Java"));
        Book book3 = (new Book("Robert C. Martin", "Clean Code"));
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        assertEquals(3, bookDatabase.countAllBooks());
        bookDatabase.delete(book1);
        assertEquals(2, bookDatabase.countAllBooks());
        bookDatabase.delete(book2);
        assertEquals(1, bookDatabase.countAllBooks());
    }

    @Test
    public void shouldReturnTrueIfBookCorrectlyDeletedByAuthor() {
        Book book1 = (new Book("Kathy Sierra, Bert Bates", "Head First Java"));
        Book book2 = (new Book("Joshua Bloch", "Effective Java"));
        Book book3 = (new Book("Robert C. Martin", "Clean Code"));
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        assertEquals(3, bookDatabase.countAllBooks());
        assertNotEquals(Optional.empty(), bookDatabase.findById(Long.parseLong("2")));
        bookDatabase.deleteByAuthor("Joshua Bloch");
        assertEquals(Optional.empty(), bookDatabase.findById(Long.parseLong("2")));
        assertEquals(2, bookDatabase.countAllBooks());
    }

    @Test
    public void shouldReturnTrueIfBookCorrectlyDeletedByTitle() {
        Book book1 = (new Book("Kathy Sierra, Bert Bates", "Head First Java"));
        Book book2 = (new Book("Joshua Bloch", "Effective Java"));
        Book book3 = (new Book("Robert C. Martin", "Clean Code"));
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        assertEquals(3, bookDatabase.countAllBooks());
        assertNotEquals(Optional.empty(), bookDatabase.findById(Long.parseLong("2")));
        bookDatabase.deleteByTitle("Effective Java");
        assertEquals(Optional.empty(), bookDatabase.findById(Long.parseLong("2")));
        assertEquals(2, bookDatabase.countAllBooks());
    }

}