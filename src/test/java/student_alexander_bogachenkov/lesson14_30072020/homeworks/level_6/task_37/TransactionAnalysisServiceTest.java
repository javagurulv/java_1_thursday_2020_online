package student_alexander_bogachenkov.lesson14_30072020.homeworks.level_6.task_37;

import org.junit.Test;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    @Test
    public void shouldReturnTraderNames() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();
        String actual = service.getTraderNames(data.getTransactions()) ;
        String expected = "Alan,Brian,Mario,Raoul";
        assertEquals(expected, actual);
    }
}