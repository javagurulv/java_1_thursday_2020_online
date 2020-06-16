package student_vadim_sokolenko.Lesson4.lesson4Day4Task11_12_13_14_15;

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber);
    }
    public int multiply(int firstNumber, int secondNumber) {
        return (firstNumber * secondNumber);
    }
    public int divide(int firstNumber, int secondNumber) {
        return (firstNumber / secondNumber);
    }
    public int minus(int firstNumber, int secondNumber) {
        return (firstNumber - secondNumber);
    }
    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }


    }
    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        return Math.max(firstNumber, secondNumber);
    }
    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber){
        return Math.max(firstNumber, Math.max(secondNumber, thirdNumber));
    }

}
