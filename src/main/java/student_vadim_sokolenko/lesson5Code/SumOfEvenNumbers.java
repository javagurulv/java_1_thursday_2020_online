package student_vadim_sokolenko.lesson5Code;

class SumOfEvenNumbers {

    public static void main(String[] args) {


        int sum = 0;
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                sum += i;
                System.out.println("i =" + i + "; sum "+  sum);
            }
            System.out.println("Result " +  sum);
            }
        }
    }



