package student_alexander_bogachenkov.lesson11_09072020.homeworks.level_2.task_7;

interface BookDatabase {

    Long save(Book book);

    boolean delete(Long bookId);


}
