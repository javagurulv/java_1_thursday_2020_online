package student_aleksey_kodin.lesson11.level5.task_28;

class AuthorSearchCriteria implements SearchCriteria {
    private final String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    public boolean match(Book book) {
        return book.getAuthor().equals(authorToSearch);
    }
}
