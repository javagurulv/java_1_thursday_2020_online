package student_vadim_sokolenko.Lesson4.lesson4Day1Tasks;

import java.util.Scanner;

class DayOfTheWeekTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number from 1 to 7");
        int day = scanner.nextInt();



    if(day ==1) {
        System.out.println("Monday");
    }else if(day ==2) {
        System.out.println("Tuesday");
    }else if(day ==3) {
        System.out.println("Wednesday");
    }else if(day ==4) {
        System.out.println("Thursday");
    }else if(day ==5) {
        System.out.println("Friday");
    }else if(day ==6) {
        System.out.println("Saturday");
    }else if(day == 7) {
        System.out.println("Sunday");
    }else {
        System.out.println("There is no such number of the day of the week");
        }

    System.out.println("Please enter number from 1 to 7");
    int nextDay = scanner.nextInt();


        if(nextDay ==1) {
            System.out.println("Monday");
        }else if(nextDay ==2) {
            System.out.println("Tuesday");
        }else if(nextDay ==3) {
            System.out.println("Wednesday");
        }else if(nextDay ==4) {
            System.out.println("Thursday");
        }else if(nextDay ==5) {
            System.out.println("Friday");
        }else if(nextDay ==6) {
            System.out.println("Saturday");
        }else if(nextDay == 7) {
            System.out.println("Sunday");
        }else {
            System.out.println("There is no such number of the day of the week");
        }
    }
    }



