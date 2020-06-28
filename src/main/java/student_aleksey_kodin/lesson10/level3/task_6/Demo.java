package student_aleksey_kodin.lesson10.level3.task_6;

class Demo {

    public static void main(String[] args) {
        Check check = new Check();
        check.checker(10);
        check.checker(105);

        check.checker_2(10);
        check.checker_2(105);



    }
}

class Check {

    public void checker(int x) {

        Functional pattern = p -> p > 100;

        boolean result = pattern.checkValue(x);

        System.out.println("Check:" + x + " Result:" + result);
    }

    public void checker_2(int x) {

        Functional pattern = p -> p < 100;

        boolean result = pattern.checkValue(x);

        System.out.println("Check:" + x + " Result:" + result);
    }
}
