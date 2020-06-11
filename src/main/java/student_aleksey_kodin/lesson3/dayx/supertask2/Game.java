package student_aleksey_kodin.lesson3.dayx.supertask2;

import java.util.Random;

class Game {
    private int rollScore;
    private int firstPin = 0;
    private int secondPin= 0;
    private boolean isFirstRoll = true;
    private boolean isSecondRoll = false;
    private boolean strike = false;
    private int prevBonus = 0;
    private int frameCount = 0;
    private final Random bonus = new Random();

    void roll(int pins) {
        int bonusValue;
        rollScore = 0; // Обнуление результата перед броском

        if (isFirstRoll) { // Первый бросок
            firstPin = pins;
            frameCount++;
        }
        if (!isFirstRoll) { // Если это второй бросок
            isSecondRoll = true;
            secondPin = pins;
        }
        if (firstPin == 10 || (secondPin == 10 && firstPin == 0)) { // Условия для [Strike]
            if (firstPin == 10) {
                rollScore = firstPin;
            } else {
                rollScore = secondPin;
            }
            strike = true;
            // Если [Strike] на 10 [Frame] и на второй попытке, то только один дополнительный [extra ball]
            int countOfStrike;
            if (frameCount == 10 && isSecondRoll) {
                countOfStrike = 1;
            } else {
                countOfStrike = 2;
                }
            for (int count = 1; count <= countOfStrike; count++) {
                    bonusValue = bonus.nextInt(11 - prevBonus);
                        if (count == 1 && bonusValue != 10 ) { // Если второй бросок не [Strike], то третий
                            prevBonus = bonusValue;           // бросок по оставшимся
                        }
                        rollScore = rollScore + bonusValue;
                            System.out.println("[Strike] Extra ball: " + bonusValue);
            }
                } else if (firstPin + secondPin == 10 && isSecondRoll) { // Условия для [Spare]
                    if (!strike) { // Если не было [Strike]
                        bonusValue = bonus.nextInt(11);
                            rollScore = secondPin + bonusValue;
                                System.out.println("[Spare] Extra ball: " + bonusValue);
                    }
        } else {
            rollScore =  pins;// Иначе бросок без бонусов
        }
        // Если был [Strike] второго броска не будет
        // Первый бросок состоялся
        isFirstRoll = strike;

        if (isSecondRoll) { // Если второй бросок состоялся, то скинуть настройки для первого броска
            isFirstRoll = true;
            isSecondRoll = false;
        }
        strike = false;
        prevBonus = 0;
     }
    int score() {
        return rollScore;
    }
}
