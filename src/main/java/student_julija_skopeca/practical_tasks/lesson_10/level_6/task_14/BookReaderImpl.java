package student_julija_skopeca.practical_tasks.lesson_10.level_6.task_14;

import java.util.ArrayList;

class BookReaderImpl implements BookReader {

    private Database database;

    public BookReaderImpl(Database database) {
        this.database = database;
    }

    @Override
    public boolean Add(Book book) {
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
    public boolean Delete(Book book) {
        if (database.CheckIfExists(book)) {
            database.Delete(book);

            return true;
        }

        return false;
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
}
