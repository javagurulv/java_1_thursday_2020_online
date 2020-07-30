package student_igors_mihejevs.lesson_3.homework.level_5.task_22;

class DogDemo {

    // Demo of two dogs

    public static void main(String[] args) {
        Dog myDog1 = new Dog("Viking", 5, "Ginger");
        Dog myDog2 = new Dog("Roger", 2, "White");

        myDog1.voice();
        myDog2.voice();
        System.out.println("\nAfter one year :");
        myDog1.happyBirthday();
        myDog2.happyBirthday();
        myDog1.voice();
        myDog2.voice();
        System.out.println("\nAfter changing color :");
        myDog1.changeColor("Black");
        myDog1.voice();
        myDog2.changeColor("Red");
        myDog2.voice();
    }

}
