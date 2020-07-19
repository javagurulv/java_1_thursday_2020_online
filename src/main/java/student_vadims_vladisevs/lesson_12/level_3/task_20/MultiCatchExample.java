package student_vadims_vladisevs.lesson_12.level_3.task_20;

class MultiCatchExample {
    public static void main(String[] args) {
        try {

        } catch (ArithmeticException a) {

        } catch (Exception e) {
        }
    }
}

/*
Class ArithmeticException:
java.lang.Object
    java.lang.Throwable
        java.lang.Exception
            java.lang.RuntimeException
                java.lang.ArithmeticException

Сначала нужно отлавливать ошибки более низжих классов.
 */
