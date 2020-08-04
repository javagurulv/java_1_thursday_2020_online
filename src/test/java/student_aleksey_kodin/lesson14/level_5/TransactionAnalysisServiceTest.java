package student_aleksey_kodin.lesson14.level_5;

import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {
    private final TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
    private final TransactionTestData transactionTestData = new TransactionTestData();
    private List<Transaction> transactions;

    @Before
    public void startUp() {
        transactions = transactionTestData.getTransactions();
    }

    @Test
    public void isTraderFromCity_v1() {
        boolean result = transactionAnalysisService.isTraderFromCity(transactions,"Milan");
        assertTrue(result);
    }

    @Test
    public void isTraderFromCity_v2() {
        boolean result = transactionAnalysisService.isTraderFromCity(transactions,"Riga");
        assertFalse(result);
    }

    @Test
    public void isTraderFromCity_v3() {
        boolean result = transactionAnalysisService.isTraderFromCity(transactions,"Cambridge");
        assertTrue(result);
    }

}