package student_aleksey_kodin.lessonx.bowling_game;

import student_aleksey_kodin.lessonx.bowling_game.logic.Report;
import student_aleksey_kodin.lessonx.bowling_game.logic.Roll;

public class GameDemo {

    public static void main(String[] args) {
        Roll roll = new Roll();
        Report report = new Report();
        GameImpl game = new GameImpl(roll, report);

        while (!game.isGameFinished()) {
            int pin = roll.getRoll(game.getFrameNumberOfPins());
            game.roll(pin);
        }
        report.showReport();
        System.out.println("Game score: " + game.score());
    }
}
