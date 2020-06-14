package student_vadims_vladisevs.lesson7.day_4;

import java.util.Random;

// lesson3.day_x.super_task_2.Game refactoring;

// А где тесты для этого класса?
class BowlingGame {

    private int knockedPinsCount = 0;
    private int result = 0;
    private boolean isLastThrowStrike = false;
    private boolean isLastThrowSpare = false;
    Random randomGenerator = new Random();
    private int firstThrow;
    private int secondThrow;
    private int lastThrow;

    public void roll() {

        if (isLastThrowStrike){
            strike();
        } else if (isLastThrowSpare){
            spare();
        } else {
            simpleRoll();
        }
        result += knockedPinsCount;
    }

    public void finalRoll() {

        if (isLastThrowStrike){
            lastWasStrike();
        } else if (isLastThrowSpare){
            lastWasSpare();
        } else {
            makeFinalThrow();
        }
        result += knockedPinsCount;
    }


    public void simpleRoll() {

        if (makeFirstThrow() == 10) {
            knockedPinsCount = firstThrow;
            isLastThrowStrike = true;
        } else {
            knockedPinsCount = firstThrow + makeSecondThrow();
            if (isSpare()) {
                isLastThrowSpare = true;
            }
        }
    }

    public void spare() {

        isLastThrowSpare = false;
        if (makeFirstThrow() == 10) {
            knockedPinsCount = firstThrow * 2;
            isLastThrowStrike = true;
        } else {
            makeSecondThrow();
            knockedPinsCount = (firstThrow * 2) + secondThrow;
            if (isSpare()) {
                isLastThrowSpare = true;
            }
        }
    }


    public void strike() {

        isLastThrowStrike = false;
        if (makeFirstThrow() == 10) {
            knockedPinsCount = firstThrow * 2;
            isLastThrowStrike = true;
        } else {
            makeSecondThrow();
            knockedPinsCount = (firstThrow * 2) + (secondThrow * 2);
            if (isSpare()) {
                isLastThrowSpare = true;
            }
        }
    }

    public int score() {
        return result;
    }

    public int makeFirstThrow() {
        return firstThrow = randomGenerator.nextInt(11);
    }


    public int makeSecondThrow() {
        return secondThrow = randomGenerator.nextInt(11 - firstThrow);
    }

    public int makeLastThrow() {
        lastThrow = randomGenerator.nextInt(11);
        return lastThrow;
    }

    public boolean isSpare() {
        return (knockedPinsCount == 10);
    }


    public void printGameResult() {
        System.out.println("Result: " + score());
        System.out.println("----------");
    }

    public void printRollResult() {
        System.out.println("First throw result: " + firstThrow);
        System.out.println("Second throw result: " + secondThrow);
        if (lastThrow != 0) {
            System.out.println("Third throw result: " + lastThrow);
        }
    }

    public void lastWasStrike() {
            strike();
            if (isLastThrowStrike) {
                strike();
                if (isLastThrowStrike) {
                    makeLastThrow();
                    result += (lastThrow * 2);
                }
            } else if (isLastThrowSpare) {
                makeLastThrow();
                result += (lastThrow * 2);
            }
    }

    public void lastWasSpare(){
        spare();
        if (isLastThrowStrike) {
            strike();
            if (isLastThrowStrike) {
                makeLastThrow();
                result += (lastThrow * 2);
            }
        } else if (isLastThrowSpare) {
            makeLastThrow();
            result += (lastThrow * 2);
        }
    }

    public void makeFinalThrow(){
        simpleRoll();
        if (isLastThrowStrike) {
            strike();
            if (isLastThrowStrike) {
                makeLastThrow();
                result += (lastThrow * 2);
            }
        }

        if (isLastThrowSpare) {
            makeLastThrow();
            result += (lastThrow * 2);
        }

    }

        public void playBowlingGame () {
            for (int i = 1; i < 10; i++) {
                System.out.println("Roll count: " + i);
                roll();
                printRollResult();
                printGameResult();
            }
            System.out.println("Roll count: 10");
            finalRoll();
            printRollResult();
            System.out.println("Final score: " + result);
        }


}

