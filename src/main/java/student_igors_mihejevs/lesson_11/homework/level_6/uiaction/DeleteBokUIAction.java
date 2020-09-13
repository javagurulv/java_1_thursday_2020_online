package student_igors_mihejevs.lesson_11.homework.level_6.uiaction;

import student_igors_mihejevs.lesson_11.homework.level_6.Book;
import student_igors_mihejevs.lesson_11.homework.level_6.BookDatabase;

import java.util.Scanner;

public class DeleteBokUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public DeleteBokUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Deleting book by author and title : ");
        System.out.print("Enter book author : ");
        String bookAuthor = myInput.nextLine();
        System.out.print("Enter book title : ");
        String bookTitle = myInput.nextLine();
        System.out.print("Enter the year of issue : ");
        String bookYearOfIssue = myInput.nextLine();

        bookDatabase.delete(new Book(bookAuthor, bookTitle, bookYearOfIssue));
    }

}
