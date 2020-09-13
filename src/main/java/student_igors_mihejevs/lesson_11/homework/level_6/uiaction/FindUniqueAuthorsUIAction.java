package student_igors_mihejevs.lesson_11.homework.level_6.uiaction;

import student_igors_mihejevs.lesson_11.homework.level_6.BookDatabase;

public class FindUniqueAuthorsUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public FindUniqueAuthorsUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        System.out.println("Finding unique authors from database :");
        for (String author : bookDatabase.findUniqueAuthors()) {
            System.out.println(author);
        }
    }

}
