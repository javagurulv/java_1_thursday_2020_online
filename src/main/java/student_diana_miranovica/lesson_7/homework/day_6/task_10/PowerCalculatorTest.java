package student_diana_miranovica.lesson_7.homework.day_6.task_10;

 class PowerCalculatorTest {

     public static void main(String[] args) {
         PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
         powerCalculatorTest.exponentiationTest1();
         powerCalculatorTest.exponentiationTest2();

     }

     public void exponentiationTest1(){
         PowerCalculator powerCalculator = new PowerCalculator();
         int result = powerCalculator.exponentiation(3,2);
         if(result == 9){
             System.out.println("exponentiation Test 1 - Ok");
         }else {
             System.out.println("exponentiation Test 1 - Fail");
         }
     }
     public void exponentiationTest2(){
         PowerCalculator powerCalculator = new PowerCalculator();
         int result = powerCalculator.exponentiation(13,3);
         if(result == 2197){
             System.out.println("exponentiation Test 2 - Ok");
         }else {
             System.out.println("exponentiation Test 2 - Fail");
         }
     }
}
