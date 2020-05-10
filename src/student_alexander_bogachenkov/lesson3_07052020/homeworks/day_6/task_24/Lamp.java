package student_alexander_bogachenkov.lesson3_07052020.homeworks.day_6.task_24;

public class Lamp {

    //statement
    private String color;
    private int heightCentimeters;

    //behavior
    private boolean isOn;
    private boolean isWorkingCorrectly;

    public Lamp (String lampColor, int heightCentimeters, boolean isOn, boolean isWorkingCorrectly) {
        this.color = lampColor;
        this.heightCentimeters = heightCentimeters;
        this.isOn = isOn;
        this.isWorkingCorrectly = isWorkingCorrectly;
    }

    public void infoAboutLamp() {
        System.out.println("Lamp color is " + this.color);
        System.out.println("Lamp height is " + this.heightCentimeters + " centimeters");
        System.out.println("Lamp right now is ON. Right? " + this.isOn);
        System.out.println("Lamp right now is working correctly. Right? " + this.isWorkingCorrectly);
    }
}
