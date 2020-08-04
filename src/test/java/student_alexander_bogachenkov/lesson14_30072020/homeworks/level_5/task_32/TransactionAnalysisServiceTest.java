package student_alexander_bogachenkov.lesson14_30072020.homeworks.level_5.task_32;

import org.junit.Test;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    @Test
    public void isWorkingInMilan() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();
        boolean actual = service.isWorkingInMilan(data.getTransactions());
        boolean expected = true;
        assertEquals(expected, actual);
    }
}