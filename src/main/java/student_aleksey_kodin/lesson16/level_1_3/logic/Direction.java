package student_aleksey_kodin.lesson16.level_1_3.logic;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Direction {
    public Directions getDirectionRotateLeft(Directions currentDirection) {
        return switch (currentDirection) {
            case N -> Directions.W;
            case W -> Directions.S;
            case S -> Directions.E;
            case E -> Directions.N;
        };
    }

    public Directions getDirectionRotateRight(Directions currentDirection) {
        return switch (currentDirection) {
            case N -> Directions.E;
            case E -> Directions.S;
            case S -> Directions.W;
            case W -> Directions.N;
        };
    }
}
