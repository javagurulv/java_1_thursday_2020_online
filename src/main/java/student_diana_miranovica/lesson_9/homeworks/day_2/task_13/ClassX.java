package student_diana_miranovica.lesson_9.homeworks.day_2.task_13;

public class ClassX {
    public ClassX(int i) {
        System.out.println(1);
    }
}
class ClassY extends ClassX {
    public ClassY(int i) {
        super(i);
        System.out.println(2);
    }
}
