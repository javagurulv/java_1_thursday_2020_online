package student_alexander_bogachenkov.lesson12_16072020.homeworks.level_1.task_5;

class ExceptionDemo {

    public static void main(String[] args) {
        Exception exception1 = new Exception();
        Exception exception2 = new Exception("testException");
        Exception exception3 = new Exception("testException", new Throwable());
        Exception exception4 = new Exception(new Throwable());
    }

}
