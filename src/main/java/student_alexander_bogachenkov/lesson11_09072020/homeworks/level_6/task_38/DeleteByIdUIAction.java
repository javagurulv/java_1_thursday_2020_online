package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_6.task_38;

import java.util.Scanner;

class DeleteByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        // запросите id книги с консоли у пользолвателя
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ID книги: ");
        String id = scanner.nextLine();
        // поиск книги в базе данных: Optional<Book> bookOpt = bookDatabase.findById(id);
        bookDatabase.deleteById(id);
        // вывелите на консоль результаты поиска
        System.out.println("Книга под номером " + id + " была удалена.");
    }
}
