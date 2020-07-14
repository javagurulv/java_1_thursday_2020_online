package student_vadims_vladisevs.lesson_11.level_6.task_36;

import java.util.Scanner;

class SaveBookUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase){
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println("Enter author mame: ");
        Scanner scr = new Scanner(System.in);
        String author = scr.nextLine();

        System.out.println("Enter book title: ");
        String title = scr.nextLine();

        System.out.println("Enter year of issue: ");
        String yearOfIssue = scr.nextLine();

        Book book = new Book(author,title,yearOfIssue);
        bookDatabase.save(book);
    }
}
