package student_diana_miranovica.lesson6.lesson_code;

import java.util.Scanner;

class WhileExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int userNum = scanner.nextInt(); // true or false
        while (userNum != 0){
            System.out.println("Your number is  "+userNum);
            userNum = scanner.nextInt();
        }
        System.out.println("End!");

    }


}
