package student_igors_mihejevs.lesson_3.day_5.task_20;

public class DogDemo {

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.dogName("Viking");
        myDog.dogAge(5);
        myDog.voice();
        System.out.println("\nAfter one year");
        System.out.println("--------------");
        myDog.happyBirthday();
        myDog.voice();
    }

}
