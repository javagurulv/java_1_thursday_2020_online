package student_aleksey_kodin.lesson11.level1.task_5;

import java.util.List;
import java.util.Objects;

class BookListContainsDemo {
    public boolean findBook(List<Book> books, String bookTitle) {
        return books.stream().anyMatch(b -> b.getTitle().equals(bookTitle));
    }
}

class Book {
    private final String title;
    private final String author;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title.equals(book.title) &&
                author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
