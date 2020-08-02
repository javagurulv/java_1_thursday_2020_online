package student_aleksey_kodin.lesson14.level_4;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
    public void findAllYears() {
        List<Integer> result = transactionAnalysisService.findAllYears(transactions);
        assertEquals(result.size(), 6);
    }

    @Test
    public void findAllYearsNoDuplicates() {
        Set<Integer> result = transactionAnalysisService.findAllYearsNoDuplicates(transactions);
        assertEquals(result.size(), 2);
    }

    @Test
    public void findAllTradersNoDuplicates() {
        Set<String> result = transactionAnalysisService.findAllTradersNoDuplicates(transactions);
        assertEquals(result.size(), 4);
    }

    @Test
    public void findAllTradersCitiesNoDuplicates() {
        Set<String> result = transactionAnalysisService.findAllTradersCitiesNoDuplicates(transactions);
        assertEquals(result.size(), 2);
    }

    @Test
    public void findAllTradersFromCambridge() {
        Set<Trader> result = transactionAnalysisService.findAllTradersFromCambridge(transactions);
        assertEquals(result.size(), 3);
    }

    public void findTradersCities() {
        Set<Trader> result = transactionAnalysisService.findTradersCities(transactions, "Milan");
        assertEquals(result.size(), 1);

        List<Trader> traders = new ArrayList<>(result);
        assertEquals(traders.get(0).getName(), "Mario");
    }
}