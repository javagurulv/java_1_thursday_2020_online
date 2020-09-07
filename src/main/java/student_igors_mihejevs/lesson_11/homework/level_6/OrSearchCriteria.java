package student_igors_mihejevs.lesson_11.homework.level_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class OrSearchCriteria implements SearchCriteria {

    private final SearchCriteria leftCondition;
    private final SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    @Override
    public boolean match(Book book) {
        return (this.leftCondition.match(book)) || (this.rightCondition.match(book));
    }

}
