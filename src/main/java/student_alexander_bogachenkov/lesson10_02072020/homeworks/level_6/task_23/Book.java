package student_alexander_bogachenkov.lesson10_02072020.homeworks.level_6.task_23;

import java.util.Objects;

class Book {

    private String title;
    private String author;
    private boolean isMarkedAsRead;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isMarkedAsRead = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book that = (Book) o;
        return title == that.title &&
                Objects.equals(author, that.author);
    }

    public char[] getFirstFourAuthorLetters() {
        String author = this.author.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();
        char[] tempArray = author.toCharArray();
        char[] result = new char[4];
        for (int i = 0; i < 4; i++) {
            result[i] = tempArray[i];
        }
        return result;
    }

    public char[] getFirstFourTitleLetters() {
        String title = this.title.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();
        char[] tempArray = title.toCharArray();
        char[] result = new char[4];
        for (int i = 0; i < 4; i++) {
            result[i] = tempArray[i];
        }
        return result;
    }

    void markAsRead() {
        this.isMarkedAsRead = true;
    }

    void markAsUnread() {
        this.isMarkedAsRead = false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
