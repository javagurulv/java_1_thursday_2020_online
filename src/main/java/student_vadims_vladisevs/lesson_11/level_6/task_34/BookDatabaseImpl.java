package student_vadims_vladisevs.lesson_11.level_6.task_34;

import java.util.*;

class BookDatabaseImpl implements BookDatabase {

    List<Book> books = new ArrayList<>();
    Long bookId = 0L;

    @Override
    public Long save(Book book) {
        bookId += 1;
        book.setId(bookId);
        books.add(book);
        return bookId;
    }

    @Override
    public boolean delete(Long bookId) {
        if (isBookInList(bookId)) {
            books.remove(getBookIndexFromListById(bookId));
            return true;
        }
        return false;
    }

    private int getBookIndexFromListById(Long bookId) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId().equals(bookId)) {
                return i;
            }
        }
        return 0;
    }

    private boolean isBookInList(Long bookId) {
        for (Book tempBook : books) {
            if (tempBook.getId().equals(bookId)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean delete(Book book) {
        if (isBookInList(book)) {
            books.remove(getBookIndexFromListByBook(book));
            return true;
        }
        return false;
    }

    private int getBookIndexFromListByBook(Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).equals(book)) {
                return i;
            }
        }
        return 0;
    }

    private boolean isBookInList(Book book) {
        for (Book tempBook : books) {
            if (tempBook.equals(book)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        if (isBookInList(bookId)){
            return Optional.of(books.get(getBookIndexFromListById(bookId)));
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> list = new ArrayList<>();

        for (Book book : books){
            if (book.getAuthor().equals(author)){
                list.add(book);
            }
        }
        return list;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> list = new ArrayList<>();

        for (Book book : books){
            if (book.getTitle().equals(title)){
                list.add(book);
            }
        }
        return list;
    }

    @Override
    public int countAllBooks() {
        return books.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        List<Book> list = findByAuthor(author);
        books.removeAll(list);
    }

    @Override
    public void deleteByTitle(String title) {
        List<Book> list = findByTitle(title);
        books.removeAll(list);
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> list = new ArrayList<>();
        for (Book book : books){
            if (searchCriteria.match(book)){
                list.add(book);
            }
        }
        return list;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> list = new HashSet<>();
        for (Book book : books){
            list.add(book.getAuthor());
        }
        return list;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> list = new HashSet<>();
        for (Book book : books){
            list.add(book.getTitle());
        }
        return list;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        return new HashSet<>(books);
    }

    @Override
    public boolean contains(Book book) {
        return book.getId() != null;
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> map = new HashMap<>();
        for (Book book : books){
            List<Book> allBooks = find(new AuthorSearchCriteria(book.getAuthor()));
            map.put(book.getAuthor(), allBooks);
        }
        return map;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> map = new HashMap<>();
        for (Book book : books){
            List<Book> authorBooks = findByAuthor(book.getAuthor());
            map.put(book.getAuthor(), authorBooks.size());
        }
        return map;
    }


}