package student_dmitrijs_visuns.homeworks.lesson_8.level_3.task_13;

class Dolphin extends Animal{

    public Dolphin (String species, boolean canFly, boolean canSwim) {
        super();

    }

    public void feed() {
        System.out.println("Dolphin eats tasty fish!");
    }


    public static void main(String[] args) {
        Dolphin Boris = new Dolphin ("Delphinidae", false, true);
        Boris.feed();

    }


}
