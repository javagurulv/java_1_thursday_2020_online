package student_dmitrijs_visuns.homeworks.lesson_4.day_4;

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }


    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }


    public int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }


    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }


    public boolean isEven(int firstNumber) {
        if (firstNumber % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        return Math.max (firstNumber, secondNumber);
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        return Math.max (firstNumber, Math.max (secondNumber, thirdNumber));
    }








}
