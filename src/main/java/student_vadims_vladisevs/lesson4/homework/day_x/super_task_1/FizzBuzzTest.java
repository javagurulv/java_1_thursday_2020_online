package student_vadims_vladisevs.lesson4.homework.day_x.super_task_1;


class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();

        test.testDivideByThree();
        test.testDivideByFive();
        test.testDivideByThreeAndFive();
        test.testNotDivideByThreeAndFive();

    }



    public void testNotDivideByThreeAndFive() {
        FizzBuzz test = new FizzBuzz();
        int number = 22;
        String result = test.detect(number);

        if (result.equals("" + number)) {
            System.out.println("The number is NOT divided by three and five test = OK");
        } else {
            System.out.println("The number is NOT divided by three and five test = FAIL");
        }
    }


    public void testDivideByThreeAndFive() {
        FizzBuzz test = new FizzBuzz();

        String result = test.detect(30);

        if (result.equals("FizzBuzz")) {
            System.out.println("The number is divided by three and five test = OK");
        } else {
            System.out.println("The number is divided by three and five test = FAIL");
        }
    }


    public void testDivideByFive() {
        FizzBuzz test = new FizzBuzz();

        String result = test.detect(25);

        if (result.equals("Buzz")) {
            System.out.println("The number is divided by five test = OK");
        } else {
            System.out.println("The number is divided by five test = FAIL");
        }
    }


    public void testDivideByThree(){
        FizzBuzz test = new FizzBuzz();

        String result = test.detect(9);

        if (result.equals("Fizz")){
            System.out.println("The number is divided by three test = OK");
        }
        else {
            System.out.println("The number is divided by three test = FAIL");
        }

    }

}
