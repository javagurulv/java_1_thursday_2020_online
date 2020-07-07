package student_aleksey_kodin.lesson11.level3.task_22;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {
    BookDatabaseImpl demo = new BookDatabaseImpl();
    Book book_1 = new Book("Author#1", "Title#1", "2015");
    Book book_2 = new Book("Author#2", "Title#2", "2016");
    Book book_3 = new Book("Author#3", "Title#3", "2017");
    Book book_4 = new Book("Author#4", "Title#4", "2015");
    Book book_5 = new Book("Author#1", "Title#5", "2000");

    @Before
    public void createList() {
        demo.save(book_1);
        demo.save(book_2);
        demo.save(book_3);
        demo.save(book_4);
        demo.save(book_5);
    }

    @Test
    public void find_1() {
        SearchCriteria searchCriteria = new YearOfIssueSearchCriteria("2015");
        List<Book> result = demo.find(searchCriteria);

        int size = result.size();

        assertEquals(2, size);
    }

    @Test
    public void find_2() {
        SearchCriteria searchCriteria = new AuthorSearchCriteria("Author#1");
        List<Book> result = demo.find(searchCriteria);

        int size = result.size();

        assertEquals(2, size);
    }

    @Test
    public void find_3() {
        SearchCriteria searchCriteria = new TitleSearchCriteria("Title#3");
        List<Book> result = demo.find(searchCriteria);

        int size = result.size();

        assertEquals(1, size);
    }

    @Test
    public void find_4() {
        SearchCriteria searchCriteria = new AndSearchCriteria(new AuthorSearchCriteria("Author#1"),
                new TitleSearchCriteria("Title#5"));
        List<Book> result = demo.find(searchCriteria);

        int size = result.size();

        assertEquals(1, size);
    }

    @Test
    public void find_5() {
        SearchCriteria searchCriteria = new OrSearchCriteria(new AuthorSearchCriteria("Author#1"),
                new TitleSearchCriteria("Title#5"));
        List<Book> result = demo.find(searchCriteria);

        int size = result.size();

        assertEquals(2, size);
    }

    @Test
    public void find_6() {
        SearchCriteria searchCriteria = new OrSearchCriteria(new TitleSearchCriteria("Title#1"),
                new YearOfIssueSearchCriteria("2015"));
        List<Book> result = demo.find(searchCriteria);

        int size = result.size();

        assertEquals(2, size);
    }
}