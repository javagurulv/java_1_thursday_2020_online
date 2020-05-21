package student_vadims_vladisevs.lesson4.homework.day_x.super_task_2;

class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest test = new LeapYearTest();

        test.leapYearTestYearDividedByFourAndHundred();
        test.leapYearTestYearDividedByFourHundredAndHundred();
        test.leapYearTestYearDividedByHundred();
        test.leapYearTestNotLeapYear();


    }

    public void leapYearTestNotLeapYear(){
        LeapYear test = new LeapYear();
        int year = 2019;

        boolean result = test.isLeapYear(year);

        if (!result){
            System.out.println("Not a leap year test = OK");
        }
        else {
            System.out.println("Not a leap year test = FAIL");
        }
    }


    public void leapYearTestYearDividedByHundred(){
        LeapYear test = new LeapYear();
        int year = 1900;

        boolean result = test.isLeapYear(year);

        if (!result){
            System.out.println("Divided by 100 test = OK");
        }
        else {
            System.out.println("Divided by 100 test = FAIL");
        }
    }


    public void leapYearTestYearDividedByFourHundredAndHundred(){
        LeapYear test = new LeapYear();
        int year = 1600;

        boolean result = test.isLeapYear(year);

        if (result){
            System.out.println("Divided by 400 and 100 test = OK");
        }
        else {
            System.out.println("Divided by 400 and 100 test = FAIL");
        }
    }


    public void leapYearTestYearDividedByFourAndHundred(){
        LeapYear test = new LeapYear();
        int year = 2000;

        boolean result = test.isLeapYear(year);

        if (result){
            System.out.println("Divided by 4 and 100 test = OK");
        }
        else {
            System.out.println("Divided by 4 and 100 test = FAIL");
        }


    }


}
