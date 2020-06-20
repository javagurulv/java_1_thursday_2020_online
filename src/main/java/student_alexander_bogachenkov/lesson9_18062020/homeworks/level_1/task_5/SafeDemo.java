package student_alexander_bogachenkov.lesson9_18062020.homeworks.level_1.task_5;

class SafeDemo {

    public static void main(String[] args) {
        Safe safe = new Safe(1342, 45.00);
        System.out.println(safe.toString());
        safe.putMoney(1342, 5.00);
        System.out.println(safe.toString());
        //деньги зачислились
        safe.getMoney(0123, 40.00);
        System.out.println(safe.toString());
        //деньги не списались
    }

}
