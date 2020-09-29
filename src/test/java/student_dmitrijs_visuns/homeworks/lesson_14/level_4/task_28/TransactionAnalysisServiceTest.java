package student_dmitrijs_visuns.homeworks.lesson_14.level_4.task_28;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    @Test
    public void shouldGet2UniqueTransactionTradersCities () {
        TransactionAnalysisService testService = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();

        Set<String> result = testService.findAllTransactionTradersUniqueCities(testData.getTransactions());
        assertEquals(2, result.size());
        assertTrue(result.contains("Milan"));
        assertTrue(result.contains("Cambridge"));

    }
}