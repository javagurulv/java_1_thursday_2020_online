package student_igors_mihejevs.lesson_3.day_6.table_lamp;

public class TableLamp {

    private String technology, color, colorOfLight;
    private boolean isOn;

    public TableLamp(String technology, String color, String colorOfLight, boolean isSwitchedOn) {
        this.technology = technology;
        this.color = color;
        this.colorOfLight = colorOfLight;
        this.isOn = isSwitchedOn;
    }

    public String getTechnology() {
        return this.technology;
    }

    public String getColor() {
        return this.color;
    }

    public void lampState() {
        System.out.print("\nCurrent state of the lamp : ");
        System.out.println("The lamp is on - " + this.isOn + ", color of light - " + this.colorOfLight);
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
