package student_igors_mihejevs.lesson_10.homework.level_6;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class BookReaderImpl implements BookReader {

	@CodeReviewComment(teacher = "May be private field instead of default level access?")
    List<Book> eLibrary = new ArrayList<>();

    @Override
    public boolean addBook(Book book) {
        if (bookAlreadyInELibrary(book) || bookTitleIsBlank(book) || bookAuthorIsBlank(book))
            return false;
        else {
            eLibrary.add(book);
            return true;
        }
    }

    @Override
    public boolean removeBook(Book book) {
        if (bookAlreadyInELibrary(book)) {
            eLibrary.remove(book);
            return true;
        }
        return false;
    }

    @Override
    public boolean MarkBookAsAlreadyRead(Book book) {
        if (bookAlreadyInELibrary(book)) {
            eLibrary.get(0).setAlreadyRead(true);
            return true;
        }
        return false;
    }

    @Override
    public boolean MarkBookAsNotRead(Book book) {
        if (bookAlreadyInELibrary(book)) {
            eLibrary.get(0).setAlreadyRead(false);
            return true;
        }
        return false;
    }

    @Override
    public String[] listOfAllBooks() {
        String[] allBooks = new String[eLibrary.size()];
        for (int i = 0; i < eLibrary.size(); i++) {
            allBooks[i] = eLibrary.get(i).getBookTitle() + " [" + eLibrary.get(i).getBookAuthor() + "]";
        }
        return allBooks;
    }

    @Override
    public String[] listOfAllReadBooks() {
        String[] allReadBooks = new String[eLibrary.size()];
        for (int i = 0; i < eLibrary.size(); i++) {
            if (eLibrary.get(i).isAlreadyRead()) {
                allReadBooks[i] = eLibrary.get(i).getBookTitle() + " [" + eLibrary.get(i).getBookAuthor() + "]";
            }
        }
        return allReadBooks;
    }

    @Override
    public String[] listOfAllNotReadBooks() {
        String[] allNotReadBooks = new String[eLibrary.size()];
        for (int i = 0; i < eLibrary.size(); i++) {
            if (!eLibrary.get(i).isAlreadyRead()) {
                allNotReadBooks[i] = eLibrary.get(i).getBookTitle() + " [" + eLibrary.get(i).getBookAuthor() + "]";
            }
        }
        return allNotReadBooks;
    }

    @Override
    public List<Book> listByAuthorOrContainsPartOfAuthorName(String author) {
        List<Book> byAuthorBooks = new ArrayList<>();
        for (Book books : eLibrary) {
            if ((books.getBookAuthor().equals(author)) || (books.getBookAuthor().contains(author))) {
                byAuthorBooks.add(books);
            }
        }
        return byAuthorBooks;
    }

    @Override
    public List<Book> listByTitleOrContainsPartOfTitle(String title) {
        List<Book> byTitleBooks = new ArrayList<>();
        for (Book books : eLibrary) {
            if ((books.getBookTitle().equals(title)) || (books.getBookTitle().contains(title))) {
                byTitleBooks.add(books);
            }
        }
        return byTitleBooks;
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