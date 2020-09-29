package student_dmitrijs_visuns.homeworks.lesson_14.level_4.task_27;

import org.junit.Test;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    @Test
    public void shouldGet4UniqueTradersNames () {
        TransactionAnalysisService testService = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();

        Set<String> result = testService.findAllTransactionTradersUniqueNames(testData.getTransactions());
        assertEquals(4, result.size());
        assertTrue(result.contains("Raoul"));
        assertTrue(result.contains("Mario"));
        assertTrue(result.contains("Alan"));
        assertTrue(result.contains("Brian"));

    }

}