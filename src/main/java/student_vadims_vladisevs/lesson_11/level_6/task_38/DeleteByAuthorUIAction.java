package student_vadims_vladisevs.lesson_11.level_6.task_38;

import java.util.List;
import java.util.Scanner;

class DeleteByAuthorUIAction implements UIAction{
    private BookDatabase bookDatabase;

    public DeleteByAuthorUIAction(BookDatabase bookDatabase){
        this.bookDatabase = bookDatabase;
    }


    @Override
    public void execute() {
        System.out.println("Find by author: ");
        Scanner scr = new Scanner(System.in);
        String author = scr.nextLine();

        bookDatabase.deleteByAuthor(author);
    }


}
