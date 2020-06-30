package student_dmitrijs_visuns.homeworks.lesson_9.level_1.task_5;

class Safe2 {

    private int pinCode;
    private double moneyAmountInSafe;

    public Safe2 (int pinCode, int moneyAmountInSafe) {
        this.pinCode = pinCode;
        this.moneyAmountInSafe = moneyAmountInSafe;
    }

    public void getMoneyFromSafe(int providedPinCode, double moneyToGetFromSafe) {
        if (providedPinCode == pinCode) {
            this.moneyAmountInSafe = moneyAmountInSafe - moneyToGetFromSafe;
        }
    }

    public void putMoneyInSafe(int providedPinCode, double moneyToPutInSafe) {
        if (providedPinCode == pinCode) {
            this.moneyAmountInSafe = moneyAmountInSafe + moneyToPutInSafe;
        }
    }


    public double getMoneyAmountInSafe() {
        return moneyAmountInSafe;
    }
}
