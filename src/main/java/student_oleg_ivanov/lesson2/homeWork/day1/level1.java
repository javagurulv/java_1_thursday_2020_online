package student_oleg_ivanov.lesson2.homeWork.day1;

import java.util.Scanner;

class level1 { // название класса с заглавной буквы!
    public static void main(String[] args) {
        //1. get first number from user
        System.out.println("Enter first number");
        Scanner myInput = new Scanner(System.in);
        int firstNumber = myInput.nextInt();

        //2. ger second number from user
        System.out.println("Enter second number");
        int secondNumber = myInput.nextInt();

        //3. first number + second number
        int result1 = firstNumber + secondNumber; // result1, result2 ... это название переменных не отображает суть того что в ней хранится!
        int result2 = firstNumber - secondNumber; // sum, subtract, ....
        int result3 = firstNumber * secondNumber;
        int result4 = firstNumber / secondNumber;

        // 4 print result to console
        System.out.println("Result = " + result1);
        System.out.println("Result = " + result2);
        System.out.println("Result = " + result3);
        System.out.println("Result = " + result4);

    }
}
