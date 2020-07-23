package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_6.task_38;

import java.util.Scanner;
import java.util.Set;

class FindUniqueAuthorsUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUniqueAuthorsUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Set<String> uniqueAuthors = bookDatabase.findUniqueAuthors();
        for (String author : uniqueAuthors) {
            System.out.println(author);
        }
    }
}
