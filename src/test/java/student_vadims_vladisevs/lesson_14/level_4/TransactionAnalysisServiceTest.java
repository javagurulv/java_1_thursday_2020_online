package student_vadims_vladisevs.lesson_14.level_4;

import org.junit.Test;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {
    TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
    TransactionTestData transactionTestData = new TransactionTestData();
    List<Transaction> allTransactions = transactionTestData.getTransactions();

    @Test
    public void findTransactionYears() {
        List<Integer> actual = transactionAnalysisService.findTransactionYears(allTransactions);
        assertEquals(6, actual.size());
    }

    @Test
    public void findUniqueTransactionYears() {
        Set<Integer> actual = transactionAnalysisService.findUniqueTransactionYears(allTransactions);
        assertEquals(2, actual.size());
    }

    @Test
    public void findUniqueTradersNames() {
        Set<String> actual = transactionAnalysisService.findUniqueTradersNames(allTransactions);
        assertEquals(4, actual.size());
    }

    @Test
    public void findUniqueTradersCities() {
        Set<String> actual = transactionAnalysisService.findUniqueTradersCities(allTransactions);
        assertEquals(2, actual.size());
    }

    @Test
    public void findUniqueTradersFromCambridge() {
        Set<String> actual = transactionAnalysisService.findUniqueTradersFromCambridge(allTransactions);
        assertEquals(3, actual.size());
    }

    @Test
    public void findUniqueTradersByCity_Milan() {
        Set<String> actual = transactionAnalysisService.findUniqueTradersByCity(allTransactions, "Milan");
        assertEquals(1, actual.size());
    }

    @Test
    public void findUniqueTradersByCity_Cambridge() {
        Set<String> actual = transactionAnalysisService.findUniqueTradersByCity(allTransactions, "Cambridge");
        assertEquals(3, actual.size());
    }

    @Test
    public void findUniqueTradersByCity_London() {
        Set<String> actual = transactionAnalysisService.findUniqueTradersByCity(allTransactions, "London");
        assertEquals(0, actual.size());
    }
}