package student_aleksey_kodin.lesson14.level_3;

import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;
import student_aleksey_kodin.lesson14.level_3.Transaction;
import student_aleksey_kodin.lesson14.level_3.TransactionAnalysisService;
import student_aleksey_kodin.lesson14.level_3.TransactionTestData;

public class TransactionAnalysisServiceTest {
    private final TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
    private final TransactionTestData transactionTestData = new TransactionTestData();
    private List<Transaction> testTransactions;

    @Before
    public void startUp() {
        testTransactions = transactionTestData.getTransactions();
    }

    @Test
    public void searchAllRecords2011() {
        List<Transaction> searchResult = transactionAnalysisService.findTransactionsByYear(testTransactions, 2011);

        assertEquals(searchResult.size(), 2);
    }

    @Test
    public void searchAllRecords2012() {
        List<Transaction> searchResult = transactionAnalysisService.findTransactionsByYear(testTransactions, 2012);

        assertEquals(searchResult.size(), 4);
    }

    @Test
    public void sortByValueMinToMax() {
        List<Transaction> searchResult = transactionAnalysisService.sortTransactionsByValueUp(testTransactions);

        assertEquals(searchResult.get(0).getValue(), 300);
        assertEquals(searchResult.get(1).getValue(), 400);
        assertEquals(searchResult.get(2).getValue(), 700);
        assertEquals(searchResult.get(3).getValue(), 710);
        assertEquals(searchResult.get(4).getValue(), 950);
        assertEquals(searchResult.get(5).getValue(), 1000);
    }

    @Test
    public void sortByValueMaxToMin() {
        List<Transaction> searchResult = transactionAnalysisService.sortTransactionsByValueDown(testTransactions);

        assertEquals(searchResult.get(5).getValue(), 300);
        assertEquals(searchResult.get(4).getValue(), 400);
        assertEquals(searchResult.get(3).getValue(), 700);
        assertEquals(searchResult.get(2).getValue(), 710);
        assertEquals(searchResult.get(1).getValue(), 950);
        assertEquals(searchResult.get(0).getValue(), 1000);
    }

    @Test
    public void allTransactions2011AndSortByValueMinToMax() {
        List<Transaction> searchResult = transactionAnalysisService.findTransactionsBy2011AndSort(testTransactions);

        assertEquals(searchResult.size(),2);
        assertEquals(searchResult.get(0).getValue(), 300);
        assertEquals(searchResult.get(1).getValue(), 400);
    }
}