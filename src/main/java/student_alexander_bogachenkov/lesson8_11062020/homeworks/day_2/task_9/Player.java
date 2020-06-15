package student_alexander_bogachenkov.lesson8_11062020.homeworks.day_2.task_9;

class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }

}

class ComputerPlayer extends Player {

    public ComputerPlayer(String name) {
        super(name);
    }

}