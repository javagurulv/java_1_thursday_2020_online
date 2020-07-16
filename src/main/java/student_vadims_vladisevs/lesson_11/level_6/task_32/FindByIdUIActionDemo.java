package student_vadims_vladisevs.lesson_11.level_6.task_32;

public class FindByIdUIActionDemo {
    public static void main(String[] args) {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        UIAction findByIdUIAction = new FindByIdUIAction(bookDatabase);
        UIAction saveBookUIAction = new SaveBookUIAction(bookDatabase);
        saveBookUIAction.execute();
        saveBookUIAction.execute();
        saveBookUIAction.execute();
        findByIdUIAction.execute();
    }
}
