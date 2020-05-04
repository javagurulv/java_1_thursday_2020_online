package student_edgars_lukjanskis.homeWorks.day_2;

import java.util.Scanner;

public class enterYourNameAndHello {

    public static void main(String[] args) {

            System.out.println("Enter Your name");
                Scanner myInput = new Scanner(System.in);
                    String name = myInput.nextLine();
                        System.out.println("Hello " + name);
        
    }
}