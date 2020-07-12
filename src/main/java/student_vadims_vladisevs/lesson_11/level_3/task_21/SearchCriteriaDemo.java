package student_vadims_vladisevs.lesson_11.level_3.task_21;

class SearchCriteriaDemo {
    public static void main(String[] args) {

        Book book = new Book("Kuper", "Zveroboi", "1890");

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1890");

        SearchCriteria andSearchCriteriaAT = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria andSearchCriteriaAY = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        SearchCriteria andSearchCriteriaTY = new AndSearchCriteria(titleSearchCriteria, yearOfIssueSearchCriteria);

        SearchCriteria orSearchCriteriaAT = new AndSearchCriteria(authorSearchCriteria,titleSearchCriteria);
        SearchCriteria orSearchCriteriaAY = new AndSearchCriteria(authorSearchCriteria,yearOfIssueSearchCriteria);
        SearchCriteria orSearchCriteriaYT = new AndSearchCriteria(yearOfIssueSearchCriteria,titleSearchCriteria);





    }
}
