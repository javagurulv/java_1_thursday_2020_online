package student_alexander_bogachenkov.lesson14_30072020.homeworks.level_4.task_29;

import org.junit.Test;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    @Test
    public void getAllTraderNamesFromCambridge() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();
        List<String> actual = service.getAllTraderNamesFromCambridge(data.getTransactions());
        assertTrue(actual.contains("Raoul"));
        assertTrue(actual.contains("Alan"));
        assertTrue(actual.contains("Brian"));
        assertEquals(3, actual.size());
    }
}