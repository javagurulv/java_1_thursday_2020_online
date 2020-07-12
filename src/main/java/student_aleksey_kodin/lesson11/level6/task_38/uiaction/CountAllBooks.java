package student_aleksey_kodin.lesson11.level6.task_38.uiaction;

import student_aleksey_kodin.lesson11.level6.task_38.BookDatabaseImpl;

public class CountAllBooks implements UIAction  {
    private final BookDatabaseImpl bookDatabase;

    public CountAllBooks(BookDatabaseImpl bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println("Books in library - " + bookDatabase.countAllBooks());
    }
}
