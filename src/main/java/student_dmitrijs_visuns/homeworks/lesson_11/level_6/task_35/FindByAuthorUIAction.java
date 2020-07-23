package student_dmitrijs_visuns.homeworks.lesson_11.level_6.task_35;

import java.util.List;
import java.util.Scanner;

class FindByAuthorUIAction implements UIAction {

    private BookDataBase bookDatabase;

    public FindByAuthorUIAction(BookDataBase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book author: ");
        String authorToFind = sc.nextLine();
        List<Book> foundBooksList = bookDatabase.findByAuthor(authorToFind);
        System.out.println("Search result: ");
        if (foundBooksList.isEmpty()) {
            System.out.println("Found no books by this author");
        } else {
            System.out.println("Found " + foundBooksList.size() + " books by this author:");
            for (Book book : foundBooksList) {
                System.out.println("Book title: " + book.getTitle());
                System.out.println("Book author: " + book.getAuthor());
                System.out.println("Book year of issue: " + book.getYearOfIssue());
                System.out.println("");
            }

        }
    }

}
