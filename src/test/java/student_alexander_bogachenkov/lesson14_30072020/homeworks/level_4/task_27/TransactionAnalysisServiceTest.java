package student_alexander_bogachenkov.lesson14_30072020.homeworks.level_4.task_27;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    @Test
    public void getAllUniqueTraderNames() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();
        Set<String> actual = service.getAllUniqueTraderNames(data.getTransactions());
        assertTrue(actual.contains("Raoul"));
        assertTrue(actual.contains("Mario"));
        assertTrue(actual.contains("Alan"));
        assertTrue(actual.contains("Brian"));
        assertEquals(4, actual.size());
    }

}