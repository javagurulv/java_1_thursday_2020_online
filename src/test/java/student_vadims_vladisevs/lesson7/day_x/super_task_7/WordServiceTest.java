package student_vadims_vladisevs.lesson7.day_x.super_task_7;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordServiceTest {

    @Test
    public void findMostFrequentWord() {
        WordService wordService = new WordService();
        String result = wordService.findMostFrequentWord("Это текст просто текст просто просто");
        System.out.println(result);
        assertEquals("просто", result);
    }
}