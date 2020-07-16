package student_vadims_vladisevs.lesson_11.level_6.task_38;

import java.util.List;
import java.util.Scanner;

class DeleteByTitleUIAction implements UIAction{
    private BookDatabase bookDatabase;

    public DeleteByTitleUIAction(BookDatabase bookDatabase){
        this.bookDatabase = bookDatabase;
    }


    @Override
    public void execute() {
        System.out.println("Find by author: ");
        Scanner scr = new Scanner(System.in);
        String title = scr.nextLine();
         bookDatabase.deleteByTitle(title);
    }

}
