package student_igors_mihejevs.lesson_11.homework.level_6.uiaction;

import student_igors_mihejevs.lesson_11.homework.level_6.Book;
import student_igors_mihejevs.lesson_11.homework.level_6.BookDatabase;

public class FindUniqueBooksUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public FindUniqueBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        System.out.println("Finding unique books from database :");
        for (Book book : bookDatabase.findUniqueBooks()) {
            System.out.println(book.getAuthor() + " " + book.getTitle());
        }
    }

}
