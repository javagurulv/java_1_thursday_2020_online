package student_aleksey_kodin.lesson10.level6.task_21;

import java.util.Objects;

public class Book {
    private final String bookTitle;
    private final String bookAuthor;

    Book(String bookAuthor, String bookTitle) {
        this.bookAuthor = bookAuthor;
        this.bookTitle = bookTitle;
    }

    public String getBookName() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookTitle.equals(book.bookTitle) &&
                bookAuthor.equals(book.bookAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, bookAuthor);
    }
}
