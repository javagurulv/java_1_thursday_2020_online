package student_igors_mihejevs.lesson_11.homework.level_7.search_criterias;

import student_igors_mihejevs.lesson_11.homework.level_7.domain.Book;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class AuthorSearchCriteria implements SearchCriteria {

    private final String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getAuthor().equals(this.authorToSearch);
    }

}
