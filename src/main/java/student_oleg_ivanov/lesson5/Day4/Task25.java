package student_oleg_ivanov.lesson5.Day4;

import java.util.Scanner;

class Task25 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter array length :");
        int arrayLength = scr.nextInt();

        // не используйте русские названия даже транслитом написанные в коде: userMassive -> userArray
        int [] userMassive = new int[arrayLength];

        for (int i = 0; i < userMassive.length; i++) {
            System.out.println("Please enter number:");
            userMassive [i] = scr.nextInt();
        }
        for (int i = 0; i < userMassive.length; i++){

            System.out.println(i+1 + " Array number = " + userMassive [i] + " number");}

    }
}
//Напишите программу, в которой:
//- запросите у пользователя с консоли длину массива
//- создайте массив указанной пользователем длины
//- заполните массив числами полученными от пользователя
//- распечатайте на консоль все элементы массива.
