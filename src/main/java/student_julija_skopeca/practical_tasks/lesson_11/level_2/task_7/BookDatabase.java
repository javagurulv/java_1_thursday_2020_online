package student_julija_skopeca.practical_tasks.lesson_11.level_2.task_7;

interface BookDatabase {

    Long save(Book book);

    boolean delete(Long bookId);

}
