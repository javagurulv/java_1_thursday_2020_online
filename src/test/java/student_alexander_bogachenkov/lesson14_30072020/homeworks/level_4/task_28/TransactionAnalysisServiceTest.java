package student_alexander_bogachenkov.lesson14_30072020.homeworks.level_4.task_28;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    @Test
    public void getAllUniqueTraderCities() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();
        Set<String> actual = service.getAllUniqueTraderCities(data.getTransactions());
        assertTrue(actual.contains("Milan"));
        assertTrue(actual.contains("Cambridge"));
        assertEquals(2, actual.size());
    }
}