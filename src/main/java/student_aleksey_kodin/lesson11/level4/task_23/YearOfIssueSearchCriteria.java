package student_aleksey_kodin.lesson11.level4.task_23;

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
