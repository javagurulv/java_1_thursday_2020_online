package student_aleksey_kodin.lesson11.level6.task_32;

import java.util.Optional;
import java.util.Scanner;

class FindByIdUIAction implements UIAction {

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
