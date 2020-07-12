package student_vadims_vladisevs.lesson_11.level_3.task_22;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BookDatabaseImplTest {

    @Test
    public void findV1() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades", "1936");
        Book secondBook = new Book("William Golding", "Lord of the Flies", "1954");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy", "1985");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club", "1996");
        Book fifthBook = new Book("Erich Maria Remarque", "Arch of Triumph", "1945");

        bookDatabase.save(firstBook);
        bookDatabase.save(secondBook);
        bookDatabase.save(thirdBook);
        bookDatabase.save(fourthBook);
        bookDatabase.save(fifthBook);

        SearchCriteria searchCriteria = new AuthorSearchCriteria("Erich Maria Remarque");
        List<Book> testList = bookDatabase.find(searchCriteria);

        assertEquals(2,testList.size());
    }

    @Test
    public void findV2() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades", "1936");
        Book secondBook = new Book("William Golding", "Lord of the Flies", "1954");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy", "1985");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club", "1996");
        Book fifthBook = new Book("Erich Maria Remarque", "Arch of Triumph", "1945");

        bookDatabase.save(firstBook);
        bookDatabase.save(secondBook);
        bookDatabase.save(thirdBook);
        bookDatabase.save(fourthBook);
        bookDatabase.save(fifthBook);

        SearchCriteria searchCriteria = new AuthorSearchCriteria("William Golding");
        List<Book> testList = bookDatabase.find(searchCriteria);

        assertEquals(1,testList.size());
    }

    @Test
    public void findV3() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades", "1936");
        Book secondBook = new Book("William Golding", "Lord of the Flies", "1954");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy", "1985");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club", "1996");
        Book fifthBook = new Book("Erich Maria Remarque", "Arch of Triumph", "1945");

        bookDatabase.save(firstBook);
        bookDatabase.save(secondBook);
        bookDatabase.save(thirdBook);
        bookDatabase.save(fourthBook);
        bookDatabase.save(fifthBook);

        SearchCriteria searchCriteria = new AuthorSearchCriteria("William Golding");
        List<Book> testList = bookDatabase.find(searchCriteria);

        assertEquals(secondBook, testList.get(0));
    }

    @Test
    public void findV4() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades", "1936");
        Book secondBook = new Book("William Golding", "Lord of the Flies", "1954");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy", "1985");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club", "1996");
        Book fifthBook = new Book("Erich Maria Remarque", "Arch of Triumph", "1945");

        bookDatabase.save(firstBook);
        bookDatabase.save(secondBook);
        bookDatabase.save(thirdBook);
        bookDatabase.save(fourthBook);
        bookDatabase.save(fifthBook);

        SearchCriteria searchCriteria = new TitleSearchCriteria("Three Comrades");
        List<Book> testList = bookDatabase.find(searchCriteria);

        assertEquals(firstBook, testList.get(0));
    }

    @Test
    public void findV5() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades", "1936");
        Book secondBook = new Book("William Golding", "Lord of the Flies", "1954");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy", "1985");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club", "1996");
        Book fifthBook = new Book("Erich Maria Remarque", "Arch of Triumph", "1945");

        bookDatabase.save(firstBook);
        bookDatabase.save(secondBook);
        bookDatabase.save(thirdBook);
        bookDatabase.save(fourthBook);
        bookDatabase.save(fifthBook);

        SearchCriteria searchCriteria = new TitleSearchCriteria("Three Comrades");
        List<Book> testList = bookDatabase.find(searchCriteria);

        assertEquals(1, testList.size());
    }

    @Test
    public void findV6() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades", "1936");
        Book secondBook = new Book("William Golding", "Lord of the Flies", "1954");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy", "1985");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club", "1996");
        Book fifthBook = new Book("Erich Maria Remarque", "Arch of Triumph", "1945");

        bookDatabase.save(firstBook);
        bookDatabase.save(secondBook);
        bookDatabase.save(thirdBook);
        bookDatabase.save(fourthBook);
        bookDatabase.save(fifthBook);

        SearchCriteria searchCriteria = new YearOfIssueSearchCriteria("1936");
        List<Book> testList = bookDatabase.find(searchCriteria);

        assertEquals(1, testList.size());
    }

    @Test
    public void findV7() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades", "1936");
        Book secondBook = new Book("William Golding", "Lord of the Flies", "1954");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy", "1985");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club", "1996");
        Book fifthBook = new Book("Erich Maria Remarque", "Arch of Triumph", "1945");

        bookDatabase.save(firstBook);
        bookDatabase.save(secondBook);
        bookDatabase.save(thirdBook);
        bookDatabase.save(fourthBook);
        bookDatabase.save(fifthBook);

        SearchCriteria searchCriteria = new YearOfIssueSearchCriteria("1936");
        List<Book> testList = bookDatabase.find(searchCriteria);

        assertEquals(firstBook, testList.get(0));
    }

    @Test
    public void findV8() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades", "1936");
        Book secondBook = new Book("William Golding", "Lord of the Flies", "1954");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy", "1985");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club", "1996");
        Book fifthBook = new Book("Erich Maria Remarque", "Arch of Triumph", "1945");

        bookDatabase.save(firstBook);
        bookDatabase.save(secondBook);
        bookDatabase.save(thirdBook);
        bookDatabase.save(fourthBook);
        bookDatabase.save(fifthBook);

        SearchCriteria author = new AuthorSearchCriteria("Erich Maria Remarque");
        SearchCriteria title = new TitleSearchCriteria("Three Comrades");
        SearchCriteria searchCriteria = new AndSearchCriteria(author, title);
        List<Book> testList = bookDatabase.find(searchCriteria);

        assertEquals(firstBook, testList.get(0));
    }

    @Test
    public void findV9() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades", "1936");
        Book secondBook = new Book("William Golding", "Lord of the Flies", "1954");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy", "1985");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club", "1996");
        Book fifthBook = new Book("Erich Maria Remarque", "Arch of Triumph", "1945");

        bookDatabase.save(firstBook);
        bookDatabase.save(secondBook);
        bookDatabase.save(thirdBook);
        bookDatabase.save(fourthBook);
        bookDatabase.save(fifthBook);

        SearchCriteria author = new AuthorSearchCriteria("Erich Maria Remarque");
        SearchCriteria title = new TitleSearchCriteria("Three Comrades");
        SearchCriteria searchCriteria = new AndSearchCriteria(author, title);
        List<Book> testList = bookDatabase.find(searchCriteria);

        assertEquals(1, testList.size());
    }

    @Test
    public void findV10() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades", "1936");
        Book secondBook = new Book("William Golding", "Lord of the Flies", "1954");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy", "1985");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club", "1996");
        Book fifthBook = new Book("Erich Maria Remarque", "Arch of Triumph", "1945");

        bookDatabase.save(firstBook);
        bookDatabase.save(secondBook);
        bookDatabase.save(thirdBook);
        bookDatabase.save(fourthBook);
        bookDatabase.save(fifthBook);

        SearchCriteria author = new AuthorSearchCriteria("Erich Maria Remarque");
        SearchCriteria title = new TitleSearchCriteria("Three Comrades");
        SearchCriteria searchCriteria = new OrSearchCriteria(author, title);
        List<Book> testList = bookDatabase.find(searchCriteria);

        assertEquals(2, testList.size());
    }

    @Test
    public void findV11() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades", "1936");
        Book secondBook = new Book("William Golding", "Lord of the Flies", "1954");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy", "1985");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club", "1996");
        Book fifthBook = new Book("Erich Maria Remarque", "Arch of Triumph", "1945");

        bookDatabase.save(firstBook);
        bookDatabase.save(secondBook);
        bookDatabase.save(thirdBook);
        bookDatabase.save(fourthBook);
        bookDatabase.save(fifthBook);

        SearchCriteria author = new AuthorSearchCriteria("Erich Maria Remarque");
        SearchCriteria title = new TitleSearchCriteria("Three Comrades");
        SearchCriteria searchCriteria = new OrSearchCriteria(author, title);
        List<Book> testList = bookDatabase.find(searchCriteria);

        assertEquals(firstBook, testList.get(0));
    }

    @Test
    public void findV12() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades", "1936");
        Book secondBook = new Book("William Golding", "Lord of the Flies", "1954");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy", "1985");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club", "1996");
        Book fifthBook = new Book("Erich Maria Remarque", "Arch of Triumph", "1945");

        bookDatabase.save(firstBook);
        bookDatabase.save(secondBook);
        bookDatabase.save(thirdBook);
        bookDatabase.save(fourthBook);
        bookDatabase.save(fifthBook);

        SearchCriteria author = new AuthorSearchCriteria("Erich Maria Remarque");
        SearchCriteria title = new TitleSearchCriteria("Three Comrades");
        SearchCriteria searchCriteria = new OrSearchCriteria(author, title);
        List<Book> testList = bookDatabase.find(searchCriteria);

        assertEquals(fifthBook, testList.get(1));
    }

    @Test
    public void findV13() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades", "1936");
        Book secondBook = new Book("William Golding", "Lord of the Flies", "1954");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy", "1985");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club", "1996");
        Book fifthBook = new Book("Erich Maria Remarque", "Arch of Triumph", "1945");

        bookDatabase.save(firstBook);
        bookDatabase.save(secondBook);
        bookDatabase.save(thirdBook);
        bookDatabase.save(fourthBook);
        bookDatabase.save(fifthBook);

        SearchCriteria author = new AuthorSearchCriteria("Erich Maria Remarque");
        SearchCriteria year = new TitleSearchCriteria("1996");
        SearchCriteria searchCriteria = new OrSearchCriteria(author, year);
        List<Book> testList = bookDatabase.find(searchCriteria);

        assertEquals(2, testList.size());
    }

    @Test
    public void findV14() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades", "1936");
        Book secondBook = new Book("William Golding", "Lord of the Flies", "1954");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy", "1985");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club", "1996");
        Book fifthBook = new Book("Erich Maria Remarque", "Arch of Triumph", "1945");

        bookDatabase.save(firstBook);
        bookDatabase.save(secondBook);
        bookDatabase.save(thirdBook);
        bookDatabase.save(fourthBook);
        bookDatabase.save(fifthBook);

        SearchCriteria author = new AuthorSearchCriteria("Erich Maria Remarque");
        SearchCriteria year = new TitleSearchCriteria("1996");
        SearchCriteria searchCriteria = new OrSearchCriteria(author, year);
        List<Book> testList = bookDatabase.find(searchCriteria);

        assertEquals(firstBook, testList.get(0));
    }

    @Test
    public void findV15() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades", "1936");
        Book secondBook = new Book("William Golding", "Lord of the Flies", "1954");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy", "1985");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club", "1996");
        Book fifthBook = new Book("Erich Maria Remarque", "Arch of Triumph", "1945");

        bookDatabase.save(firstBook);
        bookDatabase.save(secondBook);
        bookDatabase.save(thirdBook);
        bookDatabase.save(fourthBook);
        bookDatabase.save(fifthBook);

        SearchCriteria author = new AuthorSearchCriteria("Erich Maria Remarque");
        SearchCriteria year = new YearOfIssueSearchCriteria("1996");
        SearchCriteria searchCriteria = new OrSearchCriteria(author, year);
        List<Book> testList = bookDatabase.find(searchCriteria);

        assertEquals(fourthBook, testList.get(1));
    }

    @Test
    public void findV16() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades", "1936");
        Book secondBook = new Book("William Golding", "Lord of the Flies", "1954");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy", "1985");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club", "1996");
        Book fifthBook = new Book("Erich Maria Remarque", "Arch of Triumph", "1945");

        bookDatabase.save(firstBook);
        bookDatabase.save(secondBook);
        bookDatabase.save(thirdBook);
        bookDatabase.save(fourthBook);
        bookDatabase.save(fifthBook);

        SearchCriteria author = new AuthorSearchCriteria("Erich Maria Remarque");
        SearchCriteria year = new YearOfIssueSearchCriteria("1936");
        SearchCriteria searchCriteria = new AndSearchCriteria(author, year);
        List<Book> testList = bookDatabase.find(searchCriteria);

        assertEquals(firstBook, testList.get(0));
    }

    @Test
    public void findV17() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades", "1936");
        Book secondBook = new Book("William Golding", "Lord of the Flies", "1954");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy", "1985");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club", "1996");
        Book fifthBook = new Book("Erich Maria Remarque", "Arch of Triumph", "1945");

        bookDatabase.save(firstBook);
        bookDatabase.save(secondBook);
        bookDatabase.save(thirdBook);
        bookDatabase.save(fourthBook);
        bookDatabase.save(fifthBook);

        SearchCriteria author = new AuthorSearchCriteria("Erich Maria Remarque");
        SearchCriteria year = new YearOfIssueSearchCriteria("1936");
        SearchCriteria searchCriteria = new AndSearchCriteria(author, year);
        List<Book> testList = bookDatabase.find(searchCriteria);

        assertEquals(1, testList.size());
    }

    @Test
    public void findV18() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades", "1936");
        Book secondBook = new Book("William Golding", "Lord of the Flies", "1954");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy", "1985");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club", "1996");
        Book fifthBook = new Book("Erich Maria Remarque", "Arch of Triumph", "1945");

        bookDatabase.save(firstBook);
        bookDatabase.save(secondBook);
        bookDatabase.save(thirdBook);
        bookDatabase.save(fourthBook);
        bookDatabase.save(fifthBook);

        SearchCriteria title = new TitleSearchCriteria("Three Comrades");
        SearchCriteria year = new YearOfIssueSearchCriteria("1936");
        SearchCriteria searchCriteria = new AndSearchCriteria(title, year);
        List<Book> testList = bookDatabase.find(searchCriteria);

        assertEquals(1, testList.size());
    }

    @Test
    public void findV19() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades", "1936");
        Book secondBook = new Book("William Golding", "Lord of the Flies", "1954");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy", "1985");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club", "1996");
        Book fifthBook = new Book("Erich Maria Remarque", "Arch of Triumph", "1945");

        bookDatabase.save(firstBook);
        bookDatabase.save(secondBook);
        bookDatabase.save(thirdBook);
        bookDatabase.save(fourthBook);
        bookDatabase.save(fifthBook);

        SearchCriteria title = new TitleSearchCriteria("Three Comrades");
        SearchCriteria year = new YearOfIssueSearchCriteria("1936");
        SearchCriteria searchCriteria = new AndSearchCriteria(title, year);
        List<Book> testList = bookDatabase.find(searchCriteria);

        assertEquals(firstBook, testList.get(0));
    }

    @Test
    public void findV20() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades", "1936");
        Book secondBook = new Book("William Golding", "Lord of the Flies", "1954");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy", "1985");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club", "1996");
        Book fifthBook = new Book("Erich Maria Remarque", "Arch of Triumph", "1945");

        bookDatabase.save(firstBook);
        bookDatabase.save(secondBook);
        bookDatabase.save(thirdBook);
        bookDatabase.save(fourthBook);
        bookDatabase.save(fifthBook);

        SearchCriteria title = new TitleSearchCriteria("Three Comrades");
        SearchCriteria year = new YearOfIssueSearchCriteria("1945");
        SearchCriteria searchCriteria = new OrSearchCriteria(title, year);
        List<Book> testList = bookDatabase.find(searchCriteria);

        assertEquals(firstBook, testList.get(0));
    }

    @Test
    public void findV21() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades", "1936");
        Book secondBook = new Book("William Golding", "Lord of the Flies", "1954");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy", "1985");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club", "1996");
        Book fifthBook = new Book("Erich Maria Remarque", "Arch of Triumph", "1945");

        bookDatabase.save(firstBook);
        bookDatabase.save(secondBook);
        bookDatabase.save(thirdBook);
        bookDatabase.save(fourthBook);
        bookDatabase.save(fifthBook);

        SearchCriteria title = new TitleSearchCriteria("Three Comrades");
        SearchCriteria year = new YearOfIssueSearchCriteria("1945");
        SearchCriteria searchCriteria = new OrSearchCriteria(title, year);
        List<Book> testList = bookDatabase.find(searchCriteria);

        assertEquals(fifthBook, testList.get(1));
    }

    @Test
    public void findV22() {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades", "1936");
        Book secondBook = new Book("William Golding", "Lord of the Flies", "1954");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy", "1985");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club", "1996");
        Book fifthBook = new Book("Erich Maria Remarque", "Arch of Triumph", "1945");

        bookDatabase.save(firstBook);
        bookDatabase.save(secondBook);
        bookDatabase.save(thirdBook);
        bookDatabase.save(fourthBook);
        bookDatabase.save(fifthBook);

        SearchCriteria title = new TitleSearchCriteria("Three Comrades");
        SearchCriteria year = new YearOfIssueSearchCriteria("1945");
        SearchCriteria searchCriteria = new OrSearchCriteria(title, year);
        List<Book> testList = bookDatabase.find(searchCriteria);

        assertEquals(2, testList.size());
    }


}