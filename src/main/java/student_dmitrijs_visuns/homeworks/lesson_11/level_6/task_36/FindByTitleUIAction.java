package student_dmitrijs_visuns.homeworks.lesson_11.level_6.task_36;

import java.util.List;
import java.util.Scanner;

class FindByTitleUIAction implements UIAction {

    private BookDataBase bookDatabase;

    public FindByTitleUIAction(BookDataBase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book title: ");
        String titleToFind = sc.nextLine();
        List<Book> foundBooksList = bookDatabase.findByTitle(titleToFind);
        System.out.println("Search result: ");
        if (foundBooksList.isEmpty()) {
            System.out.println("Found no books with this title");
        } else {
            System.out.println("Found " + foundBooksList.size() + " books with this title:");
            System.out.println("");
            for (Book book : foundBooksList) {
                System.out.println("Book title: " + book.getTitle());
                System.out.println("Book author: " + book.getAuthor());
                System.out.println("Book year of issue: " + book.getYearOfIssue());
                System.out.println("");
            }

        }
    }
}