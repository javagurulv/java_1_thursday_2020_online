package student_vadims_vladisevs.lesson_10.level_6.task_14;

import java.util.ArrayList;

class Library {
    private ArrayList<Book> books;

    public Library(){
        this.books = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void printBooksInLibrary(){
        int bookNumber = 0;
        System.out.println("Books in library: ");
        for (Book book : getBooks()){
            bookNumber++;
            System.out.print(bookNumber + ". ");
            System.out.print("Book author: " + book.getAuthor());
            System.out.println(". Book title: " + book.getTitle());
        }
    }
}
