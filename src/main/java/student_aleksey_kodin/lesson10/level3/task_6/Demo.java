package student_aleksey_kodin.lesson10.level3.task_6;

class Demo {

    public static void main(String[] args) {
        Check check = new Check();
        check.checker(10);
        check.checker(105);
    }
}

class Check {

    public void checker(int x) {
        //Функциональный интерфейс должен содержать ровно один абстрактный метод.
        Functional pattern = p -> p > 100;

        boolean result = pattern.checkSum(x);

        System.out.println(result);
    }
}
