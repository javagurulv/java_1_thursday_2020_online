package student_vadims_vladisevs.lesson7.day_6.Task_10;


class PowerCalculator {

    public int calculate(int number, int power){
        int result = number;

        for (int i = 1; i < power; i++){
            result = result * number;
        }
        return result;
    }
}
