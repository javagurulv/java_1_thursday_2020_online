package student_dmitrijs_visuns.homeworks.lesson_7.day_6.task_10;

class PowerCalculator {

    public double mainCalculator (double baseNumber, int power) {
        if (power > 0) {
            return calculatePositivePower(baseNumber, power);
        }
        if (power < 0) {
            return calculateNegativePower(baseNumber, power);
        }
        else {
            return calculateZeroPower();
        }

    }

    public double calculatePositivePower(double baseNumber, int power) {
        double resultNumber = 1;
        for (int i = 1; i <= power; i++) {
            resultNumber = (resultNumber * baseNumber);
        }
        return resultNumber;
    }

    public double calculateNegativePower(double baseNumber, double power) {
        double resultNumber = 1;
        for (int i = 1; i <= -power; i++) {
            resultNumber = (resultNumber * baseNumber);
        }
        return (1 / resultNumber);
    }


    public double calculateZeroPower() {
        return 1;
    }

}

