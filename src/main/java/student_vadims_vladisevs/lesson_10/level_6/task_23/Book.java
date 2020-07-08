package student_vadims_vladisevs.lesson_10.level_6.task_23;

class Book {
    private String title;
    private String author;
    private boolean read;

    public Book(String author, String title){
        this.author = author;
        this.title = title;
        this.read = false;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }
}
