package student_vadims_vladisevs.lesson_11.level_4.task_26;

class SearchCriteriaDemo {
    public static void main(String[] args) {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book firstBook = new Book("Erich Maria Remarque", "Three Comrades", "1936");
        Book secondBook = new Book("William Golding", "Lord of the Flies", "1954");
        Book thirdBook = new Book("Douglas Adams", "The Hitchhiker`s Guide to the Galaxy", "1985");
        Book fourthBook = new Book("Chuck Palahniuk", "Fight Club", "1996");
        Book fifthBook = new Book("Erich Maria Remarque", "Arch of Triumph", "1945");

        bookDatabase.save(firstBook);
        bookDatabase.save(secondBook);
        bookDatabase.save(thirdBook);
        bookDatabase.save(fourthBook);
//        bookDatabase.save(fifthBook);

        System.out.println(bookDatabase.contains(firstBook));
        System.out.println(bookDatabase.contains(fifthBook));


    }
}
