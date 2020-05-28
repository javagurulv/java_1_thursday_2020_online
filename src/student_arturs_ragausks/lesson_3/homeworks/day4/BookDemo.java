package student_arturs_ragausks.lesson_3.homeworks.day4;

import student_arturs_ragausks.lesson_3.homeworks.day4.Book;

public class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }


}
