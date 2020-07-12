package student_aleksey_kodin.lesson11.level6.task_34.uiaction;

import student_aleksey_kodin.lesson11.level6.task_34.Book;
import student_aleksey_kodin.lesson11.level6.task_34.BookDatabaseImpl;

import java.util.List;
import java.util.Scanner;

public class FindByAuthorUIAction implements UIAction {
    private final BookDatabaseImpl bookDatabase;

    public FindByAuthorUIAction(BookDatabaseImpl bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println("Enter Book's author: ");
        String author = new Scanner(System.in).nextLine();

        List<Book> bookSearchResult = bookDatabase.findByAuthor(author);
        printInformation(bookSearchResult);
    }

    private void printInformation(List<Book> book) {
        book.forEach(b -> System.out.print(b.getAuthor() + " " + b.getTitle() + " " + b.getYearOfIssue()));
    }
}
