package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_6.task_37;

import java.util.List;
import java.util.Scanner;

class FindByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите автора книги: ");
        String author = scanner.nextLine();
        List<Book> bookList = bookDatabase.findByAuthor(author);
        for (Book book : bookList) {
            System.out.println("Author: " + book.getAuthor() + ", title: " + book.getTitle() + ", year of issue: " + book.getYearOfIssue() + ".");
        }
    }

}