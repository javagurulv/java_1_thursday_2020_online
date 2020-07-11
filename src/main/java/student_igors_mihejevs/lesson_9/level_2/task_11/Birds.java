package student_igors_mihejevs.lesson_9.level_2.task_11;

class Birds extends Animal {

    protected Birds(int numberOfLegs) {
        super(numberOfLegs);
    }

    public static void main(String[] args) {

        Animal animal = new Animal(2);
        System.out.println("Birds have " + animal.numberOfLegs + " legs");
    }

}
