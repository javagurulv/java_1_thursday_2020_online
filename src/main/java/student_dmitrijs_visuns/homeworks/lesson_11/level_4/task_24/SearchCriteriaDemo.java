package student_dmitrijs_visuns.homeworks.lesson_11.level_4.task_24;

class SearchCriteriaDemo {

    public static void main(String[] args) {

        Book book1 = new Book("Kuper", "Zveroboi", "1890");
        Book book2 = new Book("Fenimor", "Zveroboi", "1890");

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearOfIssueCriteria = new YearOfIssueSearchCriteria("1890");

        SearchCriteria searchCriteria1 = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        System.out.println("book1 matches author AND title search criteria: " + searchCriteria1.match(book1));
        System.out.println("author match: " + authorSearchCriteria.match(book1));
        System.out.println("title match: " + titleSearchCriteria.match(book1));
        System.out.println("");

        SearchCriteria searchCriteria2 = new AndSearchCriteria(authorSearchCriteria, yearOfIssueCriteria);
        System.out.println("book1 matches author AND year of issue search criteria: " + searchCriteria2.match(book1));
        System.out.println("author match: " + authorSearchCriteria.match(book1));
        System.out.println("year match: " + yearOfIssueCriteria.match(book1));
        System.out.println("");

        SearchCriteria searchCriteria3 = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        System.out.println("book2 matches author OR title search criteria: " + searchCriteria3.match(book2));
        System.out.println("author match: " + authorSearchCriteria.match(book2));
        System.out.println("title match: " + titleSearchCriteria.match(book2));
        System.out.println("");

        SearchCriteria searchCriteria4 = new OrSearchCriteria(authorSearchCriteria, yearOfIssueCriteria);
        System.out.println("book2 matches author OR year of issue search criteria: " + searchCriteria4.match(book2));
        System.out.println("author match: " + authorSearchCriteria.match(book2));
        System.out.println("year match: " + yearOfIssueCriteria.match(book2));
        System.out.println("");

    }

}
