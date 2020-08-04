package student_alexander_bogachenkov.lesson14_30072020.homeworks.level_4.task_31;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    @Test
    public void shouldReturnAllTraderNamesFromCity_whenCityIsCambridge() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();
        List<String> actual = service.getAllTraderNamesFromCity(data.getTransactions(), "Cambridge");
        assertEquals("Brian", actual.get(0));
        assertEquals("Raoul", actual.get(1));
        assertEquals("Alan", actual.get(2));
        assertEquals(3, actual.size());
    }

    @Test
    public void shouldReturnAllTraderNamesFromCity_whenCityIsMilan() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();
        List<String> actual = service.getAllTraderNamesFromCity(data.getTransactions(), "Milan");
        assertEquals("Mario", actual.get(0));
        assertEquals(1, actual.size());
    }
}