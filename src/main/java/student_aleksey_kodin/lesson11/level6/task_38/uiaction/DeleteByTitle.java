package student_aleksey_kodin.lesson11.level6.task_38.uiaction;

import student_aleksey_kodin.lesson11.level6.task_38.BookDatabaseImpl;

import java.util.Scanner;

public class DeleteByTitle implements UIAction {
    private final BookDatabaseImpl bookDatabase;

    public DeleteByTitle(BookDatabaseImpl bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println("Enter Book's title for delete: ");
        String title = new Scanner(System.in).nextLine();
        bookDatabase.deleteByAuthor(title);
    }
}
