package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_3.task_22;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {

    BookDatabaseImpl testList = new BookDatabaseImpl();
    Book book1 = new Book("author1", "title1", "2009");
    Book book2 = new Book("author1", "title2", "2010");
    Book book3 = new Book("author3", "title3", "2011");
    Book book4 = new Book("author4", "title4", "2012");
    Book book5 = new Book("author5", "title5", "2013");

    @Before
    public void createList() {
        testList.save(book1);
        testList.save(book2);
        testList.save(book3);
        testList.save(book4);
        testList.save(book5);
    }

    @Test
    public void shouldFindFirstBook() {
        SearchCriteria criteria = new AuthorSearchCriteria("author1");
        List<Book> resultList = testList.find(criteria);
        int actual = resultList.size();
        assertEquals(2, actual);
    }

    @Test
    public void shouldFindSecondBook() {
        SearchCriteria criteria = new TitleSearchCriteria("title2");
        List<Book> resultList = testList.find(criteria);
        int actual = resultList.size();
        assertEquals(1, actual);
    }

    @Test
    public void shouldFindThirdBook() {
        SearchCriteria criteria = new OrSearchCriteria(new TitleSearchCriteria("title3"), new AuthorSearchCriteria("author6"));
        List<Book> resultList = testList.find(criteria);
        int actual = resultList.size();
        assertEquals(1, actual);
    }

    @Test
    public void shouldFindFourthBook() {
        SearchCriteria criteria = new OrSearchCriteria(new TitleSearchCriteria("title7"), new AuthorSearchCriteria("author3"));
        List<Book> resultList = testList.find(criteria);
        int actual = resultList.size();
        assertEquals(1, actual);
    }

    @Test
    public void shouldFindFifthBook() {
        SearchCriteria criteria = new AndSearchCriteria(new TitleSearchCriteria("title3"), new AuthorSearchCriteria("author3"));
        List<Book> resultList = testList.find(criteria);
        int actual = resultList.size();
        assertEquals(1, actual);
    }

}