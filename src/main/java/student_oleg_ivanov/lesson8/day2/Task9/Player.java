package student_oleg_ivanov.lesson8.day2.Task9;

/*      Внесите изменения в код программы так,
        чтобы можно было создать экземпляр класса
        ComputerPlayer. Класс ComputerPlayer должен
        наследоваться от класса Player. Изменения
        в код можно вносить только в класс ComputerPlayer.
 */

class Player {
    private String name;

    Player(String name) {
        this.name = name;
    }

}

class ComputerPlayer extends Player{
    ComputerPlayer(String name) {
        super(name);
    }

}
