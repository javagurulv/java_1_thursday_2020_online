package student_aleksey_kodin.lessonx.bowling_game.logic;

import java.util.Random;

public class Roll {
    private boolean attemptInFrame = true;

    public int getRoll() {
        return new Random().nextInt(11);
    }

    public int getRoll(int offset) {
        return new Random().nextInt(11 - offset);
    }

    public boolean isFirstAttemptInFrame() {
        return attemptInFrame;
    }

    public void setAttemptInFrame(boolean attemptInFrame) {
        this.attemptInFrame = attemptInFrame;
    }

    private void changeAttemptStatus(boolean firstAttemptInFrame) {
        firstAttemptInFrame = !firstAttemptInFrame;
    }
}
