package student_oleg_ivanov.lesson3;

class BankAccount {
    private final String owner; //владелец
    private double moneyAmount; //сумма денег

    public BankAccount (String owner) {
        this.owner = owner;
        this.moneyAmount = 0;
    }

    public double addMoney(double moneyToAdd) {
        this.moneyAmount = moneyAmount + moneyToAdd;
        return this.moneyAmount;
    }

    public double removeMoney (double moneyToRemove) {
        this.moneyAmount = this.moneyAmount - moneyToRemove;
        return this.moneyAmount;
    }
    public void printStatusToConsole() {
        System.out.println("Owen = " + owner);
        System.out.println("Money = " + moneyAmount);
    }

}
