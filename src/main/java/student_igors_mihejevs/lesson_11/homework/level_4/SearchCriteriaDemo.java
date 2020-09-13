package student_igors_mihejevs.lesson_11.homework.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class SearchCriteriaDemo {

    public static void main(String[] args) {
        SearchCriteriaDemo demo = new SearchCriteriaDemo();

        // автор книги "Kuper" и название "Zveroboi"
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1890");
        SearchCriteria searchCriteria1 = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria searchCriteria2 = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        SearchCriteria searchCriteria3 = new OrSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);

        Book book1 = (new Book("Kuper", "Zveroboi", "1890"));
        Book book2 = (new Book("Not Kuper", "Zveroboi", "1890"));
        Book book3 = (new Book("Kuper", "Not Zveroboi", "1890"));
        Book book4 = (new Book("Kuper", "Zveroboi", "Not 1890"));
        Book book5 = (new Book("Not Kuper", "Not Zveroboi", "Not 1890"));

        demo.checkingConditionsOK(searchCriteria1, book1, "First");
        demo.checkingConditionsNotOK(searchCriteria1, book2, "First");
        demo.checkingConditionsNotOK(searchCriteria1, book3, "First");

        //автор книги "Kuper" и год выпуска 1890
        demo.checkingConditionsOK(searchCriteria2, book1, "Second");
        demo.checkingConditionsNotOK(searchCriteria2, book2, "Second");
        demo.checkingConditionsNotOK(searchCriteria2, book4, "Second");

        //автор книги "Kuper" или год выпуска 1890 или название "Zveroboi"
        if ((searchCriteria3.match(book1)) || (titleSearchCriteria.match(book1)))
            System.out.println("Third condition - OK");
        else System.out.println("Third condition - Error");
        if (!((searchCriteria3.match(book5)) || (titleSearchCriteria.match(book5))))
            System.out.println("Third condition - OK");
        else System.out.println("Third condition - Error");
    }

    public void checkingConditionsOK(SearchCriteria searchCriteria, Book book, String conditionName) {
        if (searchCriteria.match(book)) System.out.println(conditionName + " condition - OK");
        else System.out.println(conditionName + " condition - Error");
    }
    public void checkingConditionsNotOK(SearchCriteria searchCriteria, Book book, String conditionName) {
        if (!searchCriteria.match(book)) System.out.println(conditionName + " condition - OK");
        else System.out.println(conditionName + " condition - Error");
    }

}
