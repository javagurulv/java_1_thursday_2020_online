package student_diana_miranovica.lesson6.lesson_code;

import java.util.Random;
import java.util.Scanner;
/*- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив числами полученными от пользователя
- распечатайте на консоль все элементы массива.*/
class MethodExample2 {

    public int getArrayLengthFromUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int arrLength = sc.nextInt();
        return arrLength;
    }
    public  int[] createArray(int arrayLength){
        return new int[arrayLength];
    }
    public  void fillArrayWithNumbersFromUser(int[] arr){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++){
            System.out.println("Enter array element number: ");
            arr[i] = sc.nextInt();

        }
    }
    public void printArrayToConsole(int[]arr){
        for (int i = 0; i  < arr.length; i++){
            System.out.println("arr element = " + arr[i]);
        }
    }



}