package student_igors_mihejevs.lesson_4.homework.level_4;

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
        return Math.max(firstNumber, secondNumber);
    }
    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if ((firstNumber == secondNumber) && (firstNumber == thirdNumber)) return firstNumber;
        else if (firstNumber == secondNumber) return Math.max(firstNumber, thirdNumber);
        else if (firstNumber == thirdNumber) return Math.max(firstNumber, secondNumber);
        else if (secondNumber == thirdNumber) return Math.max(secondNumber, firstNumber);
        else if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)) return firstNumber;
        else if ((secondNumber > firstNumber) && (secondNumber > thirdNumber)) return secondNumber;
        else return thirdNumber;
    }

}
