package student_diana_miranovica.lesson_11.level_4.tasks_from_23_to_27;

public class SearchCriteriaDemo {

    public static void main(String[] args) {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Herrad Meese");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Deutsch - warum nicht?");
        SearchCriteria yearSearchCriteria = new YearOfIssueSearchCriteria("2003");

        SearchCriteria authorAndYear = new AndSearchCriteria(authorSearchCriteria, yearSearchCriteria);
        SearchCriteria titleAndYear = new AndSearchCriteria(titleSearchCriteria, yearSearchCriteria);
        SearchCriteria authorAndTitle = new AndSearchCriteria(authorSearchCriteria, yearSearchCriteria);

        SearchCriteria authorOrYear = new OrSearchCriteria(authorSearchCriteria, yearSearchCriteria);
        SearchCriteria titleOrYear = new OrSearchCriteria(titleSearchCriteria, yearSearchCriteria);
        SearchCriteria authorOrTitle = new OrSearchCriteria(authorSearchCriteria, yearSearchCriteria);

        System.out.println(authorAndTitle);
        System.out.println(authorOrTitle);
        System.out.println(authorAndYear);
        System.out.println(authorOrYear);
        System.out.println(titleAndYear);
        System.out.println(titleOrYear);


    }
}
