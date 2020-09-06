package student_aleksey_kodin.lesson16.level_1_3.Logic;

public class Instructions {
    private String instructions = "";
    private final int EMPTY_STRING = 0;

    public void setInstruction(String instructions) {
        this.instructions = instructions;
    }

    public char getInstruction() {
        final int GET_FIRST_SYMBOL = 0;
        if (instructions.length() == EMPTY_STRING) {
            return ' ';
        }
        return instructions.charAt(GET_FIRST_SYMBOL);
    }

    public void setNextInstruction() {
        final int INSTRUCTIONS_NEW_START_POSITION = 1;
        if (instructions.length() == EMPTY_STRING) {
            instructions = "";
        } else {
            instructions = instructions.substring(INSTRUCTIONS_NEW_START_POSITION);
        }
    }

    public Boolean isInstructions() {
        return instructions.length() > EMPTY_STRING;
    }
}
