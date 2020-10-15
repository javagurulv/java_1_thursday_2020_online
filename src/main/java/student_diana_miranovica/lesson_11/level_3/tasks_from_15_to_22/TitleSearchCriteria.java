package student_diana_miranovica.lesson_11.level_3.tasks_from_15_to_22;

 class TitleSearchCriteria implements SearchCriteria{

     private String titleToSearch;

     public TitleSearchCriteria(String titleToSearch) {
         this.titleToSearch = titleToSearch;
     }

     public boolean match(Book book) {
         return book.getTitle().equals(this.titleToSearch);
     }
}
