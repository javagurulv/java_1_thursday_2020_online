package student_aleksey_kodin.lesson11.level6.task_32;

import java.util.Scanner;

class SaveBookUIAction implements UIAction {

    private final BookDatabaseImpl bookDatabase;

    public SaveBookUIAction(BookDatabaseImpl bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println("Enter Book's title: ");
        String title = new Scanner(System.in).nextLine();

        System.out.println("Enter Book's author: ");
        String author = new Scanner(System.in).nextLine();

        System.out.println("Enter Book's year issue: ");
        String year = new Scanner(System.in).nextLine();

        Book book = new Book(author,title,year);
        bookDatabase.save(book);
    }
}
