package student_aleksey_kodin.lesson8.level6.task_30;

public class Demo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        int result = demo.numberSum(2,3,4);
        System.out.println("The sum numbers 2,3,4 is " + result);
    }
    private int numberSum(int ... number) {
        int sum = 0;
        for (int value : number) {
            sum = sum + value;
        }
    return sum;
    }
}
