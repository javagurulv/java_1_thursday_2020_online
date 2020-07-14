package student_vadims_vladisevs.lesson_11.level_6.task_38;

import java.util.List;
import java.util.Scanner;

class PrintAllBookUIAction implements UIAction{
    private BookDatabase bookDatabase;

    public PrintAllBookUIAction(BookDatabase bookDatabase){
        this.bookDatabase = bookDatabase;
    }


    @Override
    public void execute() {
        List<Book> list = bookDatabase.getBooks();
        printBookInfo(list);

    }

    private void printBookInfo(List<Book> list){
        for (Book book : list){
            System.out.println("[" + book.getId() + "] " + book.getAuthor() + " - " +
                    book.getTitle() + " (" + book.getYearOfIssue() + ")");
        }

    }
}
