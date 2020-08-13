package student_igors_mihejevs.lesson_4.homework.level_x;

class LeapYearTest {

    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.test1(); // Leap year /4 and !/100
        leapYearTest.test2(); // Leap year /4 and /100 and /400
        leapYearTest.test3(); // Not leap year /4 and /100 and !/400
        leapYearTest.test4(); // Not leap year !/4
    }

    public void test1() {
        LeapYear test = new LeapYear();
        if (test.yearDetect(2016)) System.out.println("Test1 = OK");
        else System.out.println("Test1 = FAIL");
    }

    public void test2() {
        LeapYear test = new LeapYear();
        if (test.yearDetect(2000)) System.out.println("Test2 = OK");
        else System.out.println("Test2 = FAIL");
    }

    public void test3() {
        LeapYear test = new LeapYear();
        if (!test.yearDetect(2100)) System.out.println("Test3 = OK");
        else System.out.println("Test3 = FAIL");
    }

    public void test4() {
        LeapYear test = new LeapYear();
        if (!test.yearDetect(2017)) System.out.println("Test4 = OK");
        else System.out.println("Test4 = FAIL");
    }

}
