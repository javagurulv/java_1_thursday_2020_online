package student_julija_skopeca.practical_tasks.lesson_10.level_6.task_14;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object obj) {
        Book book = (Book)obj;
        return this.author == book.getAuthor() && this.title == book.getTitle();
    }
}
