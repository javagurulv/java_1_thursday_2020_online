package student_igors_mihejevs.lesson_11.homework.level_3;

class TitleSearchCriteria implements SearchCriteria {

    private final String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        return book.getTitle().equals(this.titleToSearch);
    }

}
