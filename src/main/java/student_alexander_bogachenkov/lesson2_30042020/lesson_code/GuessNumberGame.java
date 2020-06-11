package student_alexander_bogachenkov.lesson2_30042020.lesson_code;

import java.util.Random;
import java.util.Scanner;

class GuessNumberGame {

    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(101);
        System.out.println("Итак, компьютер задумал случайное число от 0 до 100. Попробуйте угадать это число: ");
        tryingToGuess(randomNumber);

    }

    public static void tryingToGuess(int randomNum) {
        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();

        if (userNum < randomNum) {
            System.out.println("Загаданное компьютером число больше, чем ваше! Повторите попытку: ");
            tryingToGuess(randomNum);
        } else if (userNum > randomNum) {
            System.out.println("Загаданное компьютером число меньше, чем ваше! Повторите попытку: ");
            tryingToGuess(randomNum);
        } else if (userNum == randomNum) {
            System.out.println("Поздравляем! Вы отгадали загаданное компьютером число!");
        } else {
            System.out.println("Что-то пошло не так...");
        }
    }

}
