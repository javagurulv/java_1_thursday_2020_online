package student_vadims_vladisevs.lesson_10.level_6.task_17;

class BookReaderDemo {
    public static void main(String[] args) {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book firstBook = new Book("Ray Bradbury", "Fahrenheit 451");
        Book secondBook = new Book("Yevgeny Zamyatin", "We");
        Book thirdBook = new Book("George Orwell", "1984");
        Book fourthBook = new Book(null, "Brave New World");
        Book fifthBook = new Book("William Golding", null);

        Library library = new Library();

        bookReader.addBookToLibrary(firstBook, library);
        bookReader.addBookToLibrary(secondBook, library);
        bookReader.addBookToLibrary(thirdBook, library);
        bookReader.addBookToLibrary(firstBook,library);
        bookReader.addBookToLibrary(fourthBook, library);
        bookReader.addBookToLibrary(fifthBook, library);

        String[] list = bookReader.listOfBook(library);
        for (String temp : list){
            System.out.println(temp);
        }


    }
}
