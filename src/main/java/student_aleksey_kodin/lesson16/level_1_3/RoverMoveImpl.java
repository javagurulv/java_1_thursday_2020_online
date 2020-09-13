package student_aleksey_kodin.lesson16.level_1_3;

import student_aleksey_kodin.lesson16.level_1_3.Domain.Plateau;
import student_aleksey_kodin.lesson16.level_1_3.Domain.Rover;
import student_aleksey_kodin.lesson16.level_1_3.Logic.Direction;
import student_aleksey_kodin.lesson16.level_1_3.Logic.Instructions;

public class RoverMoveImpl implements RoverMove {
    private final Plateau plateau;
    private final Rover rover;
    private final Direction setDirection = new Direction();


    public RoverMoveImpl(Plateau plateau, Rover rover) {
        this.plateau = plateau;
        this.rover = rover;
    }

    @Override
    public void move(Instructions instruction) {
        while (instruction.isInstructions()) {
            switch (instruction.getInstruction()) {
                case 'L' -> rover.setDirection(setDirection.getDirectionRotateLeft(rover.getDirection()));
                case 'R' -> rover.setDirection(setDirection.getDirectionRotateRight(rover.getDirection()));
                case 'M' -> {
                    switch (rover.getDirection()) {
                        case N -> {
                            if (!(isAreaFreeForMoveCoordinateY(rover.getCoordinateY() + 1))) break;
                            if (isCorrectCoordinate(plateau.getCoordinateY(), rover.getCoordinateY(), 1)) {
                                rover.setCoordinateY(rover.getCoordinateY() + 1);
                            }
                        }
                        case E -> {
                            if (!(isAreaFreeForMoveCoordinateX(rover.getCoordinateX() + 1))) break;
                            if (isCorrectCoordinate(plateau.getCoordinateX(), rover.getCoordinateX(), 1)) {
                                rover.setCoordinateX(rover.getCoordinateX() + 1);
                            }
                        }
                        case W -> {
                            if (!(isAreaFreeForMoveCoordinateX(rover.getCoordinateX() - 1))) break;
                            if (isCorrectCoordinate(plateau.getCoordinateX(), rover.getCoordinateX(), -1)) {
                                rover.setCoordinateX(rover.getCoordinateX() - 1);
                            }
                        }
                        case S -> {
                            if (!(isAreaFreeForMoveCoordinateY(rover.getCoordinateY() - 1))) break;
                            if (isCorrectCoordinate(plateau.getCoordinateY(), rover.getCoordinateY(), -1)) {
                                rover.setCoordinateY(rover.getCoordinateY() - 1);
                            }
                        }
                    }
                }
            }
            instruction.setNextInstruction();
        }
    }

    private Boolean isCorrectCoordinate(int plateauCoordinate, int roverCoordinate, int movePosition) {
        if (movePosition == -1) {
            return (roverCoordinate - 1) >= 0;
        }
        return plateauCoordinate >= roverCoordinate + 1;
    }

    private Boolean isAreaFreeForMoveCoordinateX(int roverNewCoordinate) {
        return plateau.getAllRovers().stream().map(Rover::getCoordinateX).noneMatch(r -> r == roverNewCoordinate);
    }

    private Boolean isAreaFreeForMoveCoordinateY(int roverNewCoordinate) {
        return plateau.getAllRovers().stream().map(Rover::getCoordinateY).noneMatch(r -> r == roverNewCoordinate);
    }
}
