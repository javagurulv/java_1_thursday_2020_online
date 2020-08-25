package student_igors_mihejevs.lesson_11.homework.level_2;

public interface BookDatabase {

    Long save(Book book);

    boolean delete(Long bookId);

}
