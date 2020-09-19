package student_aleksey_kodin.lesson16.level_1_3.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class InstructionsTest {
    Instructions instruction = new Instructions();

    @Test
    public void testNoInstructions() {
        boolean result = instruction.isInstructions();

        assertFalse(result);
    }

    @Test
    public void testGetInstruction_No_Instructions() {
        char result = instruction.getInstruction();

        assertEquals(result, ' ');
    }

    @Test
    public void testGetInstruction() {
        instruction.setInstruction("L");
        char result = instruction.getInstruction();

        assertEquals(result, 'L');
    }
}