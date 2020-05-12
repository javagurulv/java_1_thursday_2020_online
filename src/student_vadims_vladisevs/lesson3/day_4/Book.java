package student_vadims_vladisevs.lesson3.day_4;

public class Book {

    private final String title; //не хватало ";" в конце строки

    public Book(String bookTitle) {
        this.title = bookTitle; //не хватало ";" в конце строки; вместо "newTitle" нужно передавать значение "bookTitle";
    }

    public String getTitle() {
        return this.title;
    }

}   //была лишняя "}";
