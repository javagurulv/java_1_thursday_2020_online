package student_igors_mihejevs.lesson_11.homework.level_7.console_ui;

import student_igors_mihejevs.lesson_11.homework.level_7.domain.Book;
import student_igors_mihejevs.lesson_11.homework.level_7.database.BookDatabase;
import teacher.codereview.CodeReview;

import java.util.List;
import java.util.Scanner;

@CodeReview(approved = true)
public class FindByTitleUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter book title for searching: ");
        String bookTitle = myInput.nextLine();

        List<Book> bookFound = bookDatabase.findByTitle(bookTitle);

        if (bookFound.isEmpty()) {
            System.out.println("No book with author = " + bookTitle + " in the DataBase");
        } else {
            System.out.println("Found next books in the DataBase :");
            for (Book book : bookFound) {
                System.out.println("Book author: " + book.getAuthor());
                System.out.println("Book title: " + book.getTitle());
                System.out.println("Book year of issue: " + book.getYearOfIssue());
            }
        }
    }

}
