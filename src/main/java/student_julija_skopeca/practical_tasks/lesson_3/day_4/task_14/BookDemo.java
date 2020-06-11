package student_julija_skopeca.practical_tasks.lesson_3.day_4.task_14;

import student_julija_skopeca.practical_tasks.lesson_3.day_4.task_14.Book;

 class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }
}
