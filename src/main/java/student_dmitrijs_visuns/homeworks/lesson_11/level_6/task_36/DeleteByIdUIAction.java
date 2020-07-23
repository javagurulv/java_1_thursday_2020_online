package student_dmitrijs_visuns.homeworks.lesson_11.level_6.task_36;

import java.util.Scanner;

class DeleteByIdUIAction implements UIAction {

    private BookDataBase bookDatabase;

    public DeleteByIdUIAction(BookDataBase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book ID: ");
        Long id = sc.nextLong();
        bookDatabase.delete(id);
        System.out.println("Book deleted!");
    }
}
