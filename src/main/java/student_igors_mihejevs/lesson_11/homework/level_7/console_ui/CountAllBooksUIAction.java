package student_igors_mihejevs.lesson_11.homework.level_7.console_ui;

import student_igors_mihejevs.lesson_11.homework.level_7.database.BookDatabase;

public class CountAllBooksUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public CountAllBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        System.out.println("Books in database = " + bookDatabase.countAllBooks());
    }

}
