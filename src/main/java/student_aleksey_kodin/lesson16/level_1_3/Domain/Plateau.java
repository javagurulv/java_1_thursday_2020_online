package student_aleksey_kodin.lesson16.level_1_3.Domain;

import java.util.ArrayList;
import java.util.List;

public class Plateau {
    private final int coordinateX;
    private final int coordinateY;
    private final List<Rover> allRovers = new ArrayList<>();

    public Plateau(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void addRover(Rover rover) {
        allRovers.add(rover);
    }

    public List<Rover> getAllRovers() {
        return allRovers;
    }
}
