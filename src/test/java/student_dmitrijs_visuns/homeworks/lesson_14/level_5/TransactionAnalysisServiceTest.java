package student_dmitrijs_visuns.homeworks.lesson_14.level_5;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    @Test
    public void shouldGetTrueForCambridge () {
        TransactionAnalysisService testService = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();

        boolean result = testService.isAnyTraderBasedOnCity
                (testData.getTransactions(),
                "Cambridge");
        assertTrue(result);
    }

    @Test
    public void shouldGetTrueForMilan () {
        TransactionAnalysisService testService = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();

        boolean result = testService.isAnyTraderBasedOnCity
                (testData.getTransactions(),
                        "Milan");
        assertTrue(result);
    }

    @Test
    public void shouldGetFalseForBangkok () {
        TransactionAnalysisService testService = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();

        boolean result = testService.isAnyTraderBasedOnCity
                (testData.getTransactions(),
                        "Bangkok");
        assertFalse(result);
    }

}