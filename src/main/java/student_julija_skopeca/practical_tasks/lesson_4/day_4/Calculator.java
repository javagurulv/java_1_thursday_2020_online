package student_julija_skopeca.practical_tasks.lesson_4.day_4;

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int diff(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int mult(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        int max = Math.max(firstNumber, secondNumber);
        return max;
        }


    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        int max = Math.max(firstNumber, Math.max(secondNumber, thirdNumber));
        return max;
    }
}
