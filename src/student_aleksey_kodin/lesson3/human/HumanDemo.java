package student_aleksey_kodin.lesson3.human;

public class HumanDemo {

    public static void main(String[] args) {

        Human man = new Human("John",20);
        Human women = new Human("Maria",25);

        man.greet();
        women.greet();
    }
}
