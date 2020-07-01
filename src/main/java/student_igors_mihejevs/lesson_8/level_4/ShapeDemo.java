package student_igors_mihejevs.lesson_8.level_4;

import java.text.DecimalFormat;

class ShapeDemo {

    public static void main(String[] args) {
        final DecimalFormat df = new DecimalFormat("0.00");
        Shape circle = new Circle(5);

        System.out.println("Shape = " + circle.getTitle());
        System.out.println("Radius = " + ((Circle) circle).getRadius());
        System.out.println("Area = " + df.format(circle.calculateArea()));
        System.out.println("Perimeter = " + df.format(circle.calculatePerimeter()));
    }

}
