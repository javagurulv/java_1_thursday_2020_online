package student_aleksey_kodin.lesson12.level1.task_5;

class ExceptionDemo extends Exception {
    ExceptionDemo() {
    }

    ExceptionDemo(String message) {
        super(message);
    }

    ExceptionDemo(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    ExceptionDemo(Throwable cause) {
        super(cause);
    }
}
