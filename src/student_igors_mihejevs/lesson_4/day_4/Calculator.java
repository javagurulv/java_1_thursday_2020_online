package student_igors_mihejevs.lesson_4.day_4;

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    public int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
    public boolean isEven(int firstNumber) {
        return firstNumber % 2 == 0;
    }
    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        int maxInteger = 2147483647;
        if (firstNumber > secondNumber) return firstNumber;
        else if (firstNumber < secondNumber) return secondNumber;
        else return maxInteger; //equal numbers
    }

}
