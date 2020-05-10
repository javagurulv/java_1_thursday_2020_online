package student_igors_mihejevs.lesson_3.day_5.task_18;

public class Dog {

    private String name;

    public void dogName() {
        this.name = "Viking";
    }

    public void voice() {
        int counter;
        for (counter = 1; counter <= 3; counter++) {
            System.out.println(this.name);
        }
    }

}
