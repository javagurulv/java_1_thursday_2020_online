package student_dmitrijs_visuns.homeworks.lesson_14.level_3.task_20;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    @Test
    public void shouldGet2TransactionsBy2011 () {
        TransactionAnalysisService testService = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();

        List<Transaction> result = testService.findTransactionsByYear(testData.getTransactions(), 2011);
        assertEquals(2, result.size());
    }

    @Test
    public void shouldGet2TransactionsBy2012 () {
        TransactionAnalysisService testService = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();

        List<Transaction> result = testService.findTransactionsByYear(testData.getTransactions(), 2012);
        assertEquals(4, result.size());
    }

    @Test
    public void shouldGet2TransactionsBy2013 () {
        TransactionAnalysisService testService = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();

        List<Transaction> result = testService.findTransactionsByYear(testData.getTransactions(), 2013);
        assertEquals(0, result.size());
    }

}