package student_aleksey_kodin.lesson16.level_1_3.domain;

import student_aleksey_kodin.lesson16.level_1_3.logic.Directions;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Rover {
    private int coordinateX;
    private int coordinateY;
    private Directions direction;

    public Rover(int coordinateX, int coordinateY, Directions direction) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.direction = direction;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public Directions getDirection() {
        return direction;
    }

    public void setDirection(Directions direction) {
        this.direction = direction;
    }
}
