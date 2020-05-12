package student_vadims_vladisevs.lesson3.day_4;

class BankAccount {

    private final String ownerFirstName;
    private final String ownerLastName;
    private final int moneyAmount;

    public BankAccount(String ownerFirstName,
                       String ownerLastName,    //не хватало "," ;
                       int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;                     //вместо "money", нужно писать "moneyAmount";
    }

    public String getOwnerFirstName() {             //не хватало ")" ;
        return this.ownerFirstName;                 //не хватало ";" ;
    }

    public String getOwnerLastName() {              //не хватало "(" ;
        return this.ownerLastName;                 //не хватало ";" ; вместо "ownerFirstName", нужно "ownerLastName";
    }

    public int getMoneyAmount() {                   //вместо "void", нужно "int";
        return this.moneyAmount;
    }

}
