package student_julija_skopeca.practical_tasks.lesson_10.level_6.task_14;

public class Book {
    private String title;
    private String author;
    private boolean isSetAsFinished;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isSetAsFinished = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean markAsFinished() {this.isSetAsFinished = true;
        return false;
    }

        @Override
    public boolean equals(Object obj) {
        Book book = (Book)obj;
        return this.author == book.getAuthor() && this.title == book.getTitle();
    }


}
