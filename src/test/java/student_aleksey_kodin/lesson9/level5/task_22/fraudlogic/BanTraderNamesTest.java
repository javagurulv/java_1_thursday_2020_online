package student_aleksey_kodin.lesson9.level5.task_22.fraudlogic;

import org.junit.Test;
import student_aleksey_kodin.lesson9.level5.task_22.Trader;
import student_aleksey_kodin.lesson9.level5.task_22.Transaction;

import static org.junit.Assert.*;

public class BanTraderNamesTest {

    @Test
    public void checkBanNames_waitingTrue() {
        Trader trader = new Trader("Pokemon", "Сидней", "Германия");
        Transaction transaction = new Transaction(trader, 1005);
        BanTraderNames banTraderNames = new BanTraderNames();

        boolean result = banTraderNames.checkBanNames(transaction);

        assertTrue(result);
    }

    @Test
    public void checkBanNames_waitingFalse() {
        Trader trader = new Trader("AnyName", "Сидней", "Германия");
        Transaction transaction = new Transaction(trader, 1005);
        BanTraderNames banTraderNames = new BanTraderNames();

        boolean result = banTraderNames.checkBanNames(transaction);

        assertFalse(result);
    }
}