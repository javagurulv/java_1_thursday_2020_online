package student_julija_skopeca.practical_tasks.lesson_3.day_5.task_18;

public class Dog {

    public final String name;

    public Dog(String petName){
        this.name = petName;
    }

        public void voice(){

        for (int a = 0; a < 3; a++)
        System.out.print(this.name + " ");
    }

}
