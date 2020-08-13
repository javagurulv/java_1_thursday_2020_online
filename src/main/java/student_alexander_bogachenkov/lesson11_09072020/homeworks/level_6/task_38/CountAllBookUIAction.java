package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_6.task_38;

import java.util.Scanner;

class CountAllBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public CountAllBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        int result = bookDatabase.countAllBooks();
        System.out.println("all book count = " + result);
    }
}
