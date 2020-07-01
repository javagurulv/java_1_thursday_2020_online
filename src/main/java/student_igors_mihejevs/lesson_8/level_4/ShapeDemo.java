package student_igors_mihejevs.lesson_8.level_4;

class ShapeDemo {

    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(5);

        System.out.println("Shape = " + circle.getTitle());
        System.out.println("Radius = " + ((Circle) circle).getRadius());
        System.out.println("Area = " + circle.calculateArea());
        System.out.println("Perimeter = " + circle.calculatePerimeter() + "\n");

        System.out.println("Shape = " + square.getTitle());
        System.out.println("Side = " + ((Square) square).getSide());
        System.out.println("Area = " + square.calculateArea());
        System.out.println("Perimeter = " + square.calculatePerimeter());


    }

}
