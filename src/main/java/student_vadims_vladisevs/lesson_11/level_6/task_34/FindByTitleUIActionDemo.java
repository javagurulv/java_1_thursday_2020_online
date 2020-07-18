package student_vadims_vladisevs.lesson_11.level_6.task_34;

class FindByTitleUIActionDemo {
    public static void main(String[] args) {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        UIAction findByTitleUIAction = new FindByTitleUIAction(bookDatabase);
        UIAction saveBookUIAction = new SaveBookUIAction(bookDatabase);
        saveBookUIAction.execute();
        saveBookUIAction.execute();
        saveBookUIAction.execute();
        findByTitleUIAction.execute();
    }
}
