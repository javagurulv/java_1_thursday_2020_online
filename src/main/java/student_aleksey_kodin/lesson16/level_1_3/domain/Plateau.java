package student_aleksey_kodin.lesson16.level_1_3.domain;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "for package name use only small letters! (Domain -> domain)")
@CodeReviewComment(student = "Renamed packages names")
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
