package student_aleksey_kodin.lesson9.level5.task_22.fraudlogic;

import org.junit.Test;
import student_aleksey_kodin.lesson9.level5.task_22.Trader;
import student_aleksey_kodin.lesson9.level5.task_22.Transaction;

import static org.junit.Assert.*;

public class BanTraderCityTest {

    @Test
    public void checkBanCity_waitingTrue() {
        Trader trader = new Trader("Pokemon", "Сидней", "Германия");
        Transaction transaction = new Transaction(trader, 1005);
        BanTraderCity banTraderCity = new BanTraderCity();

        boolean result = banTraderCity.checkBanCity(transaction);

        assertTrue(result);
    }

    @Test
    public void checkBanCity_waitingFalse() {
        Trader trader = new Trader("Pokemon", "London", "Германия");
        Transaction transaction = new Transaction(trader, 1005);
        BanTraderCity banTraderCity = new BanTraderCity();

        boolean result = banTraderCity.checkBanCity(transaction);

        assertFalse(result);
    }
}