package student_aleksey_kodin.lesson8.day2.task_8;

class Player {
    private String name;

    Player(String name) {
        this.name = name;
    }

}

class HumanPlayer extends Player {

    HumanPlayer(String name) {
        super("Player");
    }
}
