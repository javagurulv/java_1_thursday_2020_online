package student_dmitrijs_visuns.homeworks.lesson_10.level_6.task_17;

import java.util.ArrayList;
import java.util.List;

class BookReaderImpl implements BookReader {

    List<Book> readerLibrary = new ArrayList<>();

    @Override
    public String [] getBooksListFromLibrary () {
        String [] booksListFromLibrary = new String[readerLibrary.size()];
        for (int i = 0; i < readerLibrary.size(); i++) {
            booksListFromLibrary[i] = readerLibrary.get(i).getBookTitle()
                    + " [" + readerLibrary.get(i).getBookAuthor()
                    + "]";
        } return booksListFromLibrary;

    }

    @Override
    public boolean addBookToLibrary (Book book) {
        if ((hasSameBookInLibrary(book)) ||
           (!bookHasTitle(book)) ||
           (!bookHasAuthor(book)) ) {
            return false;
        } else {
            readerLibrary.add(book);
            return true;
        }
    }

    @Override
    public boolean removeBookFromLibrary (Book book) {
        if (hasSameBookInLibrary(book)) {
            readerLibrary.remove(book);
            return true;
        } else {
            return false;
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

    private boolean bookHasAuthor (Book book) {
        return (!book.getBookAuthor().isBlank());
    }

    private boolean bookHasTitle (Book book) {
        return (!book.getBookTitle().isBlank());
    }


}


