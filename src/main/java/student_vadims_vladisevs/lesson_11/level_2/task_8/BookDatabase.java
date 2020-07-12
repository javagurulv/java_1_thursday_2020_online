package student_vadims_vladisevs.lesson_11.level_2.task_8;

interface BookDatabase {
    Long save(Book book);
    boolean delete(Long bookId);
    boolean delete(Book book);
}
