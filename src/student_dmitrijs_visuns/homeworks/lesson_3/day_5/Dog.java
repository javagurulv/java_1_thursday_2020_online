package student_dmitrijs_visuns.homeworks.lesson_3.day_5;

import java.util.Scanner;

class Dog {

    private String dogName;

    public Dog(String dogName) {
        this.dogName = dogName;
    }

    public void voice() {
        System.out.println(dogName + " " + dogName + " " + dogName);
    }

}
