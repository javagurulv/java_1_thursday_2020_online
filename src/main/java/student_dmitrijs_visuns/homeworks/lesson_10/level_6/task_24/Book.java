package student_dmitrijs_visuns.homeworks.lesson_10.level_6.task_24;

class Book {

    private String bookAuthor;
    private String bookTitle;
    private boolean isRead;

    public Book (String bookAuthor, String bookTitle) {
        this.bookAuthor = bookAuthor;
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }
}
