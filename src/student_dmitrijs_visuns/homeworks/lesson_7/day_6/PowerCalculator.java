package student_dmitrijs_visuns.homeworks.lesson_7.day_6;

class PowerCalculator {

    public static void main(String[] args) {
        PowerCalculator kal = new PowerCalculator();
        kal.mainCalculator(2, 3);
        kal.mainCalculator(3, 0);
        kal.mainCalculator(10, -1);
    }

    public double mainCalculator (double baseNumber, int power) {
        if (power > 0) {
            System.out.println(calculatePositivePower(baseNumber, power));
            return calculatePositivePower(baseNumber, power);

        }
        if (power < 0) {
            System.out.println(calculateNegativePower(baseNumber, power));
            return calculateNegativePower(baseNumber, power);
        }
        else {
            System.out.println(calculateZeroPower());
            return calculateZeroPower();
        }

    }

    public double calculatePositivePower(double baseNumber, int power) {
        double resultNumber = 1;
        for (int cycle = 1; cycle <= power; cycle++) {
            resultNumber = (resultNumber * baseNumber);
        }
        return resultNumber;
    }

    public double calculateNegativePower(double baseNumber, double power) {
        double resultNumber = 1;
        for (int cycle = 1; cycle <= -power; cycle++) {
            resultNumber = (resultNumber * baseNumber);
        }
        return (1 / resultNumber);
    }


    public double calculateZeroPower() {
        return 1;
    }

}

