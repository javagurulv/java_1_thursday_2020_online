package student_aleksey_kodin.lesson10.level6.task_25;

import java.util.Objects;

public class Book {
    private final String bookTitle;
    private final String bookAuthor;
    private Boolean finishedBook = false;
    private Boolean unreadBook = false;


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

    public Boolean getFinishedBook() {
        return finishedBook;
    }

    public void setFinishedBook(Boolean finishedBook) {
        this.finishedBook = finishedBook;
    }

    public Boolean getUnreadBook() {
        return unreadBook;
    }

    public void setUnreadBook(Boolean unreadBook) {
        this.unreadBook = unreadBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookTitle.equals(book.bookTitle) &&
                bookAuthor.equals(book.bookAuthor) &&
                finishedBook.equals(book.finishedBook) &&
                unreadBook.equals(book.unreadBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, bookAuthor, finishedBook, unreadBook);
    }
}
