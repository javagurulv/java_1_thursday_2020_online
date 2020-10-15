package student_dmitrijs_visuns.homeworks.lesson_14.level_4.task_29;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    @Test
    public void shouldGet3TradersFromCambridge () {
        TransactionAnalysisService testService = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();

        Set<String> result = testService.findAllCambridgeTradersByTransaction(testData.getTransactions());
        assertEquals(3, result.size());
        assertTrue(result.contains("Raoul"));
        assertTrue(result.contains("Alan"));
        assertTrue(result.contains("Brian"));

    }

}