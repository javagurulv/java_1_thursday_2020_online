package student_diana_miranovica.lesson4.homeworks.day_1;
//Написать программу, которая запрашивает у пользователя
//целое число от 1 до 7 и выводит на консоль соотметствующий
//этому числу день недели.
//
//Пример:
//Ввод: 3
//Вывод: Wednesday
//
//Ввод: 5
//Вывод: Friday

import java.util.Scanner;

class DaysOfTheWeekTask3 {
    public static void main(String[] args) {



         Scanner sc = new Scanner(System.in);
         System.out.println("Press int value from 1 to 7:");
         int day = sc.nextInt();

         if (day ==1){
             System.out.println("Monday");
         }else if (day ==2){
             System.out.println("Tuesday");
         }else if(day ==3){
             System.out.println("Wednesday");
         }else if(day == 4){
             System.out.println("Thursday");
         }else if (day ==5){
             System.out.println("Friday");
         }else if (day == 6){
             System.out.println("Saturday");
         }else if (day == 7){
             System.out.println("Sunday");
         }else {
             System.out.println("There is not such af the week");
         }

        System.out.println("Press int value from 1 to 7:");
        int nextDay = sc.nextInt();

        if (nextDay ==1){
            System.out.println("Monday");
        }else if (nextDay ==2){
            System.out.println("Tuesday");
        }else if(nextDay ==3){
            System.out.println("Wednesday");
        }else if(nextDay == 4){
            System.out.println("Thursday");
        }else if (nextDay ==5){
            System.out.println("Friday");
        }else if (nextDay == 6){
            System.out.println("Saturday");
        }else if (nextDay == 7){
            System.out.println("Sunday");
        }else {
            System.out.println("There is not such af the week");
        }


     }

}
