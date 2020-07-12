package student_vadims_vladisevs.lesson_11.level_2.task_6;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {

    @Test
    public void saveV1() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades");
        Book secondBook = new Book("William Golding", "Lord of the Flies");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club");
        Book fifthBook = new Book("Kurt Vonnegut", "Cat`s Gradle");

        long actual = bookDatabase.save(firstBook);
        bookDatabase.save(secondBook);
        bookDatabase.save(thirdBook);
        bookDatabase.save(fourthBook);
        bookDatabase.save(fifthBook);

        assertEquals(1,actual);
    }

    @Test
    public void saveV2() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades");
        Book secondBook = new Book("William Golding", "Lord of the Flies");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club");
        Book fifthBook = new Book("Kurt Vonnegut", "Cat`s Gradle");

        bookDatabase.save(firstBook);
        bookDatabase.save(secondBook);
        long actual = bookDatabase.save(thirdBook);
        bookDatabase.save(fourthBook);
        bookDatabase.save(fifthBook);

        assertEquals(3,actual);
    }

    @Test
    public void saveV3() {
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
        long actual = bookDatabase.save(fifthBook);

        assertEquals(5,actual);
    }

    @Test
    public void saveV4() {
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

        assertEquals(5,bookDatabase.books.size());
    }
}