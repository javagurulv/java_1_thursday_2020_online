package student_dmitrijs_visuns.homeworks.lesson_3.day_5;

import java.util.Scanner;

public class Dog {

    private String dogName;

    public String getDogName() {
        Scanner getName = new Scanner(System.in);
        System.out.println("Как будут звать эту собаку? ");
        dogName = getName.nextLine();
        return dogName;
    }

    public void voice() {
        System.out.println(dogName + " " + dogName + " " + dogName);
    }

}
