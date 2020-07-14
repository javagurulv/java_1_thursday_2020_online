package student_vadims_vladisevs.lesson_11.level_6.task_37;

import java.util.Optional;
import java.util.Scanner;

class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase){
        this.bookDatabase = bookDatabase;
    }


    @Override
    public void execute() {
        System.out.println("Enter book Id: ");
        Scanner scr = new Scanner(System.in);
        long bookId = scr.nextLong();

        Optional<Book> bookOpt = bookDatabase.findById(bookId);

        bookOpt.ifPresent(book -> System.out.println("[" + bookId + "] " + book.getAuthor() + " - " +
                book.getTitle() + " (" + book.getYearOfIssue() + ")"));
    }
}
