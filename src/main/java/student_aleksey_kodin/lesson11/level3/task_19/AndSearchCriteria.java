package student_aleksey_kodin.lesson11.level3.task_19;

class AndSearchCriteria implements SearchCriteria {
    private final SearchCriteria leftCondition;
    private final SearchCriteria rightCondition;

    public AndSearchCriteria(SearchCriteria leftCondition,
                             SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    @Override
    public boolean match(Book book) {
        return leftCondition.match(book) && rightCondition.match(book);
    }
}
