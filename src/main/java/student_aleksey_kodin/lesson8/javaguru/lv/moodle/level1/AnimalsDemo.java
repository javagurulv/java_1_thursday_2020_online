package student_aleksey_kodin.lesson8.javaguru.lv.moodle.level1;

class AnimalsDemo {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Parrot parrot = new Parrot();

        System.out.println(cat.toString() + " это животное. Потому что:");
        cat.reproduction();
        cat.breath();
        cat.feed();
        cat.hunt();
        cat.drink();
        System.out.println("------------------------");
        System.out.println(dog.toString() + " это животное. Потому что:");
        dog.reproduction();
        dog.breath();
        dog.feed();
        dog.guard();
        dog.drink();
        System.out.println("------------------------");
        System.out.println(parrot.toString() + " это животное. Потому что:");
        parrot.reproduction();
        parrot.breath();
        parrot.fly();
        parrot.speak();
        parrot.eat();
    }


}
