package student_igors_mihejevs.jbgn;

/*
    My first program in Java
    Task from Java A Beginners Guide, Eighth Edition by Schildt, H. book

    This program displays a conversion
    table of inches to meters.
*/

import java.text.DecimalFormat;

class InchToMeterTable {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main (String[] args) {
        double inches = 1, meters, feet;
        int counter = 0, counter1;

        for (feet = 1; feet <= 12; feet++) {
            for (counter1 = 1; counter1 <= 12; counter1++) {
            meters = inches * 39.37;

            System.out.println(df.format(inches) + " inches is " +
                    df.format(meters) + " meters.");

            counter++;
            inches = inches + 1;

                if (counter == 12) {
                System.out.println();
                counter = 0;
                }
            }
        }
    }
}