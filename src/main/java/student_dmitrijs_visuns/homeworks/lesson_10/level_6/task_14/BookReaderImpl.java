package student_dmitrijs_visuns.homeworks.lesson_10.level_6.task_14;

import java.util.ArrayList;
import java.util.List;

class BookReaderImpl implements BookReader {

    List<Book> readerLibrary = new ArrayList<>();

    @Override
    public boolean addBookToLibrary (Book book) {
        if (hasSameBookInLibrary(book)) {
            return false;
        } else {
            readerLibrary.add(book);
            return true;
        }
    }

    private boolean hasSameBookInLibrary (Book book) {
        for (Book eachBook : readerLibrary) {
            if (eachBook.getBookAuthor().equals(book.getBookAuthor())
            && (eachBook.getBookTitle().equals(book.getBookTitle()))) {
               return true;
           }
       } return false;
    }


}


