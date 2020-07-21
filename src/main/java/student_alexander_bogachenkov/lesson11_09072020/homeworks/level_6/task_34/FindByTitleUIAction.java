package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_6.task_34;

import java.util.List;
import java.util.Scanner;

public class FindByTitleUIAction {

    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название книги: ");
        String author = scanner.nextLine();
        List<Book> bookList = bookDatabase.findByTitle(author);
        for (Book book : bookList) {
            System.out.println("Author: " + book.getAuthor() + ", title: " + book.getTitle() + ", year of issue: " + book.getYearOfIssue() + ".");
        }
    }
}
