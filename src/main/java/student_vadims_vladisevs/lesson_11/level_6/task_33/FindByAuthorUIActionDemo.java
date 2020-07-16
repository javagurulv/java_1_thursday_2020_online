package student_vadims_vladisevs.lesson_11.level_6.task_33;

class FindByAuthorUIActionDemo {
    public static void main(String[] args) {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        UIAction findByAuthorUIAction = new FindByAuthorUIAction(bookDatabase);
        UIAction saveBookUIAction = new SaveBookUIAction(bookDatabase);
        saveBookUIAction.execute();
        saveBookUIAction.execute();
        saveBookUIAction.execute();
        findByAuthorUIAction.execute();
    }
}
