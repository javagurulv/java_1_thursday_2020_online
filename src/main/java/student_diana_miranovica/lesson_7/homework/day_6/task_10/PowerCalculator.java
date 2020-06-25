package student_diana_miranovica.lesson_7.homework.day_6.task_10;

 class PowerCalculator {

     public int exponentiation(int base, int power){
        int result = 1;
        for(int i = 1; i <= power; i++){
            result = result*base;
        }
        return result;
     }

}
