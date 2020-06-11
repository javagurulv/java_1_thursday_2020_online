package student_aleksey_kodin.lesson6.dayx.supertask1;

class PolicyTest {
    private final Policy policy = new Policy();

    public static void main(String[] args) {
        PolicyTest policyTest = new PolicyTest();
        policyTest.testPolicyHouse();
        policyTest.testPolicyFlat();
        policyTest.testPolicyFireLessTwoThousand();
        policyTest.testPolicyTheftLessTwoThousand();
        policyTest.testPolicyFireMoreTwoThousand();
        policyTest.testPolicyTheftMoreTwoThousand();
        policyTest.testComplex();
    }
    private void testPolicyHouse() {
        Policy internalPolicy = new Policy();
        internalPolicy.addHouseOrFlat("House",500000,true);
        double result = internalPolicy.calculate();
        printTestResult(result == 25000,"test Policy for House");
    }
    private void testPolicyFlat() {
        Policy internalPolicy = new Policy();
        internalPolicy.addHouseOrFlat("Flat",95000,false);
        double result = internalPolicy.calculate();
        printTestResult(result == 1900,"test Policy for Flat");
    }
    private void testPolicyFireLessTwoThousand() {
        Policy internalPolicy = new Policy();
        internalPolicy.addSubItem("Item1",150,true);
        double result = internalPolicy.calculate();
        printTestResult(result == 4.50,"test Policy for Fire < 2000");
    }
    private void testPolicyTheftLessTwoThousand() {
        Policy internalPolicy = new Policy();
        internalPolicy.addSubItem("Item2",150,false);
        double result = internalPolicy.calculate();
        printTestResult(result == 3,"test Policy for Theft < 2000");
    }
    private void testPolicyFireMoreTwoThousand() {
        Policy internalPolicy = new Policy();
        internalPolicy.addSubItem("Item3",2100,true);
        double result = internalPolicy.calculate();
        printTestResult(result == 84,"test Policy for Fire > 2000");
    }
    private void testPolicyTheftMoreTwoThousand() {
        Policy internalPolicy = new Policy();
        internalPolicy.addSubItem("Item4",2500,false);
        double result = internalPolicy.calculate();
        printTestResult(result == 25,"test Policy for Theft > 2000");
    }
    private void testComplex() {
        policy.addHouseOrFlat("House",500000,true);
        policy.addHouseOrFlat("Flat",95000,false);
        policy.addSubItem("Item1",150,true);
        policy.addSubItem("Item2",150,false);
        policy.addSubItem("Item3",2100,true);
        policy.addSubItem("Item4",2500,false);
        double result = policy.calculate();
        printTestResult(result == 27016.50,"Complex test");
        printTestResult(policy.getArrayRecordsCount() == 6,"test array records count");
    }
    private void printTestResult(boolean isResultOk,String policyTestName) {
        if (isResultOk) {
            System.out.println("Policy test - " + policyTestName + " = OK");
        } else {
            System.out.println("Policy test - " + policyTestName + " = FAIL");
        }
    }
}
