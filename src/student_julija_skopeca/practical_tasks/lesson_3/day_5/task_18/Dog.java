package student_julija_skopeca.practical_tasks.lesson_3.day_5.task_18;

import java.util.Scanner;

public class Dog {

    private final String name;

    private int age;

    private String color;

    public Dog(String petName,
               int petAge,
               String petColor){
        this.name = petName;
        this.age = petAge;
        this.color = petColor;
    }

        public void voiceName(){

        for (int a = 0; a < 3; a++)
        System.out.print(this.name + " ");
    }

        public void voiceCharacteristics()    {
        System.out.println("Pet name - " + this.name + ". "
                            + "Age - " + this.age + " year/s. "
                            + "Color - " + this.color + ".");
    }

        public void happyBirthday() {
        System.out.println("Happy birthday " + this.name + ". "
                            + "New age - " + (this.age + 1)
                            + " years" + ".");
        }

        public void changeColor() {
        System.out.println("Please, enter a new color");
            Scanner myInput = new Scanner(System.in);
            String petColor = myInput.nextLine();
            this.color = petColor;
        }

    }
