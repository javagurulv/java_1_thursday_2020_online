package student_vadims_vladisevs.lesson_12.level_1.task_5;

class ExceptionDemo extends Exception{

    ExceptionDemo(){

    }

    ExceptionDemo(String message){
        super(message);
    }

    ExceptionDemo(String message, Throwable cause){
        super(message, cause);
    }

    ExceptionDemo(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace){
        super(message, cause, enableSuppression, writableStackTrace);
    }

    ExceptionDemo(Throwable cause){
        super(cause);
    }


}
