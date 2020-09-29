package student_dmitrijs_visuns.homeworks.lesson_14.level_3.task_24;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    @Test
    public void shouldGetYear2011TransactionsAndSortByValue () {
        TransactionAnalysisService testService = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();

        List<Transaction> result = testService.findTransactionsByYearAndSortByValue
                        (testData.getTransactions(),
                        2012);
        assertEquals(4, result.size());
        assertTrue(result.get(0).getValue() == 700);
        assertTrue(result.get(1).getValue() == 710);
        assertTrue(result.get(2).getValue() == 950);
        assertTrue(result.get(3).getValue() == 1000);
    }

}