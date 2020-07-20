package student_vadims_vladisevs.lesson_12.level_3.task_21;

class Main {
    public static void main(String args[]) {
        try {
            throw new TestException();
        } catch(TestException t) {
            System.out.println("Got the Test Exception");
        } finally {
            System.out.println("Inside finally block ");
        }
    }
}

/*
Мы получим 1. результат -  Got the Test Exception & Inside finally block
Если в коде есть finally, то это означает, что действие будет выполнено не зависимо от результата.
 */
