package student_vadims_vladisevs.lesson4.homework.day_4;

class Calculator {

    public int sumResult(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int difResult(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public double divResult(double firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public double multiResult(double firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber){
        return (firstNumber > secondNumber) ? firstNumber : secondNumber;
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber){
        boolean firstNumberIsGreaterThanSecondNumber = (firstNumber > secondNumber);
        boolean firstNumberIsGreaterThanThirdNumber = (firstNumber > thirdNumber);
        boolean secondNumberIsGreaterThanThirdNumber = (secondNumber > thirdNumber);

        if ((firstNumberIsGreaterThanSecondNumber) && (firstNumberIsGreaterThanThirdNumber)) {
            return firstNumber;
        }
        else if (!firstNumberIsGreaterThanSecondNumber && secondNumberIsGreaterThanThirdNumber){
            return secondNumber;
        }
        else {
            return thirdNumber;
        }
    }
}

