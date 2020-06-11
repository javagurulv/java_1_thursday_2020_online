package student_aleksey_kodin.lesson8.javaguru.lv.moodle.level2;

class Demo {
    public static void main(String[] args) {

        Shape[] shapes = { new Square(6),
                           new Circle(15),
                           new Rectangle(8,9)};

        for (Shape shape: shapes) {
            System.out.println(shape.getName() + " : " + shape.getArea());
        }
    }
}
