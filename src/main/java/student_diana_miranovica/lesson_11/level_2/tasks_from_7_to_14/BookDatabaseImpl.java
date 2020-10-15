package student_diana_miranovica.lesson_11.level_2.tasks_from_7_to_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookDatabaseImpl implements BookDatabase {

    private final List<Book> books = new ArrayList<>();
    private long lastId = 0;

    @Override
    public Long save (Book book){
        long id = nextId();
        book.setId(id);
        this.books.add(book);
        return id;

    }

    private long nextId() {
        return ++lastId;
    }

    private boolean hasTheSameBook(Book book){
    for(Book value : books){
        if(value.equals(book)){
            return true;
        }
    }
    return false;
    }



    @Override
    public boolean delete(Book book) {
        if (hasTheSameBook(book)) {
            books.remove(book);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        if (hasTheSameId(bookId)){
            for (Book book : books){
                if( book.getId().equals(bookId)){
                    return Optional.of(book);
                }
            }
            return Optional.empty();
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book>allBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                allBooks.add(book);
            }
        }
        return allBooks;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book>allBooks = new ArrayList<>();
        for (Book book : books){
            if (book.getTitle().equals(title)) {
                allBooks.add(book);
            }
        }
        return allBooks;
    }

    @Override
    public int countAllBooks() {
        return books.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        books.removeIf(book -> book.getAuthor().equals(author));
    }

    @Override
    public void deleteByTitle(String title) {
        books.removeIf(book -> book.getTitle().equals(title));
    }


    @Override
    public boolean delete(Long bookId){
        if(hasTheSameId(bookId)){
            for (Book book : books){
                if (book.getId().equals(bookId)){
                    books.remove(book);
                    return true;
                }
            }
            return  false;
        }
        return false;
     }

     private boolean hasTheSameId(Long bookId){
        for (Book book : books) {
            if(book.getId().equals(bookId)){
                return true;
            }
        }
        return false;
     }

     public List<Book> getBooks(){
        return books;
     }


    public long getLastId() {
        return lastId;
    }
}
