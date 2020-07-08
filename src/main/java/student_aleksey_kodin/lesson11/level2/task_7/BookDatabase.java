package student_aleksey_kodin.lesson11.level2.task_7;

interface BookDatabase {

    Long save(Book book);

    boolean delete(Long bookId);
}
