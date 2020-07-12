package student_vadims_vladisevs.lesson_11.level_1.task_5;

import java.util.ArrayList;
import java.util.List;

class BookListContainsDemo {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

       Book firstBook = new Book("First Author", "First Title");
       Book secondBook = new Book("Second Author", "Second Title");
       Book thirdBook = new Book("Third Author", "Third Title");
       Book fourthBook = new Book("Fourth Author", "Fourth Title");
       Book fifthBook = new Book("Fifth Author", "Fifth Title");

       books.add(firstBook);
       books.add(secondBook);
       books.add(thirdBook);


       System.out.println("Is first book in list  = " + books.contains(firstBook));
       System.out.println("Is fourth book in list  = " + books.contains(fourthBook));


         }



}
