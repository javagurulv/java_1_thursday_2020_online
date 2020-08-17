package student_igors_mihejevs.lesson_10.homework.level_6;

import java.util.ArrayList;
import java.util.List;

class BookReaderImpl implements BookReader {

    List<Book> eLibrary = new ArrayList<>();

    @Override
    public boolean addBook (Book book) {
        if (bookAlreadyInELibrary(book) || bookTitleIsBlank(book) || bookAuthorIsBlank(book))
            return false;
        else {
            eLibrary.add(book);
            return true;
        }
    }

    @Override
    public boolean removeBook (Book book) {
        if (bookAlreadyInELibrary(book)) {
            eLibrary.remove(book);
            return true;
        }
        return false;
    }

    private boolean bookAlreadyInELibrary(Book book) {
        for (Book books : eLibrary) {
            if (books.getBookTitle().equals(book.getBookTitle()) &&
                    books.getBookAuthor().equals(book.getBookAuthor()))
                return true;
        }
        return false;
    }

    private boolean bookTitleIsBlank(Book book) {
        return (book.getBookTitle().isBlank());
    }

    private boolean bookAuthorIsBlank(Book book) {
        return (book.getBookAuthor().isBlank());
    }

}