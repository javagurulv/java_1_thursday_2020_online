package student_vadim_sokolenko;


import java.util.Scanner;

public class UserWordAskingProgram {

             public static void main(String[] args) {


                //1.ask user a name
                 Scanner myInput = new Scanner(System.in);
                 System.out.println("What is your name?");


                String name = myInput.nextLine();

                 //2.print hello and user name

                 System.out.println(" Hello! " + name);


             }
}
