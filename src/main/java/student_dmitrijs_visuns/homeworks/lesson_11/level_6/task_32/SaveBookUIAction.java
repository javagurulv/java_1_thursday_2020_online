package student_dmitrijs_visuns.homeworks.lesson_11.level_6.task_32;

import java.util.Scanner;

class SaveBookUIAction implements UIAction {

    private BookDataBase bookDatabase;

    public SaveBookUIAction(BookDataBase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book autor: ");
        String author = sc.nextLine();
        System.out.println("Enter book title: ");
        String title = sc.nextLine();
        System.out.println("Enter book year of issue: ");
        String year = sc.nextLine();
        Book newBook = new Book(author, title, year);
        bookDatabase.save(newBook);
    }

}