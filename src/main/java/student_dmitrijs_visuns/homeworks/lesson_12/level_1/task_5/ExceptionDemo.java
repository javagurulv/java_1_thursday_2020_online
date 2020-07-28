package student_dmitrijs_visuns.homeworks.lesson_12.level_1.task_5;

class ExceptionDemo extends Exception{


        public ExceptionDemo () { }


        public ExceptionDemo (String message) {
            super(message);

        }

        public ExceptionDemo (String message, Throwable cause) {
            super(message);
        }


    public static void main(String[] args) {
      ExceptionDemo ex1 = new ExceptionDemo();
      ExceptionDemo ex2 = new ExceptionDemo("Checked Exception!");
      ExceptionDemo ex3 = new ExceptionDemo("Checked Exception!", null);

    }

}
