package student_aleksey_kodin.lesson16.level_4;

class MarsRover {
    public static String move(int x, int y, char direction, String instructions) {
        if (!instructions.isEmpty()) {
            char instruction = instructions.charAt(0);
            if (instruction == 'L') {
                return move(x, y, getDirectionLeft(direction), getNextInstructions(instructions));
            }
            if (instruction == 'R') {
                return move(x, y, getDirectionRight(direction), getNextInstructions(instructions));
            }
            if (instruction == 'M') {
                int newCoordinateX = 0;
                int newCoordinateY = 0;
                char newDirection = ' ';
                if (direction == 'N') {
                    newCoordinateX = x;
                    newCoordinateY = y + 1;
                    newDirection = 'N';
                }
                if (direction == 'S') {
                    newCoordinateX = x;
                    newCoordinateY = y - 1;
                    newDirection = 'S';
                }
                if (direction == 'W') {
                    newCoordinateX = x - 1;
                    newCoordinateY = y;
                    newDirection = 'W';
                }
                if (direction == 'E') {
                    newCoordinateX = x + 1;
                    newCoordinateY = y;
                    newDirection = 'E';
                }
                return move(newCoordinateX, newCoordinateY, newDirection, getNextInstructions(instructions));
            }
        }
        return x + " " + y + " " + direction;
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

    private static String getNextInstructions(String instructions) {
        return instructions.substring(1);
    }
}
