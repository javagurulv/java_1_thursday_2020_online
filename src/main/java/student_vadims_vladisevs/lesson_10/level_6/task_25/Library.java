package student_vadims_vladisevs.lesson_10.level_6.task_25;


import java.util.ArrayList;
import java.util.List;

class Library {

	// List<Book> ...
	private List<Book> books;

    public Library(){
        this.books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public int getBookIndex(Book book){
        int index= 0;
        for (int i = 0; i < books.size(); i++){
            if (books.get(i).getAuthor().equals(book.getAuthor()) && books.get(i).getTitle().equals(book.getTitle())){
                return i;
            }
        }
        return index;
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
