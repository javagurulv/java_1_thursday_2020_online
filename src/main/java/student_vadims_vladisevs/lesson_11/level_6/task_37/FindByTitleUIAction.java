package student_vadims_vladisevs.lesson_11.level_6.task_37;

import java.util.List;
import java.util.Scanner;

class FindByTitleUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase){
        this.bookDatabase = bookDatabase;
    }


    @Override
    public void execute() {
        System.out.println("Find by title: ");
        Scanner scr = new Scanner(System.in);
        String title = scr.nextLine();

        List<Book> list = bookDatabase.findByTitle(title);
        printBookInfo(list);

    }

    private void printBookInfo(List<Book> list){
        for (Book book : list){
            System.out.println("[" + book.getId() + "] " + book.getAuthor() + " - " +
                    book.getTitle() + " (" + book.getYearOfIssue() + ")");
        }
    }
}
