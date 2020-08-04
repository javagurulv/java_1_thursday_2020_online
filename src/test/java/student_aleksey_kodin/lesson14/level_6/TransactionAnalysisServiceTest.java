package student_aleksey_kodin.lesson14.level_6;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.OptionalInt;

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
    public void findMaxValue() {
        OptionalInt result = transactionAnalysisService.findMaxValue(transactions);
        result.ifPresent(r -> assertEquals(r, 1000));
    }

    @Test
    public void findMinValue() {
        OptionalInt result = transactionAnalysisService.findMinValue(transactions);
        result.ifPresent(r -> assertEquals(r, 300));
    }

    @Test
    public void TradersNames() {
        String result = transactionAnalysisService.TradersNames(transactions);
        assertEquals(result, "Alan,Brian,Mario,Raoul");
    }

    @Test
    public void TradersCities() {
        String result = transactionAnalysisService.TradersCities(transactions);
        assertEquals(result, "Cambridge,Milan");
    }
}