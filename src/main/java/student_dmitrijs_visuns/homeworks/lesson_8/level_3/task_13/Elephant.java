package student_dmitrijs_visuns.homeworks.lesson_8.level_3.task_13;

class Elephant extends Animal {

    public Elephant(String species, boolean canFly, boolean canSwim) {
        super();

    }

    public void feed() {
        System.out.println("Elephant is eating!");
    }


    public static void main(String[] args) {
        Elephant Dumbo = new Elephant("Elephantidae", true, false);
        Dumbo.feed();

    }

}