package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_6.task_37;

import java.util.Optional;
import java.util.Scanner;

class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        // запросите id книги с консоли у пользолвателя
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ID книги: ");
        long id = scanner.nextLong();
        // поиск книги в базе данных: Optional<Book> bookOpt = bookDatabase.findById(id);
        Optional<Book> bookOpt = bookDatabase.findById(id);
        // вывелите на консоль результаты поиска
        bookOpt.ifPresent(value -> System.out.println("Author: " + value.getAuthor() + ", title: " + value.getTitle() + ", year of issue: " + value.getYearOfIssue() + "."));
    }

}