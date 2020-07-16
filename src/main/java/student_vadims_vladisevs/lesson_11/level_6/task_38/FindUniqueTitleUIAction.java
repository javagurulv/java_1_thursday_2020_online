package student_vadims_vladisevs.lesson_11.level_6.task_38;

import java.util.Set;

class FindUniqueTitleUIAction implements UIAction{

    private BookDatabase bookDatabase;

    public FindUniqueTitleUIAction(BookDatabase bookDatabase){
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {

        Set<String> list = bookDatabase.findUniqueTitles();
        printBookInfo(list);
    }

    private void printBookInfo(Set<String> list){
        int titleCount = 0;
        for (String title : list){
            titleCount++;
            System.out.println("[" + titleCount + "] " + title);
        }
    }
}
