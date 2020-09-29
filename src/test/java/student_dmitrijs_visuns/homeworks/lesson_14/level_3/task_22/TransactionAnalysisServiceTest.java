package student_dmitrijs_visuns.homeworks.lesson_14.level_3.task_22;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    @Test
    public void shouldGetTransactionsSortedByValue () {
        TransactionAnalysisService testService = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();

        List<Transaction> result = testService.sortTransactionsByValue(testData.getTransactions());
        assertTrue(result.get(0).getValue() == 300);
        assertTrue(result.get(2).getValue() == 700);
        assertTrue(result.get(3).getValue() == 710);
        assertTrue(result.get(5).getValue() == 1000);
    }

}