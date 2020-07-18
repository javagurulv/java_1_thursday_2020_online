package student_alexander_bogachenkov.lesson10_02072020.homeworks.level_6.task_20;

import java.util.Objects;

class Book {

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
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
