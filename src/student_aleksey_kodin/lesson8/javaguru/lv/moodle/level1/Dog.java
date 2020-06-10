package student_aleksey_kodin.lesson8.javaguru.lv.moodle.level1;

class Dog extends Mammal {

    void guard() {
        System.out.println("Собака охраняет дом");
    }

    @Override
    void drink() {
        System.out.println("Собака пьёт воду");;
    }

    @Override
    public String toString() {
        return "Dog";
    }
}
