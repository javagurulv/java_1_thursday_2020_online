package student_dmitrijs_visuns.homeworks.lesson_11.level_2.task_10;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BookDataBaseImplTest {

    @Test
    public void TestForFindingAuthorBooks (){
        BookDataBaseImpl prototype = new BookDataBaseImpl();
        Book book1 = new Book("Jack", "A");
        Book book2 = new Book("Sally", "B");
        Book book3 = new Book("Jack", "C");
        prototype.save(book1);
        prototype.save(book2);
        prototype.save(book3);
        List<Book> testList = new ArrayList<>(prototype.findByAuthor("Jack"));

        assertTrue(testList.get(0).equals(book1));
        assertTrue(testList.get(1).equals(book3));
        assertTrue(testList.size() == 2);
    }

    @Test
    public void TestIfTheresNoAuthorBooks (){
        BookDataBaseImpl prototype = new BookDataBaseImpl();
        Book book1 = new Book("Jack", "A");
        Book book2 = new Book("Sally", "B");
        Book book3 = new Book("Jack", "C");
        prototype.save(book1);
        prototype.save(book2);
        prototype.save(book3);
        List<Book> testList = new ArrayList<>(prototype.findByAuthor("Connor"));

       assertTrue(testList.size() == 0);
    }

}