package student_dmitrijs_visuns.homeworks.lesson_14.level_4.task_25;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    @Test
    public void shouldGetYear2011TransactionsAndSortByValue () {
        TransactionAnalysisService testService = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();
        List<Integer> result = testService.findAllTransactionsYears(testData.getTransactions());
        assertEquals(6, result.size());
        assertEquals(Integer.valueOf(2011), result.get(0));
        assertEquals(Integer.valueOf(2012), result.get(5));
    }

}