package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_6.task_38;

import java.util.Set;

class FindUniqueBooksUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUniqueBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Set<Book> uniqueBooks = bookDatabase.findUniqueBooks();
        for (Book book : uniqueBooks) {
            System.out.println(book);
        }
    }
}
