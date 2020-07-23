package student_dmitrijs_visuns.homeworks.lesson_11.level_6.task_37;

import java.util.Optional;
import java.util.Scanner;

class FindByIdUIAction implements UIAction {

    private BookDataBase bookDatabase;

    public FindByIdUIAction(BookDataBase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book ID: ");
        Long id = sc.nextLong();
        Optional<Book> bookOpt = bookDatabase.findById(id);
        System.out.println("Search result: ");
        if (bookOpt.isEmpty()) {
            System.out.println("No book with given ID found");
        } else {
            Book foundBook = bookOpt.get();
            System.out.println("Book title: " + foundBook.getTitle());
            System.out.println("Book author: " + foundBook.getAuthor());
            System.out.println("Book year of issue: " + foundBook.getYearOfIssue());
        }
    }

}