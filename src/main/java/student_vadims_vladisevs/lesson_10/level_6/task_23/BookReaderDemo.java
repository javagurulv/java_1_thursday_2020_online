package student_vadims_vladisevs.lesson_10.level_6.task_23;

class BookReaderDemo {
    public static void main(String[] args) {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book firstBook = new Book("Ray Bradbury", "Fahrenheit 451");
        Book secondBook = new Book("Yevgeny Zamyatin", "We");
        Book thirdBook = new Book("George Orwell", "1984");
        Book fourthBook = new Book("Ray Bradbury", "Dandelion Wine");
        Book fifthBook = new Book("Ray Bradbury", "The Martian Chronicles");

        Library library = new Library();

        bookReader.addBookToLibrary(firstBook, library);
        bookReader.addBookToLibrary(secondBook, library);
        bookReader.addBookToLibrary(thirdBook, library);
        bookReader.addBookToLibrary(fourthBook, library);


        bookReader.completedRead(firstBook, library);
        System.out.println("First book is read: " + firstBook.isRead());

        bookReader.notCompletedRead(firstBook, library);
        bookReader.notCompletedRead(fifthBook,library);
        System.out.println("First book is read: " + fifthBook.isRead());
        System.out.println("Fifth books is read: " + fifthBook.isRead());

    }
}
