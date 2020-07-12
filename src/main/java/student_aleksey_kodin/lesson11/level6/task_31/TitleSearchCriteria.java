package student_aleksey_kodin.lesson11.level6.task_31;

class TitleSearchCriteria implements SearchCriteria {
    private final String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getTitle().equals(titleToSearch);
    }
}
