package student_diana_miranovica.lesson_11.level_1.task_5;

import java.util.ArrayList;
import java.util.List;

public class BookContainsDemo {

    private static List<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        books.add(new Book("Robert Martin","Clean code"));
        books.add(new Book("Kathy Sierra, Bert Bates", "Head first java, 2nd edition"));
        books.add(new Book("Marcia Brown", "Cinderella"));
        books.add(new Book("Richard M. Stallman", "Free Software, free Society"));

        boolean isContainingBook = books.contains(new Book("Richard M. Stallman", "Free Software, free Society"));
        System.out.println(isContainingBook);


    }
}
