package student_diana_miranovica.lesson4.homeworks.day_4;

 class Calculator {


     public int sum(int firstNumber, int secondNumber) {
         return firstNumber + secondNumber;
     }
     public int sub(int firstNumber, int secondNumber) {
             return (firstNumber - secondNumber);
     }
     public int multiplication(int firstNumber, int secondNumber) {
         return firstNumber * secondNumber;
     }
     public int division(int firstNumber, int secondNumber) {
         return (firstNumber / secondNumber);
     }
    public boolean even(int number){
         if( number % 2 == 0) {
             return true;
         }else {
             return false;

         }
    }
    public boolean equal(int firstNumber, int secondNumber,int thirdNumber){
        return firstNumber == secondNumber&& secondNumber  == thirdNumber && firstNumber == thirdNumber;
    }
    public boolean notEqual(int firstNumber, int secondNumber,int thirdNumber ){
         return  firstNumber != secondNumber&& secondNumber != thirdNumber && firstNumber != thirdNumber;
    }
     public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
         return Math.max(firstNumber,secondNumber);
     }

     public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber){
        return Math.max(firstNumber, Math.max(secondNumber, thirdNumber));


     }

 }
