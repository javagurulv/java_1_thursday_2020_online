package student_aleksey_kodin.lesson11.level3.task_21;

class SearchCriteriaDemo {

    SearchCriteria author = new AuthorSearchCriteria("Author#1");
    SearchCriteria title = new TitleSearchCriteria("Title#1");
    SearchCriteria year = new YearOfIssueSearchCriteria("2015");

    SearchCriteria authorAndTitle = new AndSearchCriteria(author,title);
    SearchCriteria authorAndYear = new AndSearchCriteria(author,year);
    SearchCriteria titleAndYear = new AndSearchCriteria(title,year);

    SearchCriteria authorOrTitle = new OrSearchCriteria(author,title);
    SearchCriteria authorOrYear = new OrSearchCriteria(author,year);
    SearchCriteria titleOrYear = new OrSearchCriteria(title,year);
}
