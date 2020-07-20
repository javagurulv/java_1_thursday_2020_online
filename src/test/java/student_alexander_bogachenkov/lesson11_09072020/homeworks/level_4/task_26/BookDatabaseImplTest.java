package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_4.task_26;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {

    @Test
    public void shouldReturnTrue_whenListContainsBook() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        database.save(new Book("J. K. Rowling", "Harry Potter", "2009"));
        database.save(new Book("Robert Martin", "Clean Code", "2009"));
        database.save(new Book("Bruce Eckel", "Thinking in JAVA", "2009"));
        boolean actual = database.contains(new Book("Robert Martin", "Clean Code", "2009"));
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFalse_whenListDoesNotContainSameBook() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        database.save(new Book("J. K. Rowling", "Harry Potter", "2009"));
        database.save(new Book("Robert Martin", "Clean Code", "2009"));
        database.save(new Book("Bruce Eckel", "Thinking in JAVA", "2009"));
        boolean actual = database.contains(new Book("Robert Martin", "Clear Code", "2015"));
        boolean expected = false;
        assertEquals(expected, actual);
    }
}