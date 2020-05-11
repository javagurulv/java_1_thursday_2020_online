package student_igors_mihejevs.lesson_3.day_6;

public class TableLampDemo {

    public static void main(String[] args) {
        TableLamp myTableLamp = new TableLamp("LED", "Black-grey", "Warm", false);

        myTableLamp.printCharOfLamp();

        // Switching on the lamp
        myTableLamp.switchedOn();

        // Switching off the lamp
        myTableLamp.switchedOff();

        // Changing the color of light
        myTableLamp.changingColorOfLight("Cold");

        myTableLamp.printCharOfLamp();
        }
}
