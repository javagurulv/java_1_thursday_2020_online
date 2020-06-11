package student_vadims_vladisevs.lesson2.homework.level3;
import java.util.*;

class EnterYourName {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter your name :");

        String name = scr.nextLine();
        System.out.println("Hello " + name + "!");
    }
}
