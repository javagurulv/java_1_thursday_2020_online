package student_aleksey_kodin.lesson8.javaguru.lv.moodle.level1;

class Parrot extends  Bird {

    void speak() {
        System.out.println("Попугай может научиться разговаривать");
    }

    @Override
    void eat() {
        System.out.println("Попугай ест фрукты");
    }

    @Override
    public String toString() {
        return "Parrot";
    }
}
