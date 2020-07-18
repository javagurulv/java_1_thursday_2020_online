package student_vadims_vladisevs.lesson_11.level_6.task_35;

class DeleteByIdUIActionDemo {
    public static void main(String[] args) {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        UIAction deleteByIdUIAction = new DeleteByIdUIAction(bookDatabase);
        UIAction saveBookUIAction = new SaveBookUIAction(bookDatabase);
        saveBookUIAction.execute();
        saveBookUIAction.execute();
        saveBookUIAction.execute();
        deleteByIdUIAction.execute();
    }
}
