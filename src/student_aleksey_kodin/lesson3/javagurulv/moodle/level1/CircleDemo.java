package student_aleksey_kodin.lesson3.javagurulv.moodle.level1;

class CircleDemo {

    public static void main(String[] args) {

        Circle Circle = new Circle(5.05);
        System.out.println("Circle Radius - " + Circle.getRadius());
        System.out.println("Circle Area - " + Circle.getCircleArea());

        Circle.setRadius(10.15);
        System.out.println("Circle Radius - " + Circle.getRadius());
        System.out.println("Circle Area - " + Circle.getCircleArea());

        Circle.setRadius(15.25);
        System.out.println("Circle Radius - " + Circle.getRadius());
        System.out.println("Circle Area - " + Circle.getCircleArea());
    }
}
