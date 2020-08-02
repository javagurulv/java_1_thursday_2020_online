package student_alexander_bogachenkov.lesson14_30072020.homeworks.level_4.task_26;

import org.junit.Test;
import java.util.Set;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    @Test
    public void shouldReturnAllUniqueYearsWhenTransactionsWerePassed() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();
        Set<Integer> actual = service.getAllUniqueYearsWhenTransactionsWerePassed(data.getTransactions());
        assertTrue(actual.contains(Integer.valueOf("2011")));
        assertTrue(actual.contains(Integer.valueOf("2012")));
        assertEquals(2, actual.size());
    }
}