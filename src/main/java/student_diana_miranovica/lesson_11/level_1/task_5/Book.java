package student_diana_miranovica.lesson_11.level_1.task_5;

import java.util.Objects;

public class Book {

    private String title;
    private String author;

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
    public boolean equals(Object object){
        if(this == object) return true;
        if((object == null) || getClass() != object.getClass()) return false;
        Book that = (Book) object;
        return title == that.title && Objects.equals(author,that.author);
    }

    @Override
    public int hashCode(){
        return Objects.hash(title, author);
    }
}
