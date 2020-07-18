package student_vadims_vladisevs.lesson_11.level_6.task_38;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

class FindUniqueAuthorUIAction implements UIAction{
    private BookDatabase bookDatabase;

    public FindUniqueAuthorUIAction(BookDatabase bookDatabase){
        this.bookDatabase = bookDatabase;
    }


    @Override
    public void execute() {

        Set<String> list = bookDatabase.findUniqueAuthors();
        printBookInfo(list);
    }

    private void printBookInfo(Set<String> list){
        int authorCount = 0;
        for (String author : list){
            authorCount++;
            System.out.println("[" + authorCount + "] " + author);
        }
    }
}
