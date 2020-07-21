package student_dmitrijs_visuns.homeworks.lesson_11.level_2.task_11;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BookDataBaseImplTest {

    @Test
    public void TestForFindingBooksWithThatTitle (){
        BookDataBaseImpl prototype = new BookDataBaseImpl();
        Book book1 = new Book("Peter", "Jurassic Park");
        Book book2 = new Book("Sally", "B");
        Book book3 = new Book("Jack", "Jurassic Park");
        prototype.save(book1);
        prototype.save(book2);
        prototype.save(book3);
        List<Book> testList = new ArrayList<>(prototype.findByTitle("Jurassic Park"));

        assertTrue(testList.get(0).equals(book1));
        assertTrue(testList.get(1).equals(book3));
        assertTrue(testList.size() == 2);
    }

    @Test
    public void TestIfNoBooksWithThatTitle (){
        BookDataBaseImpl prototype = new BookDataBaseImpl();
        Book book1 = new Book("Jack", "A");
        Book book2 = new Book("Sally", "B");
        Book book3 = new Book("Jack", "C");
        prototype.save(book1);
        prototype.save(book2);
        prototype.save(book3);
        List<Book> testList = new ArrayList<>(prototype.findByTitle("Alien"));

        assertTrue(testList.size() == 0);
    }

}