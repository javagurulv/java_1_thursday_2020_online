package student_julija_skopeca.practical_tasks.lesson_10.level_6.task_14;

class BookReaderImpl implements BookReader {

    private Database database;

    public BookReaderImpl(Database database) {
        this.database = database;
    }

    @Override
    public boolean Add(Book book) {
        if (!database.CheckIfExists(book)) {
            database.Add(book);

            return true;
        }

        return false;
    }
}
