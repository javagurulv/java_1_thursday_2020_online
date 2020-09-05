package student_alexander_bogachenkov.lesson15_11082020.homeworks.level_2.task_5;

class QuadraticEq {

    public void calc(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            whenDiscriminantIsOverZero(a, b, discriminant);
        }
        else if (discriminant == 0) {
            whenDiscriminantEqualsZero(a, b);
        }
        else {
            System.out.println("Equation has no roots");
        }
    }

    private void whenDiscriminantIsOverZero(double a, double b, double discriminant) {
        double x1, x2;
        x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
        x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
        System.out.println("x1 = " + x1 + ", x2 = " + x2);
    }

    private void whenDiscriminantEqualsZero(double a, double b) {
        double x;
        x = -b / (2 * a);
        System.out.println("x = " + x);
    }

}