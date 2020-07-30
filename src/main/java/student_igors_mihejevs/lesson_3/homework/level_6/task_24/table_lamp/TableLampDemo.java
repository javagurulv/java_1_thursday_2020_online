package student_igors_mihejevs.lesson_3.homework.level_6.task_24.table_lamp;

class TableLampDemo {

    public static void main(String[] args) {
        TableLamp myTableLamp = new TableLamp("LED", "black-grey", "warm", false);

        String lampTech = myTableLamp.getTechnology();
        String lampColor = myTableLamp.getColor();

        //Main characteristics of the lamp
        System.out.println("The table lamp characteristics:");
        System.out.println("Technology - " + lampTech + ". Color - " + lampColor);

        myTableLamp.lampState();

        // Switching on the lamp
        myTableLamp.switchedOn();

        // Changing the color of light
        myTableLamp.setColorOfLight("cold");

        myTableLamp.lampState();

        // Switching off the lamp
        myTableLamp.switchedOff();
    }

}
