package student_diana_miranovica.lesson_8.home_works.day_2.task_9;

import java.awt.*;

 class Player {
    private String name;

    Player(String name) {
        this.name = name;
    }
}
class ComputerPlayer extends Player {

     ComputerPlayer(String name) {
        super("Oby Wan");
    }
}
