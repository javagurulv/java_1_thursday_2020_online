package student_aleksey_kodin.lesson12.level3.task_20;

class MultiCatchExample {
    public static void main(String[] args) {
        try {

        } catch (ArithmeticException a) {

        } catch (Exception e) {

        }
    }
}

// В иерархии наследованя класс Exception нходится выше чем класс ArithmeticException. Поэтому сначало
// надо обработать исключения более низших классов.