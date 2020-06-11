package student_aleksey_kodin.lesson8.javaguru.lv.moodle.level1;

class Cat extends Mammal {
    void hunt() {
        System.out.println("Кот охотиться на мышей");
    }

    @Override
    void drink() {
        System.out.println("Кот пьёт молоко");
    }

    @Override
    public String toString() {
        return "Cat";
    }
}
