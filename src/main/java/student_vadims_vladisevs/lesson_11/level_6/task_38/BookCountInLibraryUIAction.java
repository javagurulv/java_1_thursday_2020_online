package student_vadims_vladisevs.lesson_11.level_6.task_38;


class BookCountInLibraryUIAction implements UIAction{
     private BookDatabase bookDatabase;

     public BookCountInLibraryUIAction(BookDatabase bookDatabase){
         this.bookDatabase = bookDatabase;
     }


     @Override
     public void execute() {
         System.out.println("Books in library - [" + bookDatabase.countAllBooks() + "]");
     }

}
