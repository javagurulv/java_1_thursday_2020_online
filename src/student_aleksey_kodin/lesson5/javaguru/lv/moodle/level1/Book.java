package student_aleksey_kodin.lesson5.javaguru.lv.moodle.level1;

import java.util.Objects;

class Book {
    private String bookAuthor;
    private String bookTitle;
    private short bookPageQuantity;

    public String getBookAuthor() {
        return bookAuthor;
    }
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    public short getBookPageQuantity() {
        return bookPageQuantity;
    }
    public void setBookPageQuantity(short bookPageQuantity) {
        this.bookPageQuantity = bookPageQuantity;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookPageQuantity == book.bookPageQuantity &&
                bookAuthor.equals(book.bookAuthor) &&
                bookTitle.equals(book.bookTitle);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bookAuthor, bookTitle, bookPageQuantity);
    }
    @Override
    public String toString() {
        return "Book{" +
                "bookAuthor='" + bookAuthor + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookPageQuantity=" + bookPageQuantity +
                '}';
    }
}
