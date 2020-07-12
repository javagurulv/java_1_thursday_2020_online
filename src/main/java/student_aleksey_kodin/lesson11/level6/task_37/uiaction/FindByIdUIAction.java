package student_aleksey_kodin.lesson11.level6.task_37.uiaction;

import student_aleksey_kodin.lesson11.level6.task_37.Book;
import student_aleksey_kodin.lesson11.level6.task_37.BookDatabaseImpl;

import java.util.Optional;
import java.util.Scanner;

public class FindByIdUIAction implements UIAction {

    private final BookDatabaseImpl bookDatabase;

    public FindByIdUIAction(BookDatabaseImpl bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println("Enter Book's id: ");
        Long id = new Scanner(System.in).nextLong();

        Optional<Book> bookSearchResult = bookDatabase.findById(id);
        printInformation(bookSearchResult, id);
    }

    private void printInformation(Optional<Book> book, Long id) {
        System.out.println("Book id - " + id);
        book.ifPresent(value -> System.out.println(value.getAuthor() + " " + value.getTitle() + " " +
                value.getYearOfIssue()));
    }
}
