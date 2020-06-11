package student_oleg_ivanov.lesson4.homeWorkDay4;

class Calculator {
    public int sum(int firstNumber, int secondNumber) { return firstNumber + secondNumber; }

    public int difference(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int division(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public int multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public boolean isEvenNumber(int firstNumber) {
        return firstNumber % 2 == 0;
    }

    public boolean isEvenNumber2(int secondNumber) {
        return secondNumber % 2 == 0;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else return secondNumber;
    }

    public int maxOfTwoNumbersTest1(int firstNumber, int secondNumber) {
        if (secondNumber < firstNumber) {
            return firstNumber;
        } else return secondNumber;
    }

    public int maxOfTwoNumbersTest2(int firstNumber, int secondNumber) {
        if (secondNumber > firstNumber) {
            return secondNumber;
        } else return firstNumber;
    }

    public int maxOfThreeNumbersTest(int firstNumber, int secondNumber, int thirdNumber) {
        if ((firstNumber == secondNumber) && (secondNumber == thirdNumber))
            return thirdNumber;
        else if ((firstNumber > secondNumber) && (firstNumber > thirdNumber))
            return firstNumber;
        else if ((secondNumber > firstNumber) && (secondNumber > thirdNumber))
            return secondNumber;
        else if ((thirdNumber > firstNumber) && (thirdNumber > secondNumber))
            return thirdNumber;
        else if ((firstNumber == secondNumber) && (firstNumber > thirdNumber))
            return firstNumber;
        else if ((thirdNumber == secondNumber) && (firstNumber < thirdNumber))
            return thirdNumber;
        else if ((firstNumber == thirdNumber) && (firstNumber > secondNumber))
            return firstNumber;
        else return secondNumber;
    }
}