package student_aleksey_kodin.lesson4.dayx.supertask2;

class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.TestLeapYear();
        leapYearTest.TestNoLeapYear();
    }
    void TestLeapYear() {
        LeapYear leapYear = new LeapYear();
        boolean result =leapYear.leapYear(2020);
        if(result) {
            System.out.println("LeapYear test - " + 2020 + " is leap year = OK");
        } else {
            System.out.println("LeapYear test - " + 2020 + " is leap year = FAIL");
            }
        }
    void TestNoLeapYear() {
        LeapYear leapYear = new LeapYear();
        boolean result =leapYear.leapYear(2019);
        if(!result) {
            System.out.println("LeapYear test - " + 2019 + " is't leap year = OK");
        } else {
            System.out.println("LeapYear test - " + 2019 + " is't leap year = FAIL");
        }
    }
}

