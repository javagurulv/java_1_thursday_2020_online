package student_igors_mihejevs.lesson_11.homework.level_7.console_ui;

import student_igors_mihejevs.lesson_11.homework.level_7.database.BookDatabase;
import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class DeleteByIdUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter book ID for deleting: ");
        Long id = myInput.nextLong();
        boolean bookDeleted = bookDatabase.delete(id);

        if (bookDeleted) {
            System.out.println("Book with ID = " + id + " deleted");
        } else {
            System.out.println("Book with ID = " + id + " is not in the database");
        }
    }

}
