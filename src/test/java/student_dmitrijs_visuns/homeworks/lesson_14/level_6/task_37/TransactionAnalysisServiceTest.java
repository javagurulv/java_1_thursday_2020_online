package student_dmitrijs_visuns.homeworks.lesson_14.level_6.task_37;

import org.junit.Test;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    @Test
    public void shouldPresentAllTradersAsString () {
        TransactionAnalysisService testService = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();

        String result = testService.getAllTradersNames(testData.getTransactions());
        assertEquals("Alan,Brian,Mario,Raoul", result);

    }

}