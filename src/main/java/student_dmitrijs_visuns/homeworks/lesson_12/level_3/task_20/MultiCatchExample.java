package student_dmitrijs_visuns.homeworks.lesson_12.level_3.task_20;

class MultiCatchExample {

    // ArithmeticException является подклассом RuntimeException, который в иерархии классов java.lang стоит ниже,
    // чем Exception. Сперва ловим unchecked исключения, затем checked исключения.

    public static void main(String[] args) {

        try {

        } catch (ArithmeticException a) {

        } catch (Exception e) {


        }
    }

}
