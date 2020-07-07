package student_aleksey_kodin.lesson11.level5.task_28;

class YearOfIssueSearchCriteria implements SearchCriteria {
    private final String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getYearOfIssue().equals(yearOfIssueToSearch);
    }
}
