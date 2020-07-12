package student_vadims_vladisevs.lesson_11.level_2.task_7;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {

    @Test
    public void deleteV1() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades");
        Book secondBook = new Book("William Golding", "Lord of the Flies");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club");
        Book fifthBook = new Book("Kurt Vonnegut", "Cat`s Gradle");

        bookDatabase.save(firstBook);
        bookDatabase.save(secondBook);
        bookDatabase.save(thirdBook);
        bookDatabase.save(fourthBook);
        bookDatabase.save(fifthBook);
        boolean actual = bookDatabase.delete(1L);

        assertTrue(actual);
    }

    @Test
    public void deleteV2() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades");
        Book secondBook = new Book("William Golding", "Lord of the Flies");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club");
        Book fifthBook = new Book("Kurt Vonnegut", "Cat`s Gradle");

        bookDatabase.save(firstBook);
        bookDatabase.save(secondBook);
        bookDatabase.save(thirdBook);
        bookDatabase.save(fourthBook);
        bookDatabase.save(fifthBook);
        boolean actual = bookDatabase.delete(3L);

        assertTrue(actual);
    }

    @Test
    public void deleteV3() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades");
        Book secondBook = new Book("William Golding", "Lord of the Flies");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club");
        Book fifthBook = new Book("Kurt Vonnegut", "Cat`s Gradle");

        bookDatabase.save(firstBook);
        bookDatabase.save(secondBook);
        bookDatabase.save(thirdBook);
        bookDatabase.save(fourthBook);
        boolean actual = bookDatabase.delete(5L);

        assertFalse(actual);
    }

    @Test
    public void deleteV4() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades");
        Book secondBook = new Book("William Golding", "Lord of the Flies");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club");
        Book fifthBook = new Book("Kurt Vonnegut", "Cat`s Gradle");

        bookDatabase.save(firstBook);
        bookDatabase.save(secondBook);
        bookDatabase.save(thirdBook);
        bookDatabase.save(fourthBook);
        bookDatabase.delete(1L);
        bookDatabase.delete(2L);

        assertEquals(2, bookDatabase.books.size());
    }
}
