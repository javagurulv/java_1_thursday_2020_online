package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_6.task_38;

import java.util.Scanner;

class DeleteByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        // запросите id книги с консоли у пользолвателя
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите автора книги: ");
        String author = scanner.nextLine();
        // поиск книги в базе данных: Optional<Book> bookOpt = bookDatabase.findById(id);
        bookDatabase.deleteByAuthor(author);
        // вывелите на консоль результаты поиска
        System.out.println("Книга под автором " + author + " была удалена.");
    }
}
