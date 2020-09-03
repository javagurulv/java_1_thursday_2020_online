package student_igors_mihejevs.lesson_11.homework.level_6.uiaction;

import student_igors_mihejevs.lesson_11.homework.level_6.BookDatabase;
import java.util.Scanner;

class DeleteByIdUIAction implements UIAction {

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
