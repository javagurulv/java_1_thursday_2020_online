package student_alexander_bogachenkov.lesson14_30072020.homeworks.level_3.task_22;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    @Test
    public void shouldSortFromSmallestToLargestValue() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();
        List<Transaction> actual = service.sortFromSmallestToLargestValue(data.getTransactions());
        assertEquals(300, actual.get(0).getValue());
        assertEquals(400, actual.get(1).getValue());
        assertEquals(700, actual.get(2).getValue());
        assertEquals(710, actual.get(3).getValue());
        assertEquals(950, actual.get(4).getValue());
        assertEquals(1000, actual.get(5).getValue());
    }
}