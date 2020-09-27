package student_aleksey_kodin.lessonx.bowling_game;

import student_aleksey_kodin.lessonx.bowling_game.domain.Ball;
import student_aleksey_kodin.lessonx.bowling_game.logic.Roll;

import java.util.ArrayList;
import java.util.List;

class GameImpl implements Game {
    private final List<Ball> allBallsInGame = new ArrayList<>();
    private final Roll roll;
    private boolean isGameFinished = false;
    private int numberOfFrame = 0;
    private int frameNumberOfPins = 10;

    GameImpl(Roll roll) {
        this.roll = roll;
    }

    @Override
    public void roll(int numberOfPins) {

        frameNumberOfPins -= numberOfPins;

        allBallsInGame.add(new Ball(numberOfPins));

        if (isStrike(numberOfPins) && roll.isFirstAttemptInFrame()) {
            frameNumberOfPins = 10;
            roll.setAttemptInFrame(true);
            return;
        }

        if (isSpare(numberOfPins)) {
            frameNumberOfPins = 10;
            roll.setAttemptInFrame(false);
            return;
        }

        if (roll.isFirstAttemptInFrame()) {
            roll.setAttemptInFrame(false);
            return;
        }

        roll.setAttemptInFrame(true);
        numberOfFrame++;
        checkIsGameFinished();
    }

    @Override
    public int score() {
        return allBallsInGame.stream().map(Ball::getScore).reduce(Integer::sum).orElse(0);
    }

    public boolean isGameFinished() {
        return isGameFinished;
    }

    public int getNumberOfFrame() {
        return numberOfFrame;
    }

    public int getFrameNumberOfPins() {
        return frameNumberOfPins;
    }

    private boolean isStrike(int numberOfPins) {
        final int STRIKE = 10;
        return numberOfPins == STRIKE;
    }

    private boolean isSpare(int numberOfPins) {
        final int SPARE = 10;
        return numberOfPins + getLastBallScoreInFrame() == SPARE;
    }

    private void checkIsGameFinished() {
        final int END_GAME = 10;
        if (numberOfFrame == END_GAME) {
            isGameFinished = true;
        }
    }

    private int getLastBallScoreInFrame() {
        int score;
        try {
            score = allBallsInGame.get(allBallsInGame.size() - 2).getScore();
        } catch (IndexOutOfBoundsException e) {
            return 0;
        }
        return score;
    }
}