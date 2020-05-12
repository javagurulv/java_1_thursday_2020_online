package student_aleksey_kodin.lesson3.dayx.supertask2;

import java.util.Random;

class GameDemo {
    private final Game game = new Game();
    private final Random pinsCount = new Random();
    private int firstRollScore = 0;
    private int secondRollScore = 0;
    private int totalScore = 0;

    void  GameStart() {
        for(int frame = 1; frame <= 10; frame++) {
            System.out.println("-----------------------");
            System.out.println("Frame: " + frame);
            System.out.println("-----------------------");

            for (int roll = 1; roll < 2; roll++) {
                    int firstRoll = pinsCount.nextInt(11);
                        System.out.println("First roll: " + firstRoll);
                             game.roll(firstRoll);
                                firstRollScore = game.score();
                    if (firstRoll == 10) {
                        break; // Если Strike, то второго броска не будет
                    } else {
                        int secondRoll = pinsCount.nextInt(11 - firstRollScore);
                            System.out.println("Second roll: " + secondRoll);
                                game.roll(secondRoll);
                                     secondRollScore = game.score();
                    }
            }
            totalScore = totalScore + firstRollScore + secondRollScore;
            System.out.println("-----------------------");
            if (frame == 10) {
                System.out.println("Game score: " + totalScore);
            } else {
                System.out.println("Frame score: " + totalScore);
            }
            firstRollScore = 0;
            secondRollScore = 0;
        }
    }
    public static void main(String[] args) {
        GameDemo gameDemo = new GameDemo();
            gameDemo.GameStart();
    }
}
