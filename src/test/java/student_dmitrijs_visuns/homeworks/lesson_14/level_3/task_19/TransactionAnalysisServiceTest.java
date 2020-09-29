package student_dmitrijs_visuns.homeworks.lesson_14.level_3.task_19;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    @Test
    public void shouldGet2TransactionsBy2011 () {
    TransactionAnalysisService testService = new TransactionAnalysisService();
    TransactionTestData testData = new TransactionTestData();

    List<Transaction> result = testService.transactionsBy2011(testData.getTransactions());
    assertEquals(2, result.size());
    }
}