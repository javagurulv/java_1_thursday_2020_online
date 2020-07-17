package student_dmitrijs_visuns.homeworks.lesson_10.level_6.task_15;

public class Demo {

    public static void main(String[] args) {

        BookReaderImpl prototype = new BookReaderImpl();
        Book book1 = new Book ("", "NewT");
        Book book2 = new Book ("  ", "  ");

        System.out.println(prototype.bookHasTitle(book2));

    }

}
