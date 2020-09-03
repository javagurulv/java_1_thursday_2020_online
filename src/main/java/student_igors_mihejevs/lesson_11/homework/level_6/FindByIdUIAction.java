package student_igors_mihejevs.lesson_11.homework.level_6;

import java.util.Optional;
import java.util.Scanner;

class FindByIdUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter book ID : ");
        Long id = myInput.nextLong();
        Optional<Book> bookOpt = bookDatabase.findById(id);

        if (bookOpt.isEmpty()) {
            System.out.println("No book with ID = " + id + " in the DataBase");
        } else {
            System.out.println("Found next book in the DataBase :");
            System.out.println("Book author: " + bookOpt.get().getAuthor());
            System.out.println("Book title: " + bookOpt.get().getTitle());
            System.out.println("Book year of issue: " + bookOpt.get().getYearOfIssue());
        }
    }

}
