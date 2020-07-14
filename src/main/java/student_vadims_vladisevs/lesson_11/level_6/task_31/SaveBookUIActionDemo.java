package student_vadims_vladisevs.lesson_11.level_6.task_31;

class SaveBookUIActionDemo {
    public static void main(String[] args) {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        UIAction saveBookUIAction = new SaveBookUIAction(bookDatabase);
        saveBookUIAction.execute();
        saveBookUIAction.execute();
        saveBookUIAction.execute();

        System.out.println("Book count: " + bookDatabase.countAllBooks());

    }
}
