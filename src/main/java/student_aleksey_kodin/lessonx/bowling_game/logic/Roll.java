package student_aleksey_kodin.lessonx.bowling_game.logic;

import java.util.Random;

public class Roll {
    private boolean attemptInFrame = true;

    public int getRoll(int offset) {
        return new Random().nextInt(offset + 1);
    }

    public boolean isFirstAttemptInFrame() {
        return attemptInFrame;
    }

    public void setAttemptInFrame(boolean attemptInFrame) {
        this.attemptInFrame = attemptInFrame;
    }
}
