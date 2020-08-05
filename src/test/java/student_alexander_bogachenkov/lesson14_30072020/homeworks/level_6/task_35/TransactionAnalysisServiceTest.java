package student_alexander_bogachenkov.lesson14_30072020.homeworks.level_6.task_35;

import org.junit.Test;
import java.util.OptionalInt;
import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    @Test
    public void shouldReturnMaxValue() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();
        OptionalInt actual = service.getMaxValue(data.getTransactions());
        OptionalInt expected = OptionalInt.of(1000);
        assertEquals(expected, actual);
    }
}