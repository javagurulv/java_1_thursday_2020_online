package student_dmitrijs_visuns.homeworks.lesson_14.level_4.task_30;

import org.junit.Test;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    @Test
    public void shouldGet3TradersFromCambridge () {
        TransactionAnalysisService testService = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();

        List<String> result = testService.findTraderNamesFromCity
                        (testData.getTransactions(),
                         "Cambridge");
        assertEquals(3, result.size());
        assertTrue(result.contains("Raoul"));
        assertTrue(result.contains("Alan"));
        assertTrue(result.contains("Brian"));

    }

    @Test
    public void shouldGet1TraderFromMilan () {
        TransactionAnalysisService testService = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();

        List<String> result = testService.findTraderNamesFromCity
                (testData.getTransactions(),
                        "Milan");
        assertEquals(1, result.size());
        assertTrue(result.contains("Mario"));

    }

}