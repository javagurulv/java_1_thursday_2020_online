package student_alexander_bogachenkov.lesson14_30072020.homeworks.level_3.task_24;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    @Test
    public void sortFromSmallestToLargestValueInYear2011() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();
        List<Transaction> actual = service.sortFromSmallestToLargestValueInYear2011(data.getTransactions());
        assertEquals(300, actual.get(0).getValue());
        assertEquals(400, actual.get(1).getValue());
    }
}