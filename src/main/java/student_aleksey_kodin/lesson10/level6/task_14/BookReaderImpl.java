package student_aleksey_kodin.lesson10.level6.task_14;

import student_aleksey_kodin.lesson10.level6.task_14.logic.LogicChecks;

import java.util.ArrayList;
import java.util.List;

class BookReaderImpl implements BookReader {
    private final List<Book> books = new ArrayList<>();

    @Override
    public boolean addBook(Book book) {
        boolean isBookExisting = LogicChecks.isBookExists(books,book);

        if (isBookExisting) {
            return false;
        }
        books.add(book);
        return true;
    }
}
