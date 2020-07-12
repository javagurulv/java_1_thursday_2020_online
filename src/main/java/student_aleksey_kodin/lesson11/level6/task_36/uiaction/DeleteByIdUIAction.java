package student_aleksey_kodin.lesson11.level6.task_36.uiaction;

import student_aleksey_kodin.lesson11.level6.task_36.BookDatabaseImpl;

import java.util.Scanner;

public class DeleteByIdUIAction implements UIAction {
    private final BookDatabaseImpl bookDatabase;

    public DeleteByIdUIAction(BookDatabaseImpl bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println("Enter Book's id for delete: ");
        Long id = new Scanner(System.in).nextLong();
        boolean result = bookDatabase.delete(id);

        if (result) {
            System.out.println("Successful");
        } else {
            System.out.println("Error, try again");
        }
    }
}
