package student_alexander_bogachenkov.lesson14_30072020.homeworks.level_3.task_19;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    @Test
    public void shouldReturnAll2011YearTransactions() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();
        List<Transaction> actual = service.getAll2011YearTransactions(data.getTransactions());
        assertEquals(2, actual.size());
    }

}