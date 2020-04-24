package student_igors_mihejevs.jbgn;

/*
    My first program in Java
    Task from Java A Beginners Guide, Eighth Edition by Schildt, H. book

    This program displays a conversion
    table of inches to meters.
*/
public class InchToMeterTable {
    public static void main (String[] args) {
        double inches, meters, feet;
        int counter;
        for (feet = 1; feet <= 12; feet++) {
            counter = 0;
            for (inches = 1; inches <= feet * 12; inches++)  {
                meters = inches * 39.37;
                System.out.println(inches + " inches is " +
                                   meters + " meters.");
                counter++;
                if (counter == 12) {
                System.out.println();
                counter = 0;
                }
            }
        }
    }
}