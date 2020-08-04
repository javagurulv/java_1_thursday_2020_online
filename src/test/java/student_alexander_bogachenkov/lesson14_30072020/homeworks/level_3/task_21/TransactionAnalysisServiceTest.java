package student_alexander_bogachenkov.lesson14_30072020.homeworks.level_3.task_21;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    @Test
    public void shouldReturnAllTransactionsByYear2011() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();
        List<Transaction> actual = service.getAllTransactionsByYear(data.getTransactions(), 2011);
        assertEquals(2, actual.size());
    }

    @Test
    public void shouldReturnAllTransactionsByYear2012() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();
        List<Transaction> actual = service.getAllTransactionsByYear(data.getTransactions(), 2012);
        assertEquals(4, actual.size());
    }
}