package student_vadims_vladisevs.lesson_11.level_2.task_14;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {

    @Test
    public void deleteByTitleV1() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades");
        Book secondBook = new Book("William Golding", "Lord of the Flies");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club");
        Book fifthBook = new Book("Erich Maria Remarque", "Three Comrades");

        bookDatabase.save(firstBook);
        bookDatabase.save(secondBook);
        bookDatabase.save(thirdBook);
        bookDatabase.save(fourthBook);
        bookDatabase.save(fifthBook);

        bookDatabase.deleteByTitle("Three Comrades");

        assertEquals(3, bookDatabase.books.size());
    }

    @Test
    public void deleteByTitleV2() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades");
        Book secondBook = new Book("William Golding", "Lord of the Flies");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club");
        Book fifthBook = new Book("Erich Maria Remarque", "Three Comrades");

        bookDatabase.save(firstBook);
        bookDatabase.save(secondBook);
        bookDatabase.save(thirdBook);
        bookDatabase.save(fourthBook);
        bookDatabase.save(fifthBook);

        bookDatabase.deleteByTitle("Lord of the Flies");

        assertEquals(4, bookDatabase.books.size());
    }
}