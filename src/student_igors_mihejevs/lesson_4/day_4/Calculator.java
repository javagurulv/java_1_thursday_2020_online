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
        return Math.max(firstNumber, secondNumber);
    }
    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber == secondNumber && firstNumber == thirdNumber) {
            System.out.println("All numbers are equals and = " + firstNumber);
            return firstNumber;
        }
        else if (firstNumber == secondNumber) {
            if (firstNumber > thirdNumber) {
                System.out.println("First number are equal to second number and more than third number\n" +
                        "The largest numbers are first and second and = " + firstNumber);
                return firstNumber;
            }
            else System.out.println("First number are equal to second number and less than third number\n" +
                    "The largest number is third and = " + thirdNumber);
            return thirdNumber;
        }
        else if (firstNumber == thirdNumber) {
            if (firstNumber > secondNumber) {
                System.out.println("First number are equal to third number and more than second number\n" +
                        "The largest numbers are first and third and = " + firstNumber);
                return firstNumber;
            }
            else System.out.println("First number are equal to third number and less than second number\n" +
                    "The largest number is second and = " + secondNumber);
            return secondNumber;
        }
        else if (secondNumber == thirdNumber) {
            if (secondNumber > firstNumber) {
                System.out.println("Second number are equal to third number and more than first number\n" +
                        "The largest numbers are second and third and = " + secondNumber);
                return secondNumber;
            }
            else System.out.println("Second number are equal to third number and less than first number\n" +
                    "The largest number is first and = " + firstNumber);
            return firstNumber;
        }
        else if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            // System.out.println("The largest number is first and = " + firstNumber);
            return firstNumber;
        }
        else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            // System.out.println("The largest number is second and = " + secondNumber);
            return secondNumber;
        }
        else {
            // System.out.println("The largest number is third and = " + thirdNumber);
            return thirdNumber;
        }
    }

}
