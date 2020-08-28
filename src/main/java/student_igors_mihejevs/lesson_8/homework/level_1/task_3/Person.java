package student_igors_mihejevs.lesson_8.homework.level_1.task_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Person {

    private String fullName;
    private int age;
    private Address address;

    public void printPersonArguments() {
        System.out.println(fullName);
        System.out.println(age);
        System.out.println(address);
    }

}
