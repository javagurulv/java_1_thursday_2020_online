package student_aleksey_kodin.lesson16.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Rectangle {
    final int startCoordinateX;
    final int height;
    final int width;

    public Rectangle(int startCoordinateX, int height, int width) {
        this.startCoordinateX = startCoordinateX;
        this.height = height;
        this.width = width;
    }

    public int getStartCoordinateX() {
        return startCoordinateX;
    }

    public int getFinishCoordinateX() {
        return startCoordinateX + width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
