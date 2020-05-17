package student_diana_miranovica.lesson4.homeworks.day_4;

 class CalculatorTest {
     public static void main(String[] args) {
         CalculatorTest calculatorTest = new CalculatorTest();
         calculatorTest.sumTest();
         calculatorTest.multiplicationTest();
         calculatorTest.subTest();
         calculatorTest.divisionTest();
         calculatorTest.evenTest();
         calculatorTest.equalTest();
         calculatorTest.notEqualTest();
     }

     public void sumTest() {
         int firstNumber = 10;
         int secondNumber = 5;
         Calculator calculator = new Calculator();
         int result = calculator.sum(firstNumber, secondNumber);
         if (result == 15) {
             System.out.println("Sum test = OK");
         } else {
             System.out.println("Sum test = FAIL");
         }
     }
     public void multiplicationTest(){
         int firstNumber = 25;
         int secondNumber = 3;
         Calculator calculator = new Calculator();
         int result = calculator.multiplication(firstNumber,secondNumber);
         if (result == 75){
             System.out.println("Multiplication Test = OK");
         }else {
             System.out.println("Multiplication Test = Fail");
         }
     }
     public void subTest(){
         int firstNumber = 5;
         int secondNumber = 9;
         Calculator calculator = new Calculator();
         int result = calculator.sub(firstNumber,secondNumber);
         if (result == -4){
             System.out.println("Sub Test = OK");
         }else {
             System.out.println("Sub Test = Fail");
         }
     }
     public void divisionTest(){
         int firstNumber = 7;
         int secondNumber = 7;
         Calculator calculator = new Calculator();
         int result = calculator.division(firstNumber,secondNumber);
         if (result == 1){
             System.out.println("Division Test = OK");
         }else {
             System.out.println("Division Test = Fail");
         }
     }
     public void evenTest(){
         int firstNumber =10;
         Calculator calculator = new Calculator();
         boolean result = calculator.even(firstNumber);
         if (result){
             System.out.println("Even Test = OK");
         }else {
             System.out.println("Even Test = Fail");
         }
     }
     public void equalTest(){
         int firstNumber = 12;
         int secondNumber = 12;
         int thirdNumber = 12;
         Calculator calculator = new Calculator();
         boolean result = calculator.equal(firstNumber,secondNumber,thirdNumber);
         if(result){
             System.out.println("Equal Test = OK");
         }else {
             System.out.println("Equal Test = Fail");
         }
     }
     public void notEqualTest(){
         int firstNumber = 7;
         int secondNumber = 67;
         int thirdNumber = -6;
         Calculator calculator = new Calculator();
         boolean result = calculator.notEqual(firstNumber,secondNumber,thirdNumber);
         if(result){
             System.out.println("NotEven Test = OK");
         }else {
             System.out.println("NotEven Test = Fail");
         }
     }

}
