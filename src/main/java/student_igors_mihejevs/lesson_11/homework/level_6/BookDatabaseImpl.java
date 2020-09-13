package student_igors_mihejevs.lesson_11.homework.level_6;

import java.util.*;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class BookDatabaseImpl implements BookDatabase {
    private Long id = 1L;
    private final List<Book> booksList = new ArrayList<>();

    @Override
    public Long save(Book book) {
        book.setId(id);
        booksList.add(book);
        return ++id;
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book book : booksList) {
            if (book.getId().equals(bookId)) {
                booksList.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        for (Book books : booksList) {
            if ((books.getAuthor().equals(book.getAuthor())) && (books.getTitle().equals(book.getTitle()))) {
                booksList.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : booksList) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> booksFoundByAuthor = new ArrayList<>();
        for (Book book : booksList) {
            if (book.getAuthor().equals(author)) {
                booksFoundByAuthor.add(book);
            }
        }
        return booksFoundByAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> booksFoundByTitle = new ArrayList<>();
        for (Book book : booksList) {
            if (book.getTitle().equals(title)) {
                booksFoundByTitle.add(book);
            }
        }
        return booksFoundByTitle;
    }

    @Override
    public int countAllBooks() {
        return booksList.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        booksList.removeIf(books -> (books.getAuthor().equals(author)));
    }

    @Override
    public void deleteByTitle(String title) {
        booksList.removeIf(books -> (books.getTitle().equals(title)));
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> booksFoundBySearchCriteria = new ArrayList<>();
        for (Book book : booksList) {
            if (searchCriteria.match(book)) {
                booksFoundBySearchCriteria.add(book);
            }
        }
        return booksFoundBySearchCriteria;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> uniqueAuthors = new HashSet<>();
        for (Book book : booksList) {
            uniqueAuthors.add(book.getAuthor());
        }
        return uniqueAuthors;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> uniqueTitles = new HashSet<>();
        for (Book book : booksList) {
            uniqueTitles.add(book.getTitle());
        }
        return uniqueTitles;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        return new HashSet<>(booksList);
    }

    @Override
    public boolean contains(Book book) {
        for (Book books : booksList) {
            if ((books.getAuthor().equals(book.getAuthor()))
                    && (books.getTitle().equals(book.getTitle())) && (books.getYearOfIssue().equals(book.getYearOfIssue()))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> authorToBooksMap = new HashMap<>();
        for (Book book : booksList) {
            authorToBooksMap.put(book.getAuthor(), findByAuthor(book.getAuthor()));
        }
        return authorToBooksMap;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> authorToBooksCount = new HashMap<>();
        for (Book book : booksList) {
            authorToBooksCount.put(book.getAuthor(), findByAuthor(book.getAuthor()).size());
        }
        return authorToBooksCount;
    }

}
