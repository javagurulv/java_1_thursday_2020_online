package student_alexander_bogachenkov.lesson12_16072020.homeworks.level_3.task_20;

class MultiCatchExample {

    public static void main(String[] args) {
        try {

        } catch (ArithmeticException a) {

        } catch (Exception e) {

        }
        // Судя по иерархии наследования, класс Exception
        // находится выше, чем класс ArithmeticException,
        // поэтому исключение этого класса необходимо обработать первее.
    }
}
