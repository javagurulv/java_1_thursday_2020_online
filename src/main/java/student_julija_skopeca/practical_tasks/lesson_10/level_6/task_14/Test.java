package student_julija_skopeca.practical_tasks.lesson_10.level_6.task_14;

import java.util.ArrayList;
import java.util.Arrays;

class Test {
    Database database = new Database();

    public static void main(String[] args) {
        Test test = new Test();
        test.AddExistingBook();
        test.AddandCheck();
        test.IncompleteInfoAboutBook();
        test.DeleteExistingBook();
        test.DeleteNotExistingBook();
        test.PrintAllDatabase();
        test.SearchByAuthor();
        test.SearchByAuthorName();
        test.SearchByTitle();
        test.SearchByBookTitleByParts();
        test.SetBookAsFinished();
        test.PrintAllFinishedDatabase();
        test.PrintAllUnFinishedDatabase();
    }

    public void AddExistingBook() {
        BookReader bookreader = new BookReaderImpl(database);
        Book book1 = new Book("Title","John Smith");
        bookreader.add(book1);

        Book book2 = new Book("Title","John Smith");

        boolean result = bookreader.add(book2);

        if (result == true) {
            System.out.println("AddExistingBook test - fail");
        } else {
            System.out.println("AddExistingBook test - ok");
        }
    }

    public void AddandCheck() {
        BookReader bookreader = new BookReaderImpl(database);
        Book book1 = new Book("Title","John Smith");
        bookreader.add(book1);

        if (database.CheckIfExists(book1)) {
            System.out.println("AddandCheck test - ok");
        } else {
            System.out.println("AddandCheck test - fail");
        }
    }

    public void IncompleteInfoAboutBook() {
        BookReader bookreader = new BookReaderImpl(database);
        Book book1 = new Book("","");
        bookreader.add(book1);

        if (!database.CheckIfExists(book1)) {
            System.out.println("IncompleteInfoAboutBook test - ok");
        } else {
            System.out.println("IncompleteInfoAboutBook test - fail");
        }
    }

    public void DeleteExistingBook() {
        BookReader bookreader = new BookReaderImpl(database);
        Book book1 = new Book("Title","John Smith");
        bookreader.add(book1);
        bookreader.delete(book1);

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


        if (!bookreader.delete(book1)) {
            System.out.println("DeleteExistingBook test - ok");
        } else {
            System.out.println("DeleteExistingBook test - fail");
        }
    }

    public void PrintAllDatabase(){
        BookReader bookreader = new BookReaderImpl(database);
        Book book1 = new Book("Title","John Smith");
        bookreader.add(book1);

        Book book2 = new Book("Title2","John Smith");
        bookreader.add(book2);
        System.out.println(bookreader.PrintBookDatabase());
    }

    public void SearchByAuthor() {
        BookReader bookreader = new BookReaderImpl(database);
        Book book1 = new Book("Title","John Smith");
        bookreader.add(book1);

        Book book2 = new Book("Title2","John Smith");
        bookreader.add(book2);

        Book book3 = new Book("Title2","John Lenon");
        bookreader.add(book3);

        ArrayList<Book> result = bookreader.getByAuthor("John Smith");
        if (result.size() == 2) {
            System.out.println("SearchByAuthor test - ok");
        } else {
            System.out.println("SearchByAuthor test - fail");
        }
    }

    public void SearchByAuthorName() {
        BookReader bookreader = new BookReaderImpl(database);
        Book book1 = new Book("Title","John Smith");
        bookreader.add(book1);

        Book book2 = new Book("Title2","John Smith");
        bookreader.add(book2);

        Book book3 = new Book("Title2","John Lenon");
        bookreader.add(book3);

        ArrayList<Book> result = bookreader.getByAuthorName("John");
        if (result.size() == 3) {
            System.out.println("SearchByAuthorName test - ok");
        } else {
            System.out.println("SearchByAuthorName test - fail");
        }
    }

    public void SearchByTitle() {
        BookReader bookreader = new BookReaderImpl(database);
        Book book1 = new Book("Title","John Smith");
        bookreader.add(book1);

        Book book2 = new Book("Title2","John Smith");
        bookreader.add(book2);

        Book book3 = new Book("Title2","John Lenon");
        bookreader.add(book3);

        ArrayList<Book> result = bookreader.getByBookTitle("Title2");
        if (result.size() == 2) {
            System.out.println("SearchByTitle test - ok");
        } else {
            System.out.println("SearchByTitle test - fail");
        }
    }


    public void SearchByBookTitleByParts() {
        BookReader bookreader = new BookReaderImpl(database);
        Book book1 = new Book("Title","John Smith");
        bookreader.add(book1);

        Book book2 = new Book("Title2","John Smith");
        bookreader.add(book2);

        Book book3 = new Book("Title2","John Lenon");
        bookreader.add(book3);

        ArrayList<Book> result = bookreader.getByBookTitleByParts("Title");
        if (result.size() == 3) {
            System.out.println("SearchByBookTitleByParts test - ok");
        } else {
            System.out.println("SearchByBookTitleByParts test - fail");
        }
    }

    public void SetBookAsFinished() {
        BookReader bookreader = new BookReaderImpl(database);
        Book book1 = new Book("Title","John Smith");
        bookreader.add(book1);

        Book book2 = new Book("Title","John Smith");

        bookreader.add(book2);
        boolean result = bookreader.markAsFinished(book2);

        if (result == true) {
            System.out.println("SetBookAsFinished test - ok");
        } else {
            System.out.println("SetBookAsFinished test - fail");
        }
    }

    public void PrintAllFinishedDatabase(){
        BookReader bookreader = new BookReaderImpl(database);
        Book book1 = new Book("Title","John Smith");
        bookreader.add(book1);

        Book book2 = new Book("Title2","John Smith");
        bookreader.add(book2);
        bookreader.markAsFinished(book2);

        String[] result = bookreader.PrintFinishedBookDatabase();
        if (result.equals("Title2 [John Smith]")) {
            System.out.println("PrintAllFinishedDatabase test - ok");
        } else {
            System.out.println("PrintAllFinishedDatabase test - fail");
        }
    }

    public void PrintAllUnFinishedDatabase(){
        BookReader bookreader = new BookReaderImpl(database);
        Book book1 = new Book("Title","John Smith");
        bookreader.add(book1);

        Book book2 = new Book("Title2","John Smith");
        bookreader.add(book2);
        bookreader.markAsFinished(book2);

        String[] result = bookreader.PrintUnFinishedBookDatabase();
        if (result.equals("Title [John Smith]")) {
            System.out.println("PrintAllUnFinishedDatabase test - ok");
        } else {
            System.out.println("PrintAllUnFinishedDatabase test - fail");
        }
    }

  }
