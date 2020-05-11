package student_igors_mihejevs.lesson_3.day_5.task_20;

public class DogDemo {

    public static void main(String[] args) {
        Dog myDog = new Dog("Viking", 5);

        myDog.voice();
        System.out.println("\nAfter one year :");
        myDog.happyBirthday();
        myDog.voice();
    }

}
