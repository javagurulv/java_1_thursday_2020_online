package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_6.task_38;

import java.util.Set;

class FindUniqueTitlesUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUniqueTitlesUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Set<String> uniqueTitles = bookDatabase.findUniqueTitles();
        for (String title : uniqueTitles) {
            System.out.println(title);
        }
    }
}
