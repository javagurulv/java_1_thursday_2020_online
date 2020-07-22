package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_6.task_31;

import java.util.Scanner;

class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        // запросите все данные о книге с консоли у пользолвателя
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите автора книги: ");
        String userAuthor = scanner.nextLine();
        System.out.println("Введите название книги: ");
        String userTitle = scanner.nextLine();
        System.out.println("Введите год издания книги: ");
        String userBookYear = scanner.nextLine();
        // создайте экземпляр класса Book (не указывая поле id, его присвоит сама база данных)
        Book book = new Book(userAuthor, userTitle, userBookYear);
        // сохраните его в базу данных: bookDatabase.save(book);
        bookDatabase.save(book);
    }

}