package student_oleg_ivanov.lesson8.day2.Task8;
//Исправьте код программы так, что бы он компилировался.
// Изменения можно вносить только в класс HumanPlayer.

class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }

}

class HumanPlayer extends Player {

    HumanPlayer(String name) {
        super(name);

    }

}