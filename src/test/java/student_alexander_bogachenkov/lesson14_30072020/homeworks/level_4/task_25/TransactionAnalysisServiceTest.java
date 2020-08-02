package student_alexander_bogachenkov.lesson14_30072020.homeworks.level_4.task_25;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    @Test
    public void getAllYearsWhenTransactionsWerePassed() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();
        List<Integer> actual = service.getAllYearsWhenTransactionsWerePassed(data.getTransactions());
        assertEquals(Integer.valueOf("2011"), actual.get(0));
        assertEquals(Integer.valueOf("2012"), actual.get(1));
        assertEquals(Integer.valueOf("2011"), actual.get(2));
        assertEquals(Integer.valueOf("2012"), actual.get(3));
        assertEquals(Integer.valueOf("2012"), actual.get(5));
        assertEquals(Integer.valueOf("2012"), actual.get(4));
    }
}