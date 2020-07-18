package student_dmitrijs_visuns.homeworks.lesson_10.level_6.task_16;

public class Demo {

    public static void main(String[] args) {

        BookReaderImpl prototype = new BookReaderImpl();
        Book book1 = new Book ("Heinlein", "Tunnel");
        prototype.addBookToLibrary(book1);
        boolean t = (book1.equals(prototype.readerLibrary.get(0)));
        System.out.println(t);

    }

}
