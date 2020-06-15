package student_diana_miranovica.lesson6.home_works.day_1.task_3;

 class FizzBuzz {


     public String detect(int number) {

         if (divisionToThreeAndFive(number)) {
             return "FizzBuzz";
         }
         else if (divisionToThree(number)) {
             return "Fizz";
         }
         else if (divisionToFive(number)) {
             return "Buzz";
         }
         else return  Integer.toString(number);
     }

     public boolean divisionToThree(int number){
         return number % 3 == 0;
     }
     public boolean divisionToFive(int number){
         return number % 5 == 0;
     }
     public boolean divisionToThreeAndFive(int number){
        // для более лёгкого чтения кода нужны скобки!
     	return number % 3 == 0 && number % 5 ==0;
     }
}
