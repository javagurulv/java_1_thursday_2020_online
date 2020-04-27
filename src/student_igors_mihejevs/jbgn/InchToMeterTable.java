package student_igors_mihejevs.jbgn;

/*
    My first program in Java
    Task from Java A Beginners Guide, Eighth Edition by Schildt, H. book

    This program displays a conversion
    table of inches to meters.
*/
class InchToMeterTable {
    public static void main (String[] args) {
        double inches, meters, feet;
        int counter, counter1;
        inches = 1;
        counter = 0;
        for (feet = 1; feet <= 12; feet++) {
            for (counter1 = 1; counter1 <= 12; counter1++) {
            meters = inches * 39.37;
            System.out.println(inches + " inches is " +
                    meters + " meters.");
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