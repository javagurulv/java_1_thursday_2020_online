package student_julija_skopeca.practical_tasks.lesson_11.level_2.task_8;

class Test {

    public static void main(String[] args) {
        Test test = new Test();
        test.deleteBookTrue();
    }

    void deleteBookTrue(){
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Title1", "Author1");
        bookDatabase.save(book1);

        boolean result = bookDatabase.delete(book1);

        if (result == true) {
            System.out.println("deleteBookTrue test - ok");
        } else {
            System.out.println("deleteBookTrue test - fail");
        }
    }


}
