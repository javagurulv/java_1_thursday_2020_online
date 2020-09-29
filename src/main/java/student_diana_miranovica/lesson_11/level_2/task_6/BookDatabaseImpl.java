package student_diana_miranovica.lesson_11.level_2.task_6;

import java.util.ArrayList;
import java.util.List;

public class BookDatabaseImpl implements BookDatabase{

    private final List<Book> books = new ArrayList<>();
    private long lastId = 0;

    @Override
    public Long save (Book book){
        long id = nextId();
        book.setId(id);
        this.books.add(book);
        return id;

    }

    @Override
    public boolean delete(Long bookId) {
        return false;
    }

    private Long nextId(){
        return ++lastId;
     }

     @Override
    public boolean deleteBook(Long bookId){
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
}
