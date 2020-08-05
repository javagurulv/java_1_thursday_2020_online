package student_vadims_vladisevs.lesson_14.level_6;

import org.junit.Test;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
    TransactionTestData transactionTestData = new TransactionTestData();
    List<Transaction> allTransactions = transactionTestData.getTransactions();

    @Test
    public void theBiggestValueV1() {
        Optional<Integer> actual = transactionAnalysisService.theBiggestValueV1(allTransactions);
        Optional<Integer> expected = Optional.of(1000);
        assertEquals(expected, actual);
    }

    @Test
    public void theBiggestValueV2() {
        OptionalInt actual = transactionAnalysisService.theBiggestValueV2(allTransactions);
        OptionalInt expected = OptionalInt.of(1000);
        assertEquals(expected, actual);
    }

    @Test
    public void theSmallestValueV1() {
        Optional<Integer> actual = transactionAnalysisService.theSmallestValueV1(allTransactions);
        Optional<Integer> expected = Optional.of(300);
        assertEquals(expected, actual);
    }

    @Test
    public void theSmallestValueV2() {
        OptionalInt actual = transactionAnalysisService.theSmallestValueV2(allTransactions);
        OptionalInt expected = OptionalInt.of(300);
        assertEquals(expected, actual);
    }

    @Test
    public void tradersNameAlphabet() {
        String actual = transactionAnalysisService.tradersNameAlphabet(allTransactions);
        assertEquals("Alan,Brian,Mario,Raoul", actual);
    }

    @Test
    public void tradersCitiesAlphabet() {
        String actual = transactionAnalysisService.tradersCitiesAlphabet(allTransactions);
        assertEquals("Cambridge,Milan", actual);
    }


}