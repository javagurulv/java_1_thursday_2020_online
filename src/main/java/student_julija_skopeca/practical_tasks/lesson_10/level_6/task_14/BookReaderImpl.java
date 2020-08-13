package student_julija_skopeca.practical_tasks.lesson_10.level_6.task_14;

import java.util.ArrayList;
import java.util.List;

class BookReaderImpl implements BookReader {

    private Database database;

    public BookReaderImpl(Database database) {
        this.database = database;
    }

    @Override
    public boolean add(Book book) {
        if (book.getAuthor().isEmpty() || book.getTitle().isEmpty()){
            return false;
        }
        if (!database.CheckIfExists(book)) {
            database.Add(book);

            return true;
        }

        return false;
    }

    @Override
    public boolean delete(Book book) {
        if (database.CheckIfExists(book)) {
            database.Delete(book);

            return true;
        }

        return false;
    }

    @Override
    public boolean markAsFinished(Book book) {
        if (database.CheckIfExists(book)) {
            book.markAsFinished();
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String PrintBookDatabase() {
        StringBuilder b = new StringBuilder();
        for (Book book: database.GetAll()) {
            b.append(book.getTitle())
                    .append("[")
                    .append(book.getAuthor())
                    .append("]")
                    .append("\n");
        }
        return b.toString();
    }

    @Override
    public String[] PrintFinishedBookDatabase() {
        List<String> finishedBooks = new ArrayList<>();
        for (Book book: database.GetAll()){
            if (book.markAsFinished()){
                finishedBooks.add(book.getTitle()
                +" [" + book.getAuthor()
                +"]");
            }
        }
        return finishedBooks.toArray(new String[] {});
    }

    @Override
    public String[] PrintUnFinishedBookDatabase() {
        List<String> finishedBooks = new ArrayList<>();
        for (Book book: database.GetAll()){
            if (!book.markAsFinished()){
                finishedBooks.add(book.getTitle()
                        +" [" + book.getAuthor()
                        +"]");
            }
        }
        return finishedBooks.toArray(new String[] {});
    }

    @Override
    public ArrayList<Book> getByAuthor(String author) {
        return database.getByAuthor(author);
    }

    @Override
    public ArrayList<Book> getByAuthorName(String author) {
        return database.getByAuthorName(author);
    }

    @Override
    public ArrayList<Book> getByBookTitle(String title) {
        return database.getByBookTitle(title);
    }

    @Override
    public ArrayList<Book> getByBookTitleByParts(String title) {
        return database.getByBookTitleByParts(title);
    }


}
