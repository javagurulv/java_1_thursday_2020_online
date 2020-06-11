package student_edgars_lukjanskis.homeworks.day_2;

import java.util.Scanner;

class EnterYourNameAndHello {

    public static void main(String[] args) {

            System.out.println("Enter Your name");
                Scanner myInput = new Scanner(System.in);
                    String name = myInput.nextLine();
                        System.out.println("Hello " + name);
        
    }
}