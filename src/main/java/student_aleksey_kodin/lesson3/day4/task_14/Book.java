package student_aleksey_kodin.lesson3.day4.task_14;
/* Найти ошибку в коде.
   Исправить и запустить программу. */

class Book {
    private final String title;

    public Book(String bookTitle) {
        this.title = bookTitle;
    }

    public String getTitle() {
        return this.title;
    }

}

class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }

}

