package student_diana_miranovica.lesson_11.level_4.tasks_from_23_to_27;

class YearOfIssueSearchCriteria implements SearchCriteria {

    private final String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        return book.getYearOfIssue().equals(this.yearOfIssueToSearch);
    }
}
