package student_dmitrijs_visuns.homeworks.lesson_14.level_6.task_38;

import org.junit.Test;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    @Test
    public void shouldPresentAllTradersAsString () {
        TransactionAnalysisService testService = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();

        String result = testService.getAllTradersCities(testData.getTransactions());
        assertEquals("Cambridge,Milan", result);

    }

}