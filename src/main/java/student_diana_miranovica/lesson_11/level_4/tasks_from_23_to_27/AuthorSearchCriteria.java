package student_diana_miranovica.lesson_11.level_4.tasks_from_23_to_27;

public class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {

        this.authorToSearch = authorToSearch;
    }

    public boolean match(Book book) {
        return book.getAuthor().equals(this.authorToSearch);
    }
}
