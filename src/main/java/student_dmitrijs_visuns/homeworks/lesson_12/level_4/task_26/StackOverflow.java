package student_dmitrijs_visuns.homeworks.lesson_12.level_4.task_26;

class StackOverflow {

    public static void main(String[] args) {
        StackOverflow over = new StackOverflow();
        over.overFlow();


    }

    public void overFlow () {
        System.out.println("Еще один шажок к Stack Overflow");
        overFlow();
    }

}
