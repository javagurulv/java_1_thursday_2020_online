package student_aleksey_kodin.lesson11.level4.task_23;

class AuthorSearchCriteria implements SearchCriteria {
    private final String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    public boolean match(Book book) {
        return book.getAuthor().equals(authorToSearch);
    }
}
