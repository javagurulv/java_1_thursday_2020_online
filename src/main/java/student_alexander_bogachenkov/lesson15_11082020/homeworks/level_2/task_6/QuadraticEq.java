package student_alexander_bogachenkov.lesson15_11082020.homeworks.level_2.task_6;

class QuadraticEq {

    public String calc(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            return whenDiscriminantIsOverZero(a, b, discriminant);
        } else if (discriminant == 0) {
            return whenDiscriminantEqualsZero(a, b);
        } else {
            return discriminantIsLessThanZero();
        }
    }

    private String whenDiscriminantIsOverZero(double a, double b, double discriminant) {
        double x1, x2;
        x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
        x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
        return "x1 = " + x1 + ", x2 = " + x2;
    }

    private String whenDiscriminantEqualsZero(double a, double b) {
        double x;
        x = -b / (2 * a);
        return "x = " + x;
    }

    private String discriminantIsLessThanZero() {
        return "Equation has no roots";
    }

}