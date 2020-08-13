package student_igors_mihejevs.lesson_3.homework.level_6.task_24.table_lamp;

class TableLamp {

    private final String technology;
    private final String color;
    private String colorOfLight;
    private boolean isOn;

    public TableLamp(String technology, String color, String colorOfLight, boolean isSwitchedOn) {
        this.technology = technology;
        this.color = color;
        this.colorOfLight = colorOfLight;
        this.isOn = isSwitchedOn;
    }

    public String getTechnology() {
        return technology;
    }

    public String getColor() {
        return color;
    }

    public void lampState() {
        System.out.print("\nCurrent state of the lamp : ");
        System.out.println("The lamp is on - " + isOn + ", color of light - " + colorOfLight);
    }

    public void setColorOfLight(String newColorOfLight) {
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
