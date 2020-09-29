package student_dmitrijs_visuns.homeworks.lesson_14.level_4.task_26;

import org.junit.Test;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    @Test
    public void shouldGet2TransactionsYears () {
        TransactionAnalysisService testService = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();

        Set<Integer> result = testService.findAllTransactionsUniqueYears(testData.getTransactions());
        assertTrue(result.size() == 2);
        assertTrue(result.contains(Integer.valueOf(2011)));
        assertTrue(result.contains(Integer.valueOf(2012)));

    }

}