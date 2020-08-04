package student_alexander_bogachenkov.lesson14_30072020.homeworks.level_5.task_34;

import org.junit.Test;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    @Test
    public void isAnyTraderWorkingInCityMilan() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();
        boolean actual = service.isAnyTraderWorkingInCity(data.getTransactions(), "Milan");
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void isAnyTraderWorkingInCityCambridge() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();
        boolean actual = service.isAnyTraderWorkingInCity(data.getTransactions(), "Cambridge");
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void isAnyTraderWorkingInCityLondon() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();
        boolean actual = service.isAnyTraderWorkingInCity(data.getTransactions(), "London");
        boolean expected = false;
        assertEquals(expected, actual);
    }
}