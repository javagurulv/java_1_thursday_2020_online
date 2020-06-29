package student_oleg_ivanov.lesson7.Day6.Task10;

class PowerCalculator {
    public int calculator(int numbers, int power){
        int result = numbers;
        for (int i = 1; i < power; i++){
            result = result * numbers;

        }
        return result;

    }
}
