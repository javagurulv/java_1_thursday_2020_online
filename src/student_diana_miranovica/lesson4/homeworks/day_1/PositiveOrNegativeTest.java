package student_diana_miranovica.lesson4.homeworks.day_1;

class PositiveOrNegativeTest {
    public static void main(String[] args) {
        PositiveOrNegativeTest positiveOrNegativeTest = new PositiveOrNegativeTest();
        positiveOrNegativeTest.Test1();
        positiveOrNegativeTest.Test2();

    }
    //Test 1: f= 13 , fr= positive, s= -1, sr= negative
    public void Test1(){
        int firstNumber = 13;
        int secondNumber = -1;

        PositiveOrNegative positiveOrNegative = new PositiveOrNegative();
        String firstResult = "Your value is positive!";
        String secondResult = "Your value is negative!";
        if(firstResult == "Your value is positive"){
            System.out.println("Test 1 - OK");
        }else{
            System.out.println("Test 1 - Fail");
        }
        if(secondResult == "Your value is negative"){
            System.out.println("Test 1 - OK");
        }else{
            System.out.println("Test 1 - Fail");
        }

    }
    //Test 2: f= -56 , fr = negative, s = 135 , sr = positive
    public void Test2(){
        int firstNumber = -56;
        int secondNumber = 135;

        PositiveOrNegative positiveOrNegative = new PositiveOrNegative();
        String firstResult = "Your value is negative!";
        String secondResult = "Your value is positive!";
        if(firstResult == "Your value is negative"){
            System.out.println("Test 1 - OK");
        }else{
            System.out.println("Test 1 - Fail");
        }
        if(secondResult == "Your value is positive"){
            System.out.println("Test 1 - OK");
        }else{
            System.out.println("Test 1 - Fail");
        }
    }
}
