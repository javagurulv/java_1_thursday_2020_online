package student_aleksey_kodin.lesson12.level3.task_18;

// NullPointerException выдается, когда приложение пытается использовать нулевое значение в случае,
// когда требуется объект.

class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String string = null;

        if (string.equals("string")) {
            System.out.println("Ok");
        }
    }
}
