package student_julija_skopeca.practical_tasks.lesson_7.level_6.task_10;

class PowerCalculatorTest {

    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.testOrdinaryExponentiation();
    }

    public void testOrdinaryExponentiation () {
        PowerCalculator powerCalculator = new PowerCalculator();
        int result = powerCalculator.exponentation(2, 3);
        if (result == 8) {
            System.out.println("testOrdinaryExponentiation - OK");
        } else {
            System.out.println("testOrdinaryExponentiation - FAIL");
        }
    }
}
