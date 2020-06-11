package student_alexander_bogachenkov.lesson7_04062020.homeworks.day_6.task_10;

class PowerCalculator {

    public int raiseToPower(int number, int power) {
        if (power == 0) {
            return 1;
        }

        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= number;
        }
        return result;
    }
}
