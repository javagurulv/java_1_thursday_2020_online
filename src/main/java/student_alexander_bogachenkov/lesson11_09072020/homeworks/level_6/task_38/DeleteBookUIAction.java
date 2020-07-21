package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_6.task_38;

import java.util.Scanner;

class DeleteBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите автора книги: ");
        String userAuthor = scanner.nextLine();
        System.out.println("Введите название книги: ");
        String userTitle = scanner.nextLine();
        System.out.println("Введите год издания книги: ");
        String userBookYear = scanner.nextLine();
        Book book = new Book(userAuthor, userTitle, userBookYear);
        bookDatabase.delete(book);
    }
}
