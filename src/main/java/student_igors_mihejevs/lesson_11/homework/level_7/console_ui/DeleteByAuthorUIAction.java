package student_igors_mihejevs.lesson_11.homework.level_7.console_ui;

import student_igors_mihejevs.lesson_11.homework.level_7.database.BookDatabase;

import java.util.Scanner;

public class DeleteByAuthorUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public DeleteByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Deleting book by author : ");
        System.out.print("Enter book author : ");
        String bookAuthor = myInput.nextLine();

        bookDatabase.deleteByAuthor(bookAuthor);
    }

}
