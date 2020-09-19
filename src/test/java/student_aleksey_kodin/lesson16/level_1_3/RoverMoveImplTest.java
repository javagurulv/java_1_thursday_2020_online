package student_aleksey_kodin.lesson16.level_1_3;

import org.junit.Test;
import student_aleksey_kodin.lesson16.level_1_3.domain.Plateau;
import student_aleksey_kodin.lesson16.level_1_3.domain.Rover;
import student_aleksey_kodin.lesson16.level_1_3.logic.Directions;
import student_aleksey_kodin.lesson16.level_1_3.logic.Instructions;
import static org.junit.Assert.*;

public class RoverMoveImplTest {

    @Test
    public void test_1() {
        Plateau plateau = new Plateau(5, 5);
        Rover rover = new Rover(1, 2, Directions.N);
        Instructions instructions = new Instructions();
        instructions.setInstruction("LMLMLMLMM");

        RoverMoveImpl roverMove = new RoverMoveImpl(plateau, rover);
        roverMove.move(instructions);

        assertEquals(rover.getCoordinateX(), 1);
        assertEquals(rover.getCoordinateY(), 3);
        assertEquals(rover.getDirection(), Directions.N);
    }

    @Test
    public void test_2() {
        Plateau plateau = new Plateau(5, 5);
        Rover rover = new Rover(3, 3, Directions.E);
        Instructions instructions = new Instructions();
        instructions.setInstruction("MMRMMRMRRM");

        RoverMoveImpl roverMove = new RoverMoveImpl(plateau, rover);
        roverMove.move(instructions);

        assertEquals(rover.getCoordinateX(), 5);
        assertEquals(rover.getCoordinateY(), 1);
        assertEquals(rover.getDirection(), Directions.E);
    }

    @Test
    public void testOutPlateau_1() {
        Plateau plateau = new Plateau(5, 5);
        Rover rover = new Rover(0, 0, Directions.S);
        Instructions instructions = new Instructions();
        instructions.setInstruction("M");

        RoverMoveImpl roverMove = new RoverMoveImpl(plateau, rover);
        roverMove.move(instructions);

        assertEquals(rover.getCoordinateX(), 0);
        assertEquals(rover.getCoordinateY(), 0);
        assertEquals(rover.getDirection(), Directions.S);
    }

    @Test
    public void testOutPlateau_2() {
        Plateau plateau = new Plateau(5, 5);
        Rover rover = new Rover(0, 0, Directions.W);
        Instructions instructions = new Instructions();
        instructions.setInstruction("M");

        RoverMoveImpl roverMove = new RoverMoveImpl(plateau, rover);
        roverMove.move(instructions);

        assertEquals(rover.getCoordinateX(), 0);
        assertEquals(rover.getCoordinateY(), 0);
        assertEquals(rover.getDirection(), Directions.W);
    }

    @Test
    public void testOutPlateau_3() {
        Plateau plateau = new Plateau(5, 5);
        Rover rover = new Rover(5, 5, Directions.N);
        Instructions instructions = new Instructions();
        instructions.setInstruction("M");

        RoverMoveImpl roverMove = new RoverMoveImpl(plateau, rover);
        roverMove.move(instructions);

        assertEquals(rover.getCoordinateX(), 5);
        assertEquals(rover.getCoordinateY(), 5);
        assertEquals(rover.getDirection(), Directions.N);
    }

    @Test
    public void testOutPlateau_4() {
        Plateau plateau = new Plateau(5, 5);
        Rover rover = new Rover(5, 5, Directions.E);
        Instructions instructions = new Instructions();
        instructions.setInstruction("M");

        RoverMoveImpl roverMove = new RoverMoveImpl(plateau, rover);
        roverMove.move(instructions);

        assertEquals(rover.getCoordinateX(), 5);
        assertEquals(rover.getCoordinateY(), 5);
        assertEquals(rover.getDirection(), Directions.E);
    }

    @Test
    public void roverNoMove_1() {
        Plateau plateau = new Plateau(5, 5);
        Rover rover1 = new Rover(0, 0, Directions.E);
        Rover rover2 = new Rover(1, 0, Directions.W);
        plateau.addRover(rover1);
        plateau.addRover(rover2);
        Instructions instructions = new Instructions();
        instructions.setInstruction("M");

        RoverMoveImpl roverMove = new RoverMoveImpl(plateau, rover2);
        roverMove.move(instructions);

        assertEquals(rover2.getCoordinateX(), 1);
    }

    @Test
    public void roverNoMove_2() {
        Plateau plateau = new Plateau(5, 5);
        Rover rover1 = new Rover(4, 0, Directions.N);
        Rover rover2 = new Rover(3, 0, Directions.E);
        plateau.addRover(rover1);
        plateau.addRover(rover2);
        Instructions instructions = new Instructions();
        instructions.setInstruction("M");

        RoverMoveImpl roverMove = new RoverMoveImpl(plateau, rover2);
        roverMove.move(instructions);

        assertEquals(rover2.getCoordinateX(), 3);
    }

    @Test
    public void roverNoMove_3() {
        Plateau plateau = new Plateau(5, 5);
        Rover rover1 = new Rover(4, 2, Directions.N);
        Rover rover2 = new Rover(3, 1, Directions.N);
        plateau.addRover(rover1);
        plateau.addRover(rover2);
        Instructions instructions = new Instructions();
        instructions.setInstruction("M");

        RoverMoveImpl roverMove = new RoverMoveImpl(plateau, rover2);
        roverMove.move(instructions);

        assertEquals(rover2.getCoordinateY(), 1);
    }

    @Test
    public void roverNoMove_4() {
        Plateau plateau = new Plateau(5, 5);
        Rover rover1 = new Rover(4, 3, Directions.N);
        Rover rover2 = new Rover(3, 4, Directions.S);
        plateau.addRover(rover1);
        plateau.addRover(rover2);
        Instructions instructions = new Instructions();
        instructions.setInstruction("M");

        RoverMoveImpl roverMove = new RoverMoveImpl(plateau, rover2);
        roverMove.move(instructions);

        assertEquals(rover2.getCoordinateY(), 4);
    }
}