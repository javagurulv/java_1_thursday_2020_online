package student_igors_mihejevs.lesson_10.homework.level_6;

class Book {

    private String bookTitle;
    private String bookAuthor;
    private boolean alreadyRead; // true - already read, false - not read

    public Book(String bookTitle, String bookAuthor) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
    }

    public void setAlreadyRead(boolean alreadyRead) {
        this.alreadyRead = alreadyRead;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public boolean isAlreadyRead() {
        return alreadyRead;
    }
}
