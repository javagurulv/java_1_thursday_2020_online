package student_vadim_sokolenko.lesson5Code;

class ContinueExample {
    public static void main(String[] args) {
        for (int i = 0; i < 101; i++) {
            if (i >= 50 && i <= 70){
            continue;
            }
            System.out.println(i);
        }
    }
}
