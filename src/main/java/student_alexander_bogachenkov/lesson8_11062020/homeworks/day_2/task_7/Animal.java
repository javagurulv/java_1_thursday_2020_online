package student_alexander_bogachenkov.lesson8_11062020.homeworks.day_2.task_7;

class Animal {

    String brain;
    String heart;

    Animal(String brain, String heart) {
        this.brain = brain;
        this.heart = heart;
    }

}

class Cat extends Animal {

    String tail;

    Cat(String brain, String heart, String tail) {
        //при создании объекта класса-потомка сначала вызывается конструктор базового класса.
        super(brain, heart);
        this.tail = tail;
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Мозг", "Сердце", "Хвост");
    }
}