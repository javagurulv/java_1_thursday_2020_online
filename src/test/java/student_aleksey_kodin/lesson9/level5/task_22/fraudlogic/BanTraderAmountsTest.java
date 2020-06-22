package student_aleksey_kodin.lesson9.level5.task_22.fraudlogic;

import org.junit.Test;
import student_aleksey_kodin.lesson9.level5.task_22.Trader;
import student_aleksey_kodin.lesson9.level5.task_22.Transaction;
import static org.junit.Assert.*;

public class BanTraderAmountsTest {

    @Test
    public void checkBanAmounts_waitingTrueMore1000() {
        Trader trader = new Trader("AnyName", "Сидней", "Германия");
        Transaction transaction = new Transaction(trader, 1005);
        BanTraderAmounts banTraderAmounts = new BanTraderAmounts();

        boolean result = banTraderAmounts.checkBanAmounts(transaction);

        assertTrue(result);
    }

    @Test
    public void checkBanAmounts_waitingFalse() {
        Trader trader = new Trader("AnyName", "Сидней", "Германия");
        Transaction transaction = new Transaction(trader, 105);
        BanTraderAmounts banTraderAmounts = new BanTraderAmounts();

        boolean result = banTraderAmounts.checkBanAmounts(transaction);

        assertFalse(result);
    }

}