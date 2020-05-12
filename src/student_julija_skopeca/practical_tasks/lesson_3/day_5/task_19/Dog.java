package student_julija_skopeca.practical_tasks.lesson_3.day_5.task_19;

public class Dog {

    private final String name;

    private int age;

    public Dog(String petName,
               int petAge) {
        this.name = petName;
        this.age = petAge;}

        public void voice () {
        System.out.print("Pet name - " + this.name + ". "
                        + "Age - " + this.age + " year/s.");
        }
}
