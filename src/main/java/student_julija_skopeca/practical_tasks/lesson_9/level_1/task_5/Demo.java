package student_julija_skopeca.practical_tasks.lesson_9.level_1.task_5;

class Demo {
    public static void main(String[] args) {
        Safe safe = new Safe(1111,0);
        safe.putMoney(1111,10);
        safe.getSafeBalance();
        safe.getMoney(1112,5);
        safe.getSafeBalance();
    }
}
