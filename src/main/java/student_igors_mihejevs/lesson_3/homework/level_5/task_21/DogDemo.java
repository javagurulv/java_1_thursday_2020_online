package student_igors_mihejevs.lesson_3.homework.level_5.task_21;

class DogDemo {

    public static void main(String[] args) {
        Dog myDog = new Dog("Viking", 5, "Ginger");

        myDog.voice();
        System.out.println("\nAfter one year :");
        myDog.happyBirthday();
        myDog.voice();
    }

}
