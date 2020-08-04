package student_alexander_bogachenkov.lesson14_30072020.homeworks.level_6.task_38;

import org.junit.Test;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    @Test
    public void shouldReturnTraderCities() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();
        String actual = service.getTraderCities(data.getTransactions()) ;
        String expected = "Cambridge,Milan";
        assertEquals(expected, actual);
    }
}