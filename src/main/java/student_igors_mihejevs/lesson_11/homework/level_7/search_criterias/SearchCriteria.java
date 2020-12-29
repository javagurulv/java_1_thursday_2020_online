package student_igors_mihejevs.lesson_11.homework.level_7.search_criterias;

import student_igors_mihejevs.lesson_11.homework.level_7.domain.Book;

public interface SearchCriteria {

    boolean match(Book book);

}
