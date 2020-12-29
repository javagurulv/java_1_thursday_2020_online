package student_igors_mihejevs.lesson_11.homework.level_4;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class BookDatabaseImplTest {

    BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

    @Test
    public void shouldReturnCorrectIdAndAddBookToDatabase() {
        Long id1 = Long.parseLong("2");
        Long id2 = Long.parseLong("3");
        assertEquals(id1, bookDatabase.save(new Book("Kathy Sierra, Bert Bates", "Head First Java", "2003")));
        assertEquals(id2, bookDatabase.save(new Book("Joshua Bloch", "Effective Java", "2001")));
    }

    @Test
    public void shouldReturnTrueIfBookCorrectlyDeletedByID() {
        bookDatabase.save(new Book("Kathy Sierra, Bert Bates", "Head First Java", "2003"));
        bookDatabase.save(new Book("Joshua Bloch", "Effective Java", "2001"));
        assertTrue(bookDatabase.delete(Long.parseLong("1")));
        assertTrue(bookDatabase.delete(Long.parseLong("2")));
    }

    @Test
    public void shouldReturnTrueIfBookCorrectlyDeletedByBookNameAndAuthor() {
        Book book1 = (new Book("Kathy Sierra, Bert Bates", "Head First Java", "2003"));
        Book book2 = (new Book("Joshua Bloch", "Effective Java", "2001"));
        Book book3 = (new Book("Not Joshua Bloch", "Effective Java", "2001"));
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        assertTrue(bookDatabase.delete(book1));
        assertTrue(bookDatabase.delete(book2));
        assertFalse(bookDatabase.delete(book3));
    }

    @Test
    public void shouldReturnOptionalOfOrEmptyByBookID() {
        bookDatabase.save(new Book("Kathy Sierra, Bert Bates", "Head First Java", "2003"));
        bookDatabase.save(new Book("Joshua Bloch", "Effective Java", "2001"));
        assertEquals(Optional.empty(), bookDatabase.findById(Long.parseLong("3")));
        assertNotEquals(Optional.empty(), bookDatabase.findById(Long.parseLong("1")));
        assertNotEquals(null, bookDatabase.findById(Long.parseLong("2")));
    }

    @Test
    public void shouldReturnListOfBookByAuthor() {
        bookDatabase.save(new Book("Kathy Sierra, Bert Bates", "Head First Java", "2003"));
        bookDatabase.save(new Book("Joshua Bloch", "Effective Java", "2001"));
        List<Book> listOfBookByAuthors = bookDatabase.findByAuthor("Joshua Bloch");
        assertEquals("Joshua Bloch", listOfBookByAuthors.get(0).getAuthor());
    }

    @Test
    public void shouldReturnListOfBookByTitle() {
        bookDatabase.save(new Book("Kathy Sierra, Bert Bates", "Head First Java", "2003"));
        bookDatabase.save(new Book("Joshua Bloch", "Effective Java", "2001"));
        List<Book> listOfBookByTitle = bookDatabase.findByTitle("Effective Java");
        assertEquals("Effective Java", listOfBookByTitle.get(0).getTitle());
    }

    @Test
    public void shouldReturnNumberOfBooks() {
        Book book1 = (new Book("Kathy Sierra, Bert Bates", "Head First Java", "2003"));
        Book book2 = (new Book("Joshua Bloch", "Effective Java", "2001"));
        Book book3 = (new Book("Robert C. Martin", "Clean Code", "2008"));
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
        Book book1 = (new Book("Kathy Sierra, Bert Bates", "Head First Java", "2003"));
        Book book2 = (new Book("Joshua Bloch", "Effective Java", "2001"));
        Book book3 = (new Book("Robert C. Martin", "Clean Code", "2008"));
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
        Book book1 = (new Book("Kathy Sierra, Bert Bates", "Head First Java", "2003"));
        Book book2 = (new Book("Joshua Bloch", "Effective Java", "2001"));
        Book book3 = (new Book("Robert C. Martin", "Clean Code", "2008"));
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        assertEquals(3, bookDatabase.countAllBooks());
        assertNotEquals(Optional.empty(), bookDatabase.findById(Long.parseLong("2")));
        bookDatabase.deleteByTitle("Effective Java");
        assertEquals(Optional.empty(), bookDatabase.findById(Long.parseLong("2")));
        assertEquals(2, bookDatabase.countAllBooks());
    }

    @Test
    public void shouldReturnListOfBookBySearchCriteria() {
        bookDatabase.save(new Book("Kathy Sierra, Bert Bates", "Head First Java", "2003"));
        bookDatabase.save(new Book("Joshua Bloch", "Effective Java", "2001"));

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Joshua Bloch");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Effective Java");
        SearchCriteria searchCriteria1 = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);

        List<Book> listOfBookBySearchCriteria = bookDatabase.find(searchCriteria1);

        assertEquals("Effective Java", listOfBookBySearchCriteria.get(0).getTitle());
        assertEquals("Joshua Bloch", listOfBookBySearchCriteria.get(0).getAuthor());
    }

    @Test
    public void shouldReturnSetOfUniqueAuthors() {
        bookDatabase.save(new Book("Kathy Sierra, Bert Bates", "Head First Java", "2003"));
        bookDatabase.save(new Book("Joshua Bloch", "Effective Java", "2001"));
        bookDatabase.save(new Book("Joshua Bloch", "Effective Java", "2001"));
        bookDatabase.save(new Book("Kathy Sierra, Bert Bates", "Head First Java", "2003"));

        int counter = 0;
        for (String author : bookDatabase.findUniqueAuthors()) {
            if ((author.equals("Kathy Sierra, Bert Bates")) || (author.equals("Joshua Bloch"))) counter++;
        }
        assertEquals(2, counter);
    }

    @Test
    public void shouldReturnSetOfUniqueTitles() {
        bookDatabase.save(new Book("Kathy Sierra, Bert Bates", "Head First Java", "2003"));
        bookDatabase.save(new Book("Joshua Bloch", "Effective Java", "2001"));
        bookDatabase.save(new Book("Joshua Bloch", "Effective Java", "2001"));
        bookDatabase.save(new Book("Kathy Sierra, Bert Bates", "Head First Java", "2003"));

        int counter = 0;
        for (String title : bookDatabase.findUniqueTitles()) {
            if ((title.equals("Head First Java")) || (title.equals("Effective Java"))) {
                counter++;
            }
        }
        assertEquals(2, counter);
    }

    @Test
    public void shouldNotReturnUniqueBooksBecauseSetIsEmpty() {
        Set<Book> actual = bookDatabase.findUniqueBooks();
        Set<Book> expected = new HashSet<>();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnSetOfUniqueBooks() {
        Book book1 = new Book("Kathy Sierra, Bert Bates", "Head First Java", "2003");
        Book book2 = new Book("Joshua Bloch", "Effective Java", "2001");
        Book book3 = new Book("Robert C. Martin", "Clean Code", "2008");
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book2);
        bookDatabase.save(book1);
        Set<Book> foundBooks = bookDatabase.findUniqueBooks();
        assertEquals(3, foundBooks.size());
    }

    @Test
    public void shouldReturnTrueIfBookAlreadyInDatabase() {
        bookDatabase.save(new Book("Kathy Sierra, Bert Bates", "Head First Java", "2003"));
        bookDatabase.save(new Book("Joshua Bloch", "Effective Java", "2001"));
        bookDatabase.save(new Book("Robert C. Martin", "Clean Code", "2008"));
        Book bookForTest = new Book("Joshua Bloch", "Effective Java", "2001");
        assertTrue(bookDatabase.contains(bookForTest));
    }

}