package student_igors_mihejevs.lesson_11.homework.level_6.uiaction;

import student_igors_mihejevs.lesson_11.homework.level_6.BookDatabase;

public class FindUniqueTitlesUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public FindUniqueTitlesUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        System.out.println("Finding unique titles from database :");
        for (String author : bookDatabase.findUniqueTitles()) {
            System.out.println(author);
        }
    }

}
