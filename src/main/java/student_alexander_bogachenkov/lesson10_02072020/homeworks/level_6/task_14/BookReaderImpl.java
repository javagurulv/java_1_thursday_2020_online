package student_alexander_bogachenkov.lesson10_02072020.homeworks.level_6.task_14;

import java.util.ArrayList;

class BookReaderImpl implements BookReader {

	// List<Book> ...
    ArrayList<Book> books = new ArrayList<>();

    @Override
    public boolean addBook(Book book) {
        if (!hasTheSameBook(book)) {
            books.add(book);
            return true;
        } else {
            return false;
        }
    }

    private boolean hasTheSameBook(Book book) {
        for (Book value : books) {
            if (value.equals(book)) {
                return true;
            }
        }
        return false;
    }

    ArrayList<Book> getBooks() {
        return books;
    }
}
