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
        final int EXTRA_BALL_SPARE_OR_STRIKE = 1;
        final int SPARE_ONE_EXTRA_BALL = 1;
        final int STRIKE_TWO_EXTRA_BALL = 2;

        report.addStringToReport("Frame " + numberOfFrame + ": " + numberOfPins + "\n");

        frameNumberOfPins -= numberOfPins;

        if (extraBalls > EXTRA_BALL_SPARE_OR_STRIKE) {
            useExtraBall(numberOfPins);
            return;
        } else {
            simpleRoll(numberOfPins);
        }
        if (isStrike(numberOfPins) && roll.isFirstAttemptInFrame()) {
            prepareExtraBalls(STRIKE_TWO_EXTRA_BALL);
            return;
        }
        if (isSpare(numberOfPins) && !(isUseExtraBalls)) {
            prepareExtraBalls(SPARE_ONE_EXTRA_BALL);
            return;
        }
        if (roll.isFirstAttemptInFrame()) {
            roll.setAttemptInFrame(false);
            return;
        }
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

    private void prepareExtraBalls(int extraBalls) {
        frameNumberOfPins = 10;
        this.extraBalls = extraBalls;
        roll.setAttemptInFrame(false);
    }

    private void useExtraBall(int numberOfPins) {
        allBallsInGame.add(new Ball(numberOfPins));
        extraBalls--;
        isUseExtraBalls = true;
    }

    private void simpleRoll(int numberOfPins) {
        extraBalls = 0;
        allBallsInGame.add(new Ball(numberOfPins));
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
        roll.setAttemptInFrame(true);
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