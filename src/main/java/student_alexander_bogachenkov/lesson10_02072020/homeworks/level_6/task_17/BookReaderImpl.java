package student_alexander_bogachenkov.lesson10_02072020.homeworks.level_6.task_17;

import java.util.ArrayList;
import java.util.List;

class BookReaderImpl implements BookReader {

    List<Book> books = new ArrayList<>();

    @Override
    public boolean addBook(Book book) {
        if ((!hasTheSameBook(book)) && (indicatedTitle(book)) && (indicatedAuthor(book))) {
            books.add(book);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteBook(Book book) {
        if (hasTheSameBook(book)) {
            books.remove(book);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String[] getAllBooks() {
        String[] allBooks = new String[books.size()];
        for (int i = 0; i < books.size(); i++) {
            allBooks[i] = books.get(i).getTitle() + " [" + books.get(i).getAuthor() + "] ";
        }
        return allBooks;
    }


    private boolean hasTheSameBook(Book book) {
        for (Book value : books) {
            if (value.equals(book)) {
                return true;
            }
        }
        return false;
    }

    private boolean indicatedTitle(Book book) {
        return book.getTitle() != null && !book.getTitle().equals("");
    }

    private boolean indicatedAuthor(Book book) {
        return book.getAuthor() != null && !book.getAuthor().equals("");
    }

    List<Book> getBooks() {
        return books;
    }
}
