package student_dmitrijs_visuns.homeworks.lesson_11.level_4.task_23;

class AndSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public AndSearchCriteria(SearchCriteria leftCondition,
                             SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    @Override
    public boolean match(Book book) {
        return this.leftCondition.match(book) && this.rightCondition.match(book);
    }

}