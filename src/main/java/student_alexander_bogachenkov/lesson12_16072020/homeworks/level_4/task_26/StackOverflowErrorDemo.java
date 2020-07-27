package student_alexander_bogachenkov.lesson12_16072020.homeworks.level_4.task_26;

class StackOverflowErrorDemo {

    public static void main(String[] args) {
        StackOverflowErrorDemo demo = new StackOverflowErrorDemo();
        demo.recursion();
    }

    void recursion() {
        recursion();
    }

}
