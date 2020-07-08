package student_aleksey_kodin.lesson11.level4.task_23;

import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {
    BookDatabaseImpl demo = new BookDatabaseImpl();
    Book book_1 = new Book("Author#1", "Book#1", "2015");
    Book book_2 = new Book("Author#2", "Book#2", "2016");
    Book book_3 = new Book("Author#3", "Book#3", "2017");
    Book book_4 = new Book("Author#4", "Book#4", "2018");
    Book book_5 = new Book("Author#4", "Book#5", "2019");
    Book book_6 = new Book("Author#3", "Book#6", "2020");

    @Before
    public void createList() {
        demo.save(book_1);
        demo.save(book_2);
        demo.save(book_3);
        demo.save(book_4);
        demo.save(book_6);
    }

    @Test
    public void findUniqueAuthors_1() {
        Set<String> authors = demo.findUniqueAuthors();
        int size = authors.size();

        assertEquals(4,size);
    }

    @Test
    public void findUniqueAuthors_2() {
        demo.save(book_5);
        Set<String> authors = demo.findUniqueAuthors();
        int size = authors.size();

        assertEquals(4,size);
    }

    @Test
    public void findUniqueAuthors_3() {
        demo.save(book_5);
        demo.save(book_5);
        Set<String> authors = demo.findUniqueAuthors();
        authors.forEach(System.out::println);
        int size = authors.size();

        assertEquals(4,size);
    }

    @Test
    public void findUniqueAuthors_4() {
        demo.save(book_5);
        demo.save(book_5);
        demo.save(book_6);
        Set<String> authors = demo.findUniqueAuthors();
        authors.forEach(System.out::println);
        int size = authors.size();

        assertEquals(4,size);
    }

    @Test
    public void findUniqueAuthors_5() {
        demo.save(book_5);
        demo.save(book_5);
        demo.save(book_6);
        demo.save(book_6);
        Set<String> authors = demo.findUniqueAuthors();
        authors.forEach(System.out::println);
        int size = authors.size();

        assertEquals(4,size);
    }
}