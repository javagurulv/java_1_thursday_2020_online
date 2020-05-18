package student_diana_miranovica.lesson4.homeworks.day_3;

import java.util.Scanner;

//Написать программу, которая запрашивает у пользователя
//три целых числа и выводит на консоль наибольшее из них.
 class Task10MaxValue {

    public static void main(String[] args) {

        System.out.println("Press your first int");
        int firstInt = new Scanner(System.in).nextInt();
        System.out.println("Press your second int");
        int secondInt = new Scanner(System.in).nextInt();
        System.out.println("Press your third int");
        int thirdInt = new Scanner(System.in).nextInt();

        int maxVal ;
        if(firstInt>secondInt&&firstInt>thirdInt){
            maxVal=firstInt;
        }else if (secondInt>thirdInt&&secondInt>firstInt){
            maxVal=secondInt;
        }else {
            maxVal=thirdInt;
        }
        System.out.println("If I use 'if else' method: ");
        System.out.println("Greater value is "+ maxVal);

        int maxMathValueMethod = Math.max(Math.max(firstInt,secondInt),thirdInt);
        System.out.println("If I use 'Math.max' method: ");
        System.out.println("Greater value is "+ maxMathValueMethod);

    }
}
