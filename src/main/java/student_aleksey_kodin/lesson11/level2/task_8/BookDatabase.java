package student_aleksey_kodin.lesson11.level2.task_8;

interface BookDatabase {

    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);
}
