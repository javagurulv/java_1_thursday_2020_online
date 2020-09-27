package student_aleksey_kodin.lesson16.level_4;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;
import teacher.codereview.CodeReviewStudentAnswer;

@CodeReview(approved = false)
@CodeReviewStudentAnswer(approved = true)
class MarsRover {

    @CodeReviewComment(teacher = "Split this method to small ones!")
    @CodeReviewComment(teacher = "I want to see clear method names and not a bunch of if statements.")
    public static String move(int x, int y, char direction, String instructions) {
        char newDirection = direction;
        int newCoordinateX = x;
        int newCoordinateY = y;

        if (instructions.isEmpty()) {
            return x + " " + y + " " + direction;
        }

        switch (getInstruction(instructions)) {
            case 'L' -> newDirection = getDirectionLeft(direction);
            case 'R' -> newDirection = getDirectionRight(direction);
            case 'M' -> {
                switch (newDirection) {
                    case 'N' -> newCoordinateY = makeMove(newCoordinateY, 1);
                    case 'S' -> newCoordinateY = makeMove(newCoordinateY, -1);
                    case 'W' -> newCoordinateX = makeMove(newCoordinateX, -1);
                    case 'E' -> newCoordinateX = makeMove(newCoordinateX, 1);
                }
            }
        }
        return move(newCoordinateX, newCoordinateY, newDirection, getNextInstructions(instructions));
    }

    private static char getDirectionLeft(char direction) {
        return switch (direction) {
            case 'N' -> 'W';
            case 'W' -> 'S';
            case 'S' -> 'E';
            case 'E' -> 'N';
            default -> throw new IllegalStateException("Unexpected value: " + direction);
        };
    }

    private static char getDirectionRight(char direction) {
        return switch (direction) {
            case 'N' -> 'E';
            case 'E' -> 'S';
            case 'S' -> 'W';
            case 'W' -> 'N';
            default -> throw new IllegalStateException("Unexpected value: " + direction);
        };
    }

    private static char getInstruction(String instructions) {
        return instructions.charAt(0);
    }

    private static int makeMove(int coordinate, int value) {
        return coordinate + value;
    }

    private static String getNextInstructions(String instructions) {
        return instructions.substring(1);
    }
}
