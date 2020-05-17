package student_vadim_sokolenko;

public class HumanAgeClasifierTest {
    public static void main(String[] args) {
    HumanAgeClasifierTest testRunner = new HumanAgeClasifierTest();
    testRunner.shouldClassifyBaby();
    }
    void shouldClassifyBaby(){
        HumanAgeClassifier victim = new HumanAgeClassifier();

        int age = 3;
        String expectedResult = "baby";

        String actualResult = victim.classify(age);

        if(expectedResult.equals(actualResult)){
            System.out.println("shouldClassifyBaby has passed");
        }else {
            System.out.println("shouldClassifyBaby FAILED");
            System.out.println("Expected" + expectedResult + "actual" + actualResult);
        }


    }
}
