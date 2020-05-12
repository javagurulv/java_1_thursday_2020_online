package student_alexander_bogachenkov.lesson3_07052020.lesson_code;

class BankAccount {

    private final String owner;
    private int moneyAmount;

    public BankAccount (String owner) {
        this.owner = owner;
        this.moneyAmount = 0;
    }

    public void addMoney(int moneyToAdd) {
        this.moneyAmount = this.moneyAmount + moneyToAdd;
    }

    public void removeMoney(int moneyToRemove) {
        this.moneyAmount = this.moneyAmount - moneyToRemove;
    }

    public void printStatusToConsole() {
        System.out.println("Owner = " + owner);
        System.out.println("Money = " + moneyAmount);
    }
}
