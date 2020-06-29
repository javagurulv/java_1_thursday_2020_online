package student_aleksey_kodin.lesson10.level6.task_18;

import student_aleksey_kodin.lesson10.level6.task_18.logic.LogicChecks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class BookReaderImpl implements BookReader {
    private final List<Book> books = new ArrayList<>();

    @Override
    public boolean addBook(Book book) {
        boolean isBookExisting = LogicChecks.isBookExists(books, book);

        if (isBookExisting) {
            return false;
        }

        boolean isBookAuthorNotEmpty = LogicChecks.isBookAuthorNotEmpty(book);
        boolean isBookTitleNotEmpty = LogicChecks.isBookTitleNotEmpty(book);

        if (isBookAuthorNotEmpty && isBookTitleNotEmpty) {
            books.add(book);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteBook(Book book) {
        boolean isBookExisting = LogicChecks.isBookExists(books, book);

        if (!isBookExisting) {
            return false;
        }
        books.remove(book);
        return true;
    }

    @Override
    public String[] createBookList() {
        String[] bookList = new String[books.size()];

        for (int i = 0; i < bookList.length; i++) {
            bookList[i] = books.get(i).getBookName() + " [" + books.get(i).getBookAuthor() + "]";
        }
        return bookList;
    }

    @Override
    public List<Book> searchForBooksByAuthor(String authorName) {

        return books.stream().filter(b -> b.getBookAuthor().equals(authorName))
                .collect(Collectors.toList());
    }
}
