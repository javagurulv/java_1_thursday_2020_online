package student_aleksey_kodin.lessonx.bowling_game;

import student_aleksey_kodin.lessonx.bowling_game.domain.Ball;
import student_aleksey_kodin.lessonx.bowling_game.logic.Report;
import student_aleksey_kodin.lessonx.bowling_game.logic.Roll;

import java.util.ArrayList;
import java.util.List;

class GameImpl implements Game {
    private final List<Ball> allBallsInGame = new ArrayList<>();
    private final Roll roll;
    private final Report report;
    private boolean isGameFinished = false;
    private int numberOfFrame = 1;
    private int frameNumberOfPins = 10;
    private int extraBalls;
    private boolean isUseExtraBalls = false;

    GameImpl(Roll roll, Report report) {
        this.roll = roll;
        this.report = report;
        roll.setAttemptInFrame(true);
    }

    @Override
    public void roll(int numberOfPins) {

        report.addStringToReport("Frame " + numberOfFrame + ": " + numberOfPins + "\n");

        frameNumberOfPins -= numberOfPins;

        if (extraBalls > 1) {
            allBallsInGame.add(new Ball(numberOfPins));
            extraBalls--;
            isUseExtraBalls = true;
            return;
        } else {
            extraBalls = 0;
            allBallsInGame.add(new Ball(numberOfPins));
        }

        if (isStrike(numberOfPins) && roll.isFirstAttemptInFrame()) {
            frameNumberOfPins = 10;
            extraBalls = 2;
            roll.setAttemptInFrame(false);
            return;
        }

        if (isSpare(numberOfPins) && !(isUseExtraBalls)) {
            frameNumberOfPins = 10;
            extraBalls = 1;
            roll.setAttemptInFrame(false);
            return;
        }

        if (roll.isFirstAttemptInFrame()) {
            roll.setAttemptInFrame(false);
            return;
        }

        roll.setAttemptInFrame(true);
        setFirstAttempt();
        checkIsGameFinished();
    }

    @Override
    public int score() {
        return allBallsInGame.stream().map(Ball::getScore).reduce(Integer::sum).orElse(0);
    }

    public boolean isGameFinished() {
        return isGameFinished;
    }

    public int getNextNumberOfFrame() {
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
        return numberOfPins + getTwoLastBallScoreInFrame() == SPARE;
    }

    private void checkIsGameFinished() {
        final int END_GAME = 11;
        if (numberOfFrame == END_GAME) {
            isGameFinished = true;
        }
    }

    private void setFirstAttempt() {
        isUseExtraBalls = false;
        frameNumberOfPins = 10;
        numberOfFrame++;
    }

    private int getTwoLastBallScoreInFrame() {
        int score;
        try {
            score = allBallsInGame.get(allBallsInGame.size() - 2).getScore();
        } catch (IndexOutOfBoundsException e) {
            return 0;
        }
        return score;
    }
}