package student_oleg_ivanov.lesson9.day1.task5;

public class Safe {
    private int pin;
    private double moneyAmountInSafe;

    public Safe(int pin, double moneyAmountInSafe) {
        this.pin = pin;
        this.moneyAmountInSafe = moneyAmountInSafe;
    }

    public void getMoneyFromSafe(int UserPin, double moneyToGetFromSafe) {
        if (UserPin == pin) {
            this.moneyAmountInSafe = moneyAmountInSafe - moneyToGetFromSafe;
        }
    }
    public void putMoneyToSafe( int UserPin, double addMoneyToSafe) {
        if (UserPin == pin){
            this.moneyAmountInSafe = moneyAmountInSafe + addMoneyToSafe;
        }
    }
    public  double getMoneyAmountInSafe() {
        return moneyAmountInSafe;
    }

}
