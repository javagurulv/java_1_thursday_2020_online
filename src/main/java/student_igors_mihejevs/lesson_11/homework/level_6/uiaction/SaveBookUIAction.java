package student_igors_mihejevs.lesson_11.homework.level_6.uiaction;

import student_igors_mihejevs.lesson_11.homework.level_6.Book;
import student_igors_mihejevs.lesson_11.homework.level_6.BookDatabase;
import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class SaveBookUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Adding book to database : ");
        System.out.print("Enter book author : ");
        String bookAuthor = myInput.nextLine();
        System.out.print("Enter book title : ");
        String bookTitle = myInput.nextLine();
        System.out.print("Enter the year of issue : ");
        String bookYearOfIssue = myInput.nextLine();

        bookDatabase.save(new Book(bookAuthor, bookTitle, bookYearOfIssue));
    }

}
