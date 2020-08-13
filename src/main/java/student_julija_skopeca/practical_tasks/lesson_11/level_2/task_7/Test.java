package student_julija_skopeca.practical_tasks.lesson_11.level_2.task_7;

class Test {

    public static void main(String[] args) {
        Test test = new Test();
        test.deleteBookTrue();
        test.deleteBookFalse();
    }

    void deleteBookTrue(){
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Title1", "Author1");
        bookDatabase.save(book1);

        boolean result = bookDatabase.delete(1l);

        if (result == true) {
            System.out.println("deleteBookTrue test - ok");
        } else {
            System.out.println("deleteBookTrue test - fail");
        }
    }

    void deleteBookFalse(){
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Title1", "Author1");
        bookDatabase.save(book1);

        boolean result = bookDatabase.delete(2l);

        if (result == false) {
            System.out.println("deleteBookFalse test - ok");
        } else {
            System.out.println("deleteBookFalse test - fail");
        }
    }


}
