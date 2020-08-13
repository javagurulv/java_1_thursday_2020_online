package student_alexander_bogachenkov.lesson10_02072020.homeworks.level_6.task_19;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void shouldReturnFirstFourLettersFromString() {
        Book book = new Book("Children of Captain Grant", "Jules Verne");
        char[] actualArray = book.getFirstFourAuthorLetters();
        char[] expectedArray = {'j', 'u', 'l', 'e'};
        assertArrayEquals(expectedArray, actualArray);
    }

}