package student_igors_mihejevs.lesson_11.homework.level_3;

class AuthorSearchCriteria implements SearchCriteria {

    private final String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    public boolean match(Book book) {
        return book.getAuthor().equals(this.authorToSearch);
    }

}
