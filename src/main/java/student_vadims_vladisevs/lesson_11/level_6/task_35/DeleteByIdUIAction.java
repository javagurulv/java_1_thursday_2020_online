package student_vadims_vladisevs.lesson_11.level_6.task_35;

import java.util.List;
import java.util.Scanner;

class DeleteByIdUIAction implements UIAction{
    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase){
        this.bookDatabase = bookDatabase;
    }


    @Override
    public void execute() {
        System.out.println("Delete by Id: ");
        Scanner scr = new Scanner(System.in);
        Long bookId = scr.nextLong();

        bookDatabase.delete(bookId);
        printBookInfo(bookDatabase.getBooks());

    }

    private void printBookInfo(List<Book> list){
        for (Book book : list){
            System.out.println("[" + book.getId() + "] " + book.getAuthor() + " - " +
                    book.getTitle() + " (" + book.getYearOfIssue() + ")");
        }
    }
}
