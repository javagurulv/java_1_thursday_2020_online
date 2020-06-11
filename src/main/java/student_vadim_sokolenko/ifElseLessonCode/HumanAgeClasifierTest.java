package student_vadim_sokolenko.ifElseLessonCode;

class HumanAgeClasifierTest {
    public static void main(String[] args) {
        HumanAgeClasifierTest testRunner = new HumanAgeClasifierTest();
        testRunner.shouldClassifyBaby();
        testRunner.shouldClasifyIncorrectData();
        testRunner.shouldClassifyBaby0Years();

//    System.out.println("Please enter number:");
//    Scanner scanner = new Scanner(System.in);
//
//    HumanAgeClassifier classifier = new HumanAgeClassifier();
//
//    int age = scanner.nextInt();
//    String result = classifier.classify(age);
//    System.out.println("Result: " + result);

    }

    void shouldClassifyBaby() {
        HumanAgeClassifier victim = new HumanAgeClassifier();

        int age = 3;
        String expectedResult = "baby";

        String actualResult = victim.classify(age);

        printCheckResult(expectedResult,actualResult,"shouldClassifyBaby");


    }


    void shouldClasifyIncorrectData() {
        HumanAgeClassifier victim = new HumanAgeClassifier();

        int age = -100;

        String expectedResult = "Incorrect data";
        String actualResult = victim.classify(age);
        printCheckResult(expectedResult,actualResult,"shouldClasifyIncorrectData");

    }

    void shouldClassifyBaby0Years() {
        HumanAgeClassifier victim = new HumanAgeClassifier();

        int age = 0;
        String expectedResult = "baby";

        String actualResult = victim.classify(age);

        printCheckResult(expectedResult,actualResult,"shouldClassifyBaby0Years");

        }

    void printCheckResult(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + "has passed");
        } else {
            System.out.println(testName + "FAILED");
            System.out.println("Expected" + expectedResult + "actual" + actualResult);

        }

    }}
