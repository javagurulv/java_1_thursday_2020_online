package student_vladimir_filipov.lesson3_hometasks.day_5.task_22;

import java.util.Scanner;

class Dog{

    private final String name;
    private String voice;
    private String colour;

    public Dog(String name, String colour) {
        this.name = name;
        this.colour = colour;
        this.voice = voice;

    }

    void name() {
        System.out.println(name + " ,voice!- " + "Av!");
        System.out.println("It's colour - "+ colour);
    }

    void colour() {
        System.out.println("Enter a new colour");
        Scanner myInput = new Scanner(System.in);
        String colour = myInput.nextLine();
    }

    void voice(){
        System.out.println(name + " ,voice!- " + "Av!");

    }

}
