package student_oleg_ivanov.lesson5.Day4;

import java.util.Random;
import java.util.Scanner;

class Task26 {

    public static void main(String[] args) {
        Random randomNumbers = new Random();
        Scanner src = new Scanner(System.in);
        System.out.println("Enter please array length: ");
        int arrayLength = src.nextInt();

        int [] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++ ) {
            array[i] = randomNumbers.nextInt(200);
        }
        for (int i = 0; i < array.length; i++ ){
            System.out.println(" Array number " + i + " is random number " + array [i]);
        }
    }

}

//Напишите программу, в которой:
//- запросите у пользователя с консоли длину массива
//- создайте массив указанной пользователем длины
//- заполните массив случайными числами
//- распечатайте на консоль все элементы массива.