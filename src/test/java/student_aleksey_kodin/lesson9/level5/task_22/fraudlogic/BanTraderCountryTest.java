package student_aleksey_kodin.lesson9.level5.task_22.fraudlogic;

import org.junit.Test;
import student_aleksey_kodin.lesson9.level5.task_22.Trader;
import student_aleksey_kodin.lesson9.level5.task_22.Transaction;

import static org.junit.Assert.*;

public class BanTraderCountryTest {

    @Test
    public void checkBanCountry_waitingTrue_1() {
        Trader trader = new Trader("Pokemon", "Сидней", "Германия");
        Transaction transaction = new Transaction(trader, 1005);
        BanTraderCountry banTraderCountry = new BanTraderCountry();

        boolean result = banTraderCountry.checkBanCountry(transaction);

        assertTrue(result);
    }

    @Test
    public void checkBanCountry_waitingTrue_2() {
        Trader trader = new Trader("Pokemon", "Сидней", "Ямайка");
        Transaction transaction = new Transaction(trader, 1005);
        BanTraderCountry banTraderCountry = new BanTraderCountry();

        boolean result = banTraderCountry.checkBanCountry(transaction);

        assertTrue(result);
    }

    @Test
    public void checkBanCountry_waitingFalse() {
        Trader trader = new Trader("Pokemon", "Сидней", "China");
        Transaction transaction = new Transaction(trader, 1005);
        BanTraderCountry banTraderCountry = new BanTraderCountry();

        boolean result = banTraderCountry.checkBanCountry(transaction);

        assertFalse(result);
    }
}