package student_vadims_vladisevs.lesson_14.level_5;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
    TransactionTestData transactionTestData = new TransactionTestData();
    List<Transaction> allTransactions = transactionTestData.getTransactions();

    @Test
    public void isAnyTraderFromMilanV1() {
        boolean actual = transactionAnalysisService.isAnyTraderFromMilanV1(allTransactions);
        assertTrue(actual);
    }

    @Test
    public void isAnyTraderFromMilanV2() {
        boolean actual = transactionAnalysisService.isAnyTraderFromMilanV2(allTransactions);
        assertTrue(actual);
    }

    @Test
    public void isAnyTraderFromInterestedCity_Cambridge() {
        boolean actual = transactionAnalysisService.isAnyTraderFromInterestedCity(allTransactions, "Cambridge");
        assertTrue(actual);
    }

    @Test
    public void isAnyTraderFromInterestedCity_Milan() {
        boolean actual = transactionAnalysisService.isAnyTraderFromInterestedCity(allTransactions, "Milan");
        assertTrue(actual);
    }

    @Test
    public void isAnyTraderFromInterestedCity_London() {
        boolean actual = transactionAnalysisService.isAnyTraderFromInterestedCity(allTransactions, "London");
        assertFalse(actual);
    }
}