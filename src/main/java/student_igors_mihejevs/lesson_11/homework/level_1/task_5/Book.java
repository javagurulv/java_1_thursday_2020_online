package student_igors_mihejevs.lesson_11.homework.level_1.task_5;

import java.util.Objects;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Book {
    private final String title;
    private final String author;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
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
