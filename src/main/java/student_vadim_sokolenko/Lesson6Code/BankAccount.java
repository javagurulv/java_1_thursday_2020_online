package student_vadim_sokolenko.Lesson6Code;

class BankAccount {

    private String ownerFirstName;
    private String ownerLastName;
    private final int moneyAmount;

    public BankAccount(String ownerFirstName,
                       String ownerLastName,
                       int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;
    }




    public String getOwnerFirstName() {
        return this.ownerFirstName;
    }

    public String getOwnerLastName() {
        return this.ownerFirstName;
    }

    public int getMoneyAmount() {
        return this.moneyAmount;
    }

}

