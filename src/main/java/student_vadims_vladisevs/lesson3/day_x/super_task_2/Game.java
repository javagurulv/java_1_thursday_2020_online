package student_vadims_vladisevs.lesson3.day_x.super_task_2;

import java.util.Random;

class Game {

    private int knockedPinsCount = 0;
    private int result = 0;
    private boolean isLastThrowStrike = false;
    private boolean isLastThrowSpare = false;


    public void roll(){

        if (!isLastThrowSpare && !isLastThrowStrike){
            simpleRoll();
        }

        else if (isLastThrowStrike){
             strike();
        }

        else if (isLastThrowSpare){
              spare();
        }

       result = result + knockedPinsCount;
    }

    public void finalRoll(){
        Random randomGenerator = new Random();

        if (!isLastThrowSpare && !isLastThrowStrike) {
            System.out.println("Roll count: 10");
            simpleRoll();
            if (isLastThrowStrike){
                strike();
                if (isLastThrowStrike){
                    int lastThrow = randomGenerator.nextInt(11);
                    System.out.println("Third throw result: " + lastThrow);
                    result = result + (lastThrow * 2);
                }
            }
            else if (isLastThrowSpare){
                int lastThrow = randomGenerator.nextInt(11);
                System.out.println("Third throw result: " + lastThrow);
                result = result + (lastThrow * 2);
            }
        }

        else if (isLastThrowStrike){
            System.out.println("Roll count: 10");
            strike();
            if (isLastThrowStrike){
                strike();
                if (isLastThrowStrike){
                    int lastThrow = randomGenerator.nextInt(11);
                    System.out.println("Third throw result: " + lastThrow);
                    result = result + (lastThrow * 2);
                }
            }
            else if (isLastThrowSpare){
                int lastThrow = randomGenerator.nextInt(11);
                System.out.println("Third throw result: " + lastThrow);
                result = result + (lastThrow * 2);
            }
        }

        else if (isLastThrowSpare){
            System.out.println("Roll count: 10");
            spare();
            if (isLastThrowStrike){
                strike();
                if (isLastThrowStrike){
                    int lastThrow = randomGenerator.nextInt(11);
                    System.out.println("Third throw result: " + lastThrow);
                    result = result + (lastThrow * 2);
                }
            }
            else if (isLastThrowSpare){
                int lastThrow = randomGenerator.nextInt(11);
                System.out.println("Third throw result: " + lastThrow);
                result = result + (lastThrow * 2);
            }
        }

        result = result + knockedPinsCount;
        System.out.println("Final score: " + result);
        }


    public void simpleRoll(){
        Random randomGenerator = new Random();

        int firstThrow = randomGenerator.nextInt(11);
        if (firstThrow == 10){
            knockedPinsCount = firstThrow;
            isLastThrowStrike = true;

            System.out.println("First throw result: " + firstThrow);
        }
        else {
            int secondThrow = randomGenerator.nextInt((11 - firstThrow));
            knockedPinsCount = firstThrow + secondThrow;

            System.out.println("First throw result: " + firstThrow);
            System.out.println("Second throw result: " + secondThrow);
            if (knockedPinsCount == 10){
                isLastThrowSpare = true;
            }
        }

    }


    public void spare(){
        Random randomGenerator = new Random();
        isLastThrowSpare = false;


        int firstThrow = randomGenerator.nextInt(11);
        if (firstThrow == 10){
            knockedPinsCount = firstThrow * 2;

            System.out.println("First throw result: " + firstThrow);
            isLastThrowStrike = true;
        }
        else {
            int secondThrow = randomGenerator.nextInt((11 - firstThrow));
            knockedPinsCount = (firstThrow * 2) + secondThrow;

            System.out.println("First throw result: " + firstThrow);
            System.out.println("Second throw result: " + secondThrow);
            if (secondThrow + firstThrow == 10) {
                isLastThrowSpare = true;

            }
        }
    }


    public void strike() {
        Random randomGenerator = new Random();
        isLastThrowStrike = false;


        int firstThrow = randomGenerator.nextInt(11);
        if (firstThrow == 10) {
            knockedPinsCount = firstThrow * 2;
            isLastThrowStrike = true;

            System.out.println("First throw result: " + firstThrow);
        } else {
            int secondThrow = randomGenerator.nextInt((11 - firstThrow));
            knockedPinsCount = (firstThrow * 2) + (secondThrow * 2);

            System.out.println("First throw result: " + firstThrow);
            System.out.println("Second throw result: " + secondThrow);
            if (secondThrow + firstThrow == 10) {
                isLastThrowSpare = true;
            }
        }
    }

    public int score(){
        return result;
    }

    public int getKnockedPinsCount(){
        return knockedPinsCount;
    }



}
