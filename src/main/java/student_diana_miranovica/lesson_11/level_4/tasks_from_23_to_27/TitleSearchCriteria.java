package student_diana_miranovica.lesson_11.level_4.tasks_from_23_to_27;

class TitleSearchCriteria implements SearchCriteria {

     private String titleToSearch;

     public TitleSearchCriteria(String titleToSearch) {
         this.titleToSearch = titleToSearch;
     }

     public boolean match(Book book) {
         return book.getTitle().equals(this.titleToSearch);
     }
}
