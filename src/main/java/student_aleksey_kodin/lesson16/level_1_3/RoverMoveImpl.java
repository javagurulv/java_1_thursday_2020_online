package student_aleksey_kodin.lesson16.level_1_3;

import student_aleksey_kodin.lesson16.level_1_3.domain.Plateau;
import student_aleksey_kodin.lesson16.level_1_3.domain.Rover;
import student_aleksey_kodin.lesson16.level_1_3.logic.Direction;
import student_aleksey_kodin.lesson16.level_1_3.logic.Instructions;
import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;
import teacher.codereview.CodeReviewStudentAnswer;

@CodeReview(approved = false)
@CodeReviewStudentAnswer(approved = true)
public class RoverMoveImpl implements RoverMove {
    private final Plateau plateau;
    private final Rover rover;
    private final Direction setDirection = new Direction();


    public RoverMoveImpl(Plateau plateau, Rover rover) {
        this.plateau = plateau;
        this.rover = rover;
    }

    @Override
    @CodeReviewComment(teacher = "Too big method ... find a way to split it to small ones.")
    @CodeReviewComment(teacher = "May be separate method for each switch case?")
    public void move(Instructions instruction) {
        while (instruction.isInstructions()) {
            switch (instruction.getInstruction()) {
                case 'L' -> rover.setDirection(setDirection.getDirectionRotateLeft(rover.getDirection()));
                case 'R' -> rover.setDirection(setDirection.getDirectionRotateRight(rover.getDirection()));
                case 'M' -> {
                    switch (rover.getDirection()) {
                        case N -> moveNorth();
                        case E -> moveEast();
                        case W -> moveWest();
                        case S -> moveSouth();
                    }
                }
            }
            instruction.setNextInstruction();
        }
    }

    private boolean isCorrectCoordinate(int plateauCoordinate, int roverCoordinate, int movePosition) {
        if (movePosition == -1) {
            return (roverCoordinate - 1) >= 0;
        }
        return plateauCoordinate >= roverCoordinate + 1;
    }

    private void moveNorth() {
        if (!(isAreaFreeForMoveCoordinateY(rover.getCoordinateY() + 1))) return;
        if (isCorrectCoordinate(plateau.getCoordinateY(), rover.getCoordinateY(), 1)) {
            rover.setCoordinateY(rover.getCoordinateY() + 1);
        }
    }

    private void moveEast() {
        if (!(isAreaFreeForMoveCoordinateX(rover.getCoordinateX() + 1))) return;
        if (isCorrectCoordinate(plateau.getCoordinateX(), rover.getCoordinateX(), 1)) {
            rover.setCoordinateX(rover.getCoordinateX() + 1);
        }
    }

    private void moveWest() {
        if (!(isAreaFreeForMoveCoordinateX(rover.getCoordinateX() - 1))) return;
        if (isCorrectCoordinate(plateau.getCoordinateX(), rover.getCoordinateX(), -1)) {
            rover.setCoordinateX(rover.getCoordinateX() - 1);
        }
    }

    private void moveSouth() {
        if (!(isAreaFreeForMoveCoordinateY(rover.getCoordinateY() - 1))) return;
        if (isCorrectCoordinate(plateau.getCoordinateY(), rover.getCoordinateY(), -1)) {
            rover.setCoordinateY(rover.getCoordinateY() - 1);
        }
    }

    private boolean isAreaFreeForMoveCoordinateX(int roverNewCoordinate) {
        return plateau.getAllRovers().stream().map(Rover::getCoordinateX).noneMatch(r -> r == roverNewCoordinate);
    }

    private boolean isAreaFreeForMoveCoordinateY(int roverNewCoordinate) {
        return plateau.getAllRovers().stream().map(Rover::getCoordinateY).noneMatch(r -> r == roverNewCoordinate);
    }
}
