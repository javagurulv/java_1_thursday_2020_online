package student_alexander_bogachenkov.lesson14_30072020.homeworks.level_6.task_36;

import org.junit.Test;

import java.util.OptionalInt;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    @Test
    public void shouldReturnMinValue() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();
        OptionalInt actual = service.getMinValue(data.getTransactions());
        OptionalInt expected = OptionalInt.of(300);
        assertEquals(expected, actual);
    }
}