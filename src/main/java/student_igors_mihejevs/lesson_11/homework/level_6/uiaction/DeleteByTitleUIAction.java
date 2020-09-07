package student_igors_mihejevs.lesson_11.homework.level_6.uiaction;

import student_igors_mihejevs.lesson_11.homework.level_6.BookDatabase;

import java.util.Scanner;

public class DeleteByTitleUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public DeleteByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Deleting book by title : ");
        System.out.print("Enter book title : ");
        String bookTitle = myInput.nextLine();

        bookDatabase.deleteByAuthor(bookTitle);
    }

}
