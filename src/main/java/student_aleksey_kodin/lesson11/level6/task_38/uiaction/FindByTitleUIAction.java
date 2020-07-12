package student_aleksey_kodin.lesson11.level6.task_38.uiaction;

import student_aleksey_kodin.lesson11.level6.task_38.Book;
import student_aleksey_kodin.lesson11.level6.task_38.BookDatabaseImpl;

import java.util.List;
import java.util.Scanner;

public class FindByTitleUIAction implements UIAction {
    private final BookDatabaseImpl bookDatabase;

    public FindByTitleUIAction(BookDatabaseImpl bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println("Enter Book's title: ");
        String title = new Scanner(System.in).nextLine();

        List<Book> bookSearchResult = bookDatabase.findByTitle(title);
        printInformation(bookSearchResult);
    }

    private void printInformation(List<Book> book) {
        book.forEach(b -> System.out.print(b.getAuthor() + " " + b.getTitle() + " " + b.getYearOfIssue()));
    }
}
