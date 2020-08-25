package student_igors_mihejevs.lesson_11.homework.level_2;

class BookDemo {

    public static void main(String[] args) {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

        bookDatabase.save(new Book("Kathy Sierra, Bert Bates", "Head First Java"));
        bookDatabase.save(new Book("Robert C. Martin", "Clean Code"));
        bookDatabase.save(new Book("Kathy Sierra, Bert Bates", "Head First Java"));
        bookDatabase.save(new Book("Joshua Bloch", "Effective Java"));
        System.out.println(bookDatabase.save(new Book("Joshua Bloch", "Effective Java")));
    }

}
