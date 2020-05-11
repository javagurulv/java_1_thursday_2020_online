package student_igors_mihejevs.lesson_3.day_6;

public class TableLamp {

    private String technology, color, colorOfLight;
    private boolean isOn;

    public TableLamp(String technology, String color, String colorOfLight, boolean isSwitchedOn) {
        this.technology = technology;
        this.color = color;
        this.colorOfLight = colorOfLight;
        this.isOn = isSwitchedOn;
    }

    public void printCharOfLamp() {
        System.out.println("The table lamp characteristics:");
        System.out.println("-------------------------------");
        System.out.println("Technology - " + this.technology);
        System.out.println("Color - " + this.color);
        System.out.println("Color of light - " + this.colorOfLight);
        System.out.println("Is switched on - " + isOn);
    }

    public void changingColorOfLight(String newColorOfLight) {
        this.colorOfLight = newColorOfLight;
        System.out.println("\nThe color of light changed to " + newColorOfLight);
    }

    public void switchedOn() {
        this.isOn = true;
        System.out.println("\nThe lamp is switched on!");
    }

    public void switchedOff() {
        this.isOn = false;
        System.out.println("\nThe lamp is switched off!");
    }

}
