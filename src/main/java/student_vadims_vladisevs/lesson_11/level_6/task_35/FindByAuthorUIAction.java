package student_vadims_vladisevs.lesson_11.level_6.task_35;

import java.util.List;
import java.util.Scanner;

class FindByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase){
        this.bookDatabase = bookDatabase;
    }


    @Override
    public void execute() {
        System.out.println("Find by author: ");
        Scanner scr = new Scanner(System.in);
        String author = scr.nextLine();

        List<Book> list = bookDatabase.findByAuthor(author);
        printBookInfo(list);

    }

    private void printBookInfo(List<Book> list){
        for (Book book : list){
            System.out.println("[" + book.getId() + "] " + book.getAuthor() + " - " +
                    book.getTitle() + " (" + book.getYearOfIssue() + ")");
        }
    }
}
