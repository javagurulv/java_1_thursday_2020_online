package student_aleksey_kodin.lesson8.dayx.supertask1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Book {
    private final String author;
    private final String bookName;
    List<DatesUsingBook> datesUsingBooks = new ArrayList<>();

    public Book(String author,String bookName) {
        this.author = author;
        this.bookName = bookName;
    }
    public String getBookName() {
        return bookName;
    }
    public String getAuthor() {
        return author;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return author.equals(book.author) &&
                bookName.equals(book.bookName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(author, bookName);
    }
}
