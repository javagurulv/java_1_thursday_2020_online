package student_aleksey_kodin.lesson3.javagurulv.moodle.human;

class HumanDemo {

    public static void main(String[] args) {

        Human man = new Human("John",20);
        Human women = new Human("Maria",25);

        man.greet();
        women.greet();
    }
}
