package student_edgars_lukjanskis.lession_5;

public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Edgar");

        Transaction[] transactions = new Transaction[4];
        transactions[0] = new Transaction(true,100);
        transactions[1] = new Transaction(false,90);
        transactions[2] = new Transaction(true,1000);
        transactions[3] = new Transaction(false,100);





    }
}
