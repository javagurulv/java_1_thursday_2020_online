package student_alexander_bogachenkov.lesson10_02072020.homeworks.level_6.task_22;

import java.util.ArrayList;
import java.util.Arrays;
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
    public boolean markAsRead(Book book) {
        if (hasTheSameBook(book)) {
            book.markAsRead();
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

    @Override
    public List<Book> findBooksByTitle(String title) {
        List<Book> booksWithSameTitles = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title) || Arrays.equals(getFirstFourLetters(title), book.getFirstFourTitleLetters())) {
                booksWithSameTitles.add(book);
            }
        }
        return booksWithSameTitles;
    }

    @Override
    public List<Book> findBooksByAuthor(String author) {
        List<Book> booksWithSameAuthors = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author) || Arrays.equals(getFirstFourLetters(author), book.getFirstFourAuthorLetters())) {
                booksWithSameAuthors.add(book);
            }
        }
        return booksWithSameAuthors;
    }



    char[] getFirstFourLetters(String authorOrTitle) {
        String clearString = authorOrTitle.replaceAll("[^a-zA-Zа-яА-Я]", "");
        String lowercased = clearString.toLowerCase();
        char[] tempArray = lowercased.toCharArray();
        char[] result = new char[4];
        for (int i = 0; i < 4; i++) {
            result[i] = tempArray[i];
        }
        return result;
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
