package student_aleksey_kodin.lesson16.level_1_3.logic;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
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

    @CodeReviewComment(teacher = "Why use big Boolean here? May be just boolean will be enough?")
    @CodeReviewComment(student = "Change")
    public boolean isInstructions() {
        return instructions.length() > EMPTY_STRING;
    }
}
