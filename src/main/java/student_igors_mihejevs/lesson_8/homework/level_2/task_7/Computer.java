package student_igors_mihejevs.lesson_8.homework.level_2.task_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Computer {

    private String model;
    private String manufacturer;

    public Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }
}
