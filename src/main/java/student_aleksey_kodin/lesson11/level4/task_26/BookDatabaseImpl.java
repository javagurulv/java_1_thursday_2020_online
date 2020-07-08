package student_aleksey_kodin.lesson11.level4.task_26;


import java.util.*;
import java.util.stream.Collectors;

class BookDatabaseImpl implements BookDatabase {
    private final List<Book> books = new ArrayList<>();
    private Long id = 0L;

    @Override
    public Long save(Book book) {
        book.setId(++id);
        books.add(book);
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        return books.removeIf(b -> b.getId().equals(bookId));
    }

    @Override
    public boolean delete(Book book) {
        return books.remove(book);
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        return books.stream().filter(b -> b.getId().equals(bookId)).findFirst();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return books.stream().filter(b -> b.getAuthor().equals(author)).collect(Collectors.toList());
    }

    @Override
    public List<Book> findByTitle(String title) {
        return books.stream().filter(b -> b.getTitle().equals(title)).collect(Collectors.toList());
    }

    @Override
    public int countAllBooks() {
        return books.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        books.removeAll(findByAuthor(author));
    }

    @Override
    public void deleteByTitle(String title) {
        books.removeAll(findByTitle(title));
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> searchBooks = new ArrayList<>();

        books.forEach(book -> {
            if (searchCriteria.match(book)) {
                searchBooks.add(book);
            }
        });
        return searchBooks;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> authors = new HashSet<>();
        books.forEach(b -> authors.add(b.getAuthor()));
        return authors;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> titles = new HashSet<>();
        books.forEach(b -> titles.add(b.getTitle()));
        return titles;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        return new HashSet<>(books);
    }

    @Override
    public boolean contains(Book book) {
        return book.getId() != null;
    }
}
