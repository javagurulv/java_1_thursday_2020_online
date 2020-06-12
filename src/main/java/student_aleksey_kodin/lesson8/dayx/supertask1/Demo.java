package student_aleksey_kodin.lesson8.dayx.supertask1;


class Demo {
    public static void main(String[] args) {
        Library library = new Library();
        DatesUsingBook datesUsingBook = new DatesUsingBook();

        Reader reader = new Reader(1,"Alex","Petrov");
        Reader reader1 = new Reader(2,"User","Unknown");

        Book book_1 = new Book("Tolstoy","War and Peace");
        Book book_2 = new Book("Chehov","Roman");

        library.addBook(book_1);
        library.addBook(book_2);
        library.addBook(new Book("Pushkin","Onegin"));

        library.addReader(reader);
        library.addReader(reader1);

        datesUsingBook.setDateWhenTakeBook(2020,6,20);
        datesUsingBook.setDateWhenReturnBook(15);
        library.readerTakeBook(reader,book_1,datesUsingBook);

        datesUsingBook.setDateWhenTakeBook(2020,6,25);
        datesUsingBook.setDateWhenReturnBook(20);
        library.readerTakeBook(reader,book_2,datesUsingBook);

        datesUsingBook.setDateWhenTakeBook(2020,6,30);
        datesUsingBook.setDateWhenReturnBook(21);
        library.readerTakeBook(reader,new Book("Pushkin","Onegin"),datesUsingBook);

    }
}
