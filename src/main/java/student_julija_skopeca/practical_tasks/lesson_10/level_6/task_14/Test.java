package student_julija_skopeca.practical_tasks.lesson_10.level_6.task_14;

class Test {
    Database database = new Database();

    public static void main(String[] args) {
        Test test = new Test();
        test.AddExistingBook();
        test.AddandCheck();
        test.IncompleteInfoAboutBook();
        test.DeleteExistingBook();
        test.DeleteNotExistingBook();
    }

    public void AddExistingBook() {
        BookReader bookreader = new BookReaderImpl(database);
        Book book1 = new Book("Title","John Smith");
        bookreader.Add(book1);

        Book book2 = new Book("Title","John Smith");

        boolean result = bookreader.Add(book2);

        if (result == true) {
            System.out.println("AddExistingBook test - fail");
        } else {
            System.out.println("AddExistingBook test - ok");
        }
    }

    public void AddandCheck() {
        BookReader bookreader = new BookReaderImpl(database);
        Book book1 = new Book("Title","John Smith");
        bookreader.Add(book1);

        if (database.CheckIfExists(book1)) {
            System.out.println("AddandCheck test - ok");
        } else {
            System.out.println("AddandCheck test - fail");
        }
    }

    public void IncompleteInfoAboutBook() {
        BookReader bookreader = new BookReaderImpl(database);
        Book book1 = new Book("","");
        bookreader.Add(book1);

        if (!database.CheckIfExists(book1)) {
            System.out.println("IncompleteInfoAboutBook test - ok");
        } else {
            System.out.println("IncompleteInfoAboutBook test - fail");
        }
    }

    public void DeleteExistingBook() {
        BookReader bookreader = new BookReaderImpl(database);
        Book book1 = new Book("Title","John Smith");
        bookreader.Add(book1);
        bookreader.Delete(book1);

        if (!database.CheckIfExists(book1)) {
            System.out.println("DeleteExistingBook test - ok");
        } else {
            System.out.println("DeleteExistingBook test - fail");
        }
    }

    public void DeleteNotExistingBook() {
        BookReader bookreader = new BookReaderImpl(database);
        Book book1 = new Book("Title","John Smith");
        //bookreader.Add(book1);


        if (!bookreader.Delete(book1)) {
            System.out.println("DeleteExistingBook test - ok");
        } else {
            System.out.println("DeleteExistingBook test - fail");
        }
    }

}
