package student_igors_mihejevs.lesson_8.homework.level_1.task_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BookDemo {

    public static void main(String[] args) {
        Book book = new Book();

        System.out.println(book.name);
        System.out.println(book.numberOfPages);
    }

}
